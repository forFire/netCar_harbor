package org.netCar.service;

import org.netCar.domain.AlarmInformationsEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface AlarmInformationsService {
    public void save(AlarmInformationsEntity entity);
    public void update(AlarmInformationsEntity entity);
    public void delete(AlarmInformationsEntity entity);
}
