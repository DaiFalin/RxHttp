package com.dfl.rxhttp;

import android.app.Application;

import com.zhouyou.http.EasyHttp;

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EasyHttp.init(this);
        EasyHttp.getInstance()
                .debug(" Http日志", true)
                //设置全局URL
                .setBaseUrl("https://www.qchui.cn/");
    }
}
