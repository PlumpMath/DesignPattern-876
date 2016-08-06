package com.caoyang.pattern;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.Logger;

/**
 * 主APP
 */
public class AppData extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initLogger();
    }
    private void initLogger() {
        Logger.init(BuildConfig.APPNAME);
    }
}
