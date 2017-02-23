package com.yhh.commonlib.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Environment;

import com.yhh.commonlib.Constants;

import java.io.File;

/**
 * @Author YangKai
 * @Email yk_200842135@163.com
 * @Date 2016-12-21
 * @Description
 */
public class FileUtils {

    /**
     * 获取日志文件目录
     * @return
     */
    public static String getLogFilePath() {
        String sdPath = getSDPath();
        if (!"".equals(sdPath)) {
            return sdPath + File.separator + Constants.LOG_PATH;
        }
        return "";
    }

    /**
     * 获取SDCard目录
     * @return
     */
    public static final String getSDPath() {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return Environment.getExternalStorageDirectory().toString();
        }
        return "";
    }

    /**
     * 获取版本名
     * @param context
     * @return
     */
    public static String getAppVersion(Context context)
    {
        try {
            PackageInfo pi = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return pi.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "";
    }

    /**
     * 获取版本号
     * @param context
     * @return
     */
    public static int getVersionCode(Context context)//获取版本号(内部识别号)
    {
        try {
            PackageInfo pi = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return pi.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

}
