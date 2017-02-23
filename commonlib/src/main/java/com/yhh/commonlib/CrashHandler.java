package com.yhh.commonlib;

import android.content.Context;
import android.util.Log;

/**
 * @Author YangKai
 * @Email yk_200842135@163.com
 * @Date 2016-12-21
 * @Description
 */
public class CrashHandler implements Thread.UncaughtExceptionHandler  {

//    public final Logger mLogger = Logger.getLogger(getClass());

    private static CrashHandler INSTANCE = new CrashHandler();
    private Thread.UncaughtExceptionHandler mDefaultUEH;
    private Context mContext;

    private CrashHandler() {
        mDefaultUEH = Thread.getDefaultUncaughtExceptionHandler();
    }

    public static CrashHandler getInstance() {
        return INSTANCE;
    }

    public void init(Context ctx) {
        Thread.setDefaultUncaughtExceptionHandler(this);
        mContext = ctx;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        Log.e("CrashHandler", ex.getMessage(), ex);
        mDefaultUEH.uncaughtException(thread, ex);
    }

}
