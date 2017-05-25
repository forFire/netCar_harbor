package org.netCar.service.impl;

import org.netCar.dao.GmCompanyBusinessLicenseDao;
import org.netCar.domain.GmCompanyBusinessLicenseEntity;
import org.netCar.service.GmCompanyBusinessLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ffd on 2017/4/19.
 */
@Service
public class GmCompanyBusinessLicenseServiceImpl implements GmCompanyBusinessLicenseService {

    @Autowired
    private GmCompanyBusinessLicenseDao gmCompanyBusinessLicenseDao;

    @Override
    public void save(GmCompanyBusinessLicenseEntity gmCompanyBusinessLicenseEntity) {
        gmCompanyBusinessLicenseDao.save(gmCompanyBusinessLicenseEntity);
    }

    @Override
    public void update(GmCompanyBusinessLicenseEntity gmCompanyBusinessLicenseEntity) {
        gmCompanyBusinessLicenseDao.update(gmCompanyBusinessLicenseEntity);
    }

    @Override
    public void delete(GmCompanyBusinessLicenseEntity gmCompanyBusinessLicenseEntity) {
        gmCompanyBusinessLicenseDao.deleteObject(gmCompanyBusinessLicenseEntity);
    }
}
