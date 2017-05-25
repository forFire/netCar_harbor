package org.netCar.service;

import org.netCar.domain.VehicleTotalMileEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface VehicleTotalMileService {

    void save(VehicleTotalMileEntity dirverMileageEntity);
    void update(VehicleTotalMileEntity dirverMileageEntity);
    void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoVehicleTotalMile entity);
}
