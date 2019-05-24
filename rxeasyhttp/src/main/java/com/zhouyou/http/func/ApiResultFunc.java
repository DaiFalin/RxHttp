/*
 * Copyright (C) 2017 zhouyou(478319399@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zhouyou.http.func;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zhouyou.http.utils.Utils;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import okhttp3.ResponseBody;


/**
 * <p>描述：定义了ApiResult结果转换Func</p>
 * 作者： zhouyou<br>
 * 日期： 2017/3/15 16:52 <br>
 * 版本： v1.0<br>
 */
@SuppressWarnings("unchecked")
public class ApiResultFunc<T> implements Function<ResponseBody, T> {
    protected Type type;
    protected Gson gson;

    public ApiResultFunc(Type type) {
        gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
                .serializeNulls()
                .create();
        this.type = type;
    }

    @Override
    public T apply(@NonNull ResponseBody responseBody) throws Exception {
        T apiResult;
        final String json = responseBody.string();
        final Class<T> clazz = Utils.getClass(type, 0);
        if (clazz.equals(String.class)) {
            apiResult = (T) json;
        } else {
            apiResult = gson.fromJson(json, clazz);
        }
        return apiResult;
    }
}
