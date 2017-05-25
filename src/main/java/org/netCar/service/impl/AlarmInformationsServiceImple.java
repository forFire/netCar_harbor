package org.netCar.service.impl;

import org.netCar.dao.AlarmInformationsDao;
import org.netCar.domain.AlarmInformationsEntity;
import org.netCar.service.AlarmInformationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class AlarmInformationsServiceImple implements AlarmInformationsService {

    @Autowired
    private AlarmInformationsDao dao;
    @Override
    public void save(AlarmInformationsEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(AlarmInformationsEntity entity) {
        dao.update(entity);
    }

    @Override
    public void delete(AlarmInformationsEntity entity) {
        dao.deleteObject(entity);
    }
}
