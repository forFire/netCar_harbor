package org.netCar.service.impl;

import org.netCar.dao.GmDriverLicenseDao;
import org.netCar.domain.GmDriverLicenseEntity;
import org.netCar.service.GmDriverLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class GmDriverLicenseServiceImpl implements GmDriverLicenseService {

    @Autowired
    private GmDriverLicenseDao gmDriverLicenseDao;

    @Override
    public void save(GmDriverLicenseEntity gmDriverLicenseEntity) {
        gmDriverLicenseDao.save(gmDriverLicenseEntity);
    }

    @Override
    public void update(GmDriverLicenseEntity gmDriverLicenseEntity) {
        gmDriverLicenseDao.update(gmDriverLicenseEntity);
    }

    @Override
    public void delete(GmDriverLicenseEntity gmDriverLicenseEntity) {
        gmDriverLicenseDao.deleteObject(gmDriverLicenseEntity);
    }
}
