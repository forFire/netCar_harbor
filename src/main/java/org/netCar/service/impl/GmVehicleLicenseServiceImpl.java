package org.netCar.service.impl;

import org.netCar.dao.GmVehicleLicenseDao;
import org.netCar.domain.GmVehicleLicenseEntity;
import org.netCar.service.GmVehicleLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class GmVehicleLicenseServiceImpl implements GmVehicleLicenseService{

    @Autowired
    private GmVehicleLicenseDao gmVehicleLicenseDao;

    @Override
    public void save(GmVehicleLicenseEntity gmVehicleLicenseEntity) {
        gmVehicleLicenseDao.save(gmVehicleLicenseEntity);
    }

    @Override
    public void update(GmVehicleLicenseEntity gmVehicleLicenseEntity) {
        gmVehicleLicenseDao.update(gmVehicleLicenseEntity);
    }

    @Override
    public void delete(GmVehicleLicenseEntity gmVehicleLicenseEntity) {
        gmVehicleLicenseDao.deleteObject(gmVehicleLicenseEntity);
    }
}
