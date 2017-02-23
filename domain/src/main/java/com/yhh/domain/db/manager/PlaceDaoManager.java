package com.yhh.domain.db.manager;

import com.yhh.domain.db.model.Place;

import de.greenrobot.dao.AbstractDao;

/**
 * Created by Administrator on 2017-02-20.
 */
public class PlaceDaoManager extends BaseDaoManager<Place, Long> {

    public PlaceDaoManager(AbstractDao dao) {
        super(dao);
    }
}
