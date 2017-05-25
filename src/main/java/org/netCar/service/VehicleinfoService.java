package org.netCar.service;

import org.netCar.domain.VehicleInfoEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface VehicleinfoService {
    public void save(VehicleInfoEntity vehicleInfoEntity);
    public void update(VehicleInfoEntity vehicleInfoEntity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoVehicle entity);
}
