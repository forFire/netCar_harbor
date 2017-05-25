package org.netCar.service;

import org.netCar.domain.CompanyServiceEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyServiceService {
    public void save(CompanyServiceEntity entity);
    public void update(CompanyServiceEntity entity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoCompanyService entity);
}
