package org.netCar.service;

import org.netCar.domain.CompanyPayEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyPayService {
    public void save(CompanyPayEntity companyPayEntity);
    public void update(CompanyPayEntity companyPayEntity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoCompanyPay entity);
}
