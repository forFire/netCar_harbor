package org.netCar.service;

import org.netCar.domain.CompanyScaleEntity;
import org.netCar.vo.OTIpcDef;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface CompanyScaleService {
    public void save(CompanyScaleEntity companyScaleEntity);
    public void update(CompanyScaleEntity companyScaleEntity);
    public void delete(Integer id);
    public void operate(OTIpcDef.BaseInfoCompanyStat entity);
}
