package com.yhh.domain;

import com.yhh.domain.db.DBCore;
import com.yhh.domain.db.dao.PlaceDao;
import com.yhh.domain.db.manager.PlaceDaoManager;

/**
 * Created by Administrator on 2017-02-23.
 */
public class DaoManagerFactory {

    private static PlaceDaoManager sPlaceDaoManager;

    public static PlaceDaoManager getPlaceDaoManager() {
        if (sPlaceDaoManager == null) {
            PlaceDao userDao = DBCore.getDaoSession().getPlaceDao();
            sPlaceDaoManager = new PlaceDaoManager(userDao);
        }
        return sPlaceDaoManager;
    }

}
