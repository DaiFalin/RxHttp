package com.dfl.rxhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zhouyou.http.EasyHttp;
import com.zhouyou.http.callback.CallBack;
import com.zhouyou.http.exception.ApiException;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyHttp.get("admin/public/sys/dict/type/SYS_CONFIG_H5")
                        .execute(new CallBack<String>() {
                            @Override
                            public void onStart() {

                            }

                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(ApiException e) {
                                Log.d(TAG, "onError: " + e.getMessage());
                            }

                            @Override
                            public void onSuccess(String s) {
                                Log.d(TAG, "onSuccess: " + s);
                            }
                        });
            }
        });
    }
}
