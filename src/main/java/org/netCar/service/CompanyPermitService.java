package org.netCar.service;

import org.netCar.domain.CompanyPermitEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyPermitService {
    public void save(CompanyPermitEntity entity);
    public void update(CompanyPermitEntity entity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoCompanyPermit entity);
}
