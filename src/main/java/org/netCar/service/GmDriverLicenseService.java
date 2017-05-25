package org.netCar.service;

import org.netCar.domain.GmDriverLicenseEntity;

/**
 * Created by lyq on 2017/4/19.
 */
public interface GmDriverLicenseService {
    public void save(GmDriverLicenseEntity gmDriverLicenseEntity);
    public void update(GmDriverLicenseEntity gmDriverLicenseEntity);
    public void delete(GmDriverLicenseEntity gmDriverLicenseEntity);
}
