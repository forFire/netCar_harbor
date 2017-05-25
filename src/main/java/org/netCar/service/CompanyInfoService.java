package org.netCar.service;


import org.netCar.domain.CompanyInfoEntity;
import org.netCar.vo.OTIpcDef;

public interface CompanyInfoService {

	public void save(CompanyInfoEntity companyInfo);
	public void update(CompanyInfoEntity companyInfo);

	public void delete(Integer id);
	public void changeStatus(Integer id,Integer status);
	public CompanyInfoEntity getById(Integer id);
	
	public void operate(OTIpcDef.BaseInfoCompany company);
	
}
