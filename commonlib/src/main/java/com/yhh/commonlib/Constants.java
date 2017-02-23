package com.yhh.commonlib;

import java.io.File;

/**
 * @Author YangKai
 * @Email yk_200842135@163.com
 * @Date 2016-12-21
 * @Description
 */
public class Constants {

    //网络相关
    public static final int HTTP_RESPONSE_DISK_CACHE_MAX_SIZE = 10 * 1024 * 1024;

    public static final String ENDPOINT_IP = "http://ip.taobao.com";
    public static final String ENDPOINT_WEATHER = " http://api.map.baidu.com";
    public static final String BAIDU_AK = "MPDgj92wUYvRmyaUdQs1XwCf";



    public static final boolean DEBUG = true;

    //日志相关
    public static final String BASE_FILE_PATH = "CommonProj";
    public static final String LOG_PATH = BASE_FILE_PATH + File.separator + "log";
    public static final String LOG_FILE = BASE_FILE_PATH + ".log";
}
