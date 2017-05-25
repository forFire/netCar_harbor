package org.netCar.service;

import org.netCar.domain.PassengerInfoEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by lyq on 2017/4/19.
 */
public interface PassengerInfoService {
    public void save(PassengerInfoEntity passengerInfoEntity);
    public void update(PassengerInfoEntity passengerInfoEntity);
    public void delete(PassengerInfoEntity passengerInfoEntity);
    public void operate(OTIpcDef.BaseInfoPassenger entity);
}
