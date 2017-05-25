package org.netCar.service;

import org.netCar.domain.CompanyFareEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyFareService {
    public void save(CompanyFareEntity entity);
    public void update(CompanyFareEntity entity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoCompanyFare entity);
}
