package org.netCar.service;

import org.netCar.domain.GmVehicleLicenseEntity;

/**
 * Created by lyq on 2017/4/19.
 */
public interface GmVehicleLicenseService {
    public void save(GmVehicleLicenseEntity gmVehicleLicenseEntity);
    public void update(GmVehicleLicenseEntity gmVehicleLicenseEntity);
    public void delete(GmVehicleLicenseEntity gmVehicleLicenseEntity);
}
