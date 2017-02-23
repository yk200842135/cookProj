package com.yhh.domain.db;

import android.content.Context;

import com.yhh.domain.db.dao.DaoMaster;
import com.yhh.domain.db.dao.DaoSession;

import de.greenrobot.dao.query.QueryBuilder;

/**
 * Created by Administrator on 2017-02-23.
 */
public class DBCore {
    private static final String DEFAULT_DB_NAME = "green_dao_test.db";
    private static DaoMaster sDaoMaster;
    private static DaoSession sDaoSession;

    private static Context sContext;
    private static String sDbName;

    public static void init(Context context) {
        init(context, DEFAULT_DB_NAME);
    }

    public static void init(Context context, String dbName) {
        if (context == null) {
            throw new IllegalArgumentException("Init DBCore failed, context can't be null.");
        }
        sContext = context.getApplicationContext();
        sDbName = dbName;
    }

    public static DaoMaster getDaoMaster() {
        if (sDaoMaster == null) {
            DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(sContext, sDbName, null);
            sDaoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        return sDaoMaster;
    }

    public static DaoSession getDaoSession() {
        if (sDaoSession == null) {
            if (sDaoMaster == null) {
                sDaoMaster = getDaoMaster();
            }
            sDaoSession = sDaoMaster.newSession();
        }
        return sDaoSession;
    }

    public static void enableQueryBuilderLog() {
        QueryBuilder.LOG_SQL = true;
        QueryBuilder.LOG_VALUES = true;
    }
}
