package com.yhh.cook;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.squareup.leakcanary.RefWatcher;
import com.yhh.commonlib.Constants;
import com.yhh.commonlib.CrashHandler;
import com.yhh.commonlib.util.FileUtils;
import com.yhh.domain.DomainInit;

import org.apache.log4j.Level;

import java.io.File;

import de.mindpipe.android.logging.log4j.LogConfigurator;

/**
 * Created by Administrator on 2017-02-23.
 */
public class SysApplication extends Application {
    private static SysApplication instance;

    private RefWatcher mRefWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        CrashHandler.getInstance().init(this);
        DomainInit.init(this);
//        mRefWatcher = Constants.DEBUG ?  LeakCanary.install(this) : RefWatcher.DISABLED;
        mRefWatcher = RefWatcher.DISABLED;
        Fresco.initialize(this);
        initLog4j();
    }

    public static SysApplication getInstance() {
        return instance;
    }

    public static RefWatcher getRefWatcher() {
        return getInstance().mRefWatcher;
    }

    private void initLog4j() {
        final LogConfigurator logConfigurator = new LogConfigurator();

        String logPath = FileUtils.getLogFilePath();
        try {
            if (!"".equals(logPath)) {
                File file = new File(logPath);
                if (!file.exists()) {
                    file.mkdirs();
                }
                logPath += File.separator + Constants.LOG_FILE;
                file = new File(logPath);
                if (!file.exists()) {
                    file.createNewFile();
                }
                logConfigurator.setFileName(logPath);
            }
            Level level = Constants.DEBUG ? Level.ALL : Level.ERROR;
            logConfigurator.setRootLevel(level);
            logConfigurator.setLevel("org.apache", Level.ALL);
            logConfigurator.configure();
        } catch (Exception e) {
            android.util.Log.e("Application", e.getMessage(), e);
        }
    }
}
