package org.netCar.service;

import org.netCar.domain.DriverEducateEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface DriverEducateService {
    public void save(DriverEducateEntity entity);
    public void update(DriverEducateEntity entity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoDriverEducate entity);
}
