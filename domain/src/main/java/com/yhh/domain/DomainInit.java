package com.yhh.domain;

import android.content.Context;

import com.yhh.domain.db.DBCore;

/**
 * Created by Administrator on 2017-02-23.
 */
public class DomainInit {

    public static void init(Context context) {
        initDatabase(context);
    }

    /**
     * 初始化数据库
     * @param context
     */
    public static void initDatabase(Context context) {
        DBCore.init(context);
        DBCore.enableQueryBuilderLog();
    }
}
