package org.netCar.service;

import org.netCar.domain.DriverAppEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DriverAppService {
    public void save(DriverAppEntity entity);
    public void update(DriverAppEntity entity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoDriverApp entity);
}
