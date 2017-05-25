package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.CompanyInfoDao;
import org.netCar.domain.CompanyInfoEntity;
import org.netCar.service.CompanyInfoService;
import org.netCar.vo.OTIpcDef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

	private static Logger LOG = LoggerFactory.getLogger(CompanyInfoService.class);
	
	@Autowired
	CompanyInfoDao companyInfoDao;
	
	@Override
	public void save(CompanyInfoEntity companyInfo) {
		companyInfoDao.save(companyInfo);
	}
	
    public void operate(OTIpcDef.BaseInfoCompany company){
    	Map<String,Object> map = new HashMap<>();
    	map.put("companyId", company.getCompanyId());
    	CompanyInfoEntity qentity = companyInfoDao.unique("from CompanyInfoEntity where companyId =:companyId", map);
    	CompanyInfoEntity entity = new CompanyInfoEntity();
    	entity.setAddress(company.getAddress());
    	entity.setBusinessScope(company.getBusinessScope());
    	entity.setCompanyId(company.getCompanyId());
    	entity.setCompanyName(company.getCompanyName());
    	entity.setContactAddress(company.getContactAddress());
    	entity.setEconomicType(company.getEconomicType());
    	entity.setFlag(company.getFlag());
    	entity.setIdentifier(company.getIdentifier());
    	entity.setLegalId(company.getLegalID());
    	entity.setLegalName(company.getLegalName());
    	entity.setLegalPhone(company.getLegalPhone());
    	entity.setLegalPhoto(company.getLegalPhoto());
    	entity.setRegCapital(company.getRegCapital());
    	entity.setState(company.getState());
    	entity.setUpdateTime(company.getUpdateTime());
    	if (entity.getFlag().equals(TypeConstants.ADD_FLAG)){
    		this.save(entity);
    	}else if(entity.getFlag().equals(TypeConstants.UPDATE_FLAG) || entity.getFlag().equals(TypeConstants.DELETE_FLAG)){
    		if(qentity != null){
    			entity.setId(qentity.getId());
    			this.update(entity);
    		}
    	}else{
    		LOG.error(String.format("类%s,操作标识有误：%s", this.getClass().getName(),String.valueOf(company.getFlag())));
    	}
    	
    }
	
	
	@Override
	public void update(CompanyInfoEntity companyInfo) {
		companyInfo = companyInfoDao.merge(companyInfo);
        companyInfoDao.update(companyInfo);
	}

	@Override
	public void delete(Integer id) {
		companyInfoDao.delete(id);
	}
	
	

	@Override
	public void changeStatus(Integer id, Integer status) {

	}

	@Override
	public CompanyInfoEntity getById(Integer id) {
		return null;
	}

}
