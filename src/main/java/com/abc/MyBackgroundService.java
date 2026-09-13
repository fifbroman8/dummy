package com.abc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyBackgroundService extends Service {
    private static final String TAG = "ABC_BackgroundService";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "无图标应用：后台服务已成功初始化 (onCreate)");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "无图标应用：服务正在后台运行逻辑 (onStartCommand)");
        return START_STICKY; 
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "无图标应用：后台服务已销毁 (onDestroy)");
    }
}
