package org.netCar.service;

import org.netCar.domain.DriverInfoEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DriverInfoService {
    public void save(DriverInfoEntity driverInfoEntity);
    public void update(DriverInfoEntity driverInfoEntity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoDriver entity);
}
