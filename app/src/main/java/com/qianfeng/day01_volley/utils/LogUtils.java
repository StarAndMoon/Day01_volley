package com.qianfeng.day01_volley.utils;

import android.util.Log;

/**
 * Created by ${韩立志} on 15-11-19.
 */
public class LogUtils {
    public static void i(String value) {
        if (Config.isDebug) {
            Log.i(Config.TAG, value);
        }
    }
}
