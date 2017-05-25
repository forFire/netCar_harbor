package org.netCar.service;

import org.netCar.domain.DriverStatInfoEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DriverStatInfoService {
    public void save(DriverStatInfoEntity entity);
    public void update(DriverStatInfoEntity entity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoDriverStat entity);
}
