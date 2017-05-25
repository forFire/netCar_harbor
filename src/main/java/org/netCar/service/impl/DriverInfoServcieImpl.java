package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.DirverInfoDao;
import org.netCar.domain.DriverInfoEntity;
import org.netCar.service.DriverInfoService;
import org.netCar.vo.OTIpcDef.BaseInfoDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverInfoServcieImpl implements DriverInfoService {
	private static Logger LOG = LoggerFactory.getLogger(DriverInfoService.class);
    @Autowired
    DirverInfoDao dao;

    @Override
    public void save(DriverInfoEntity driverInfoEntity) {
    	dao.save(driverInfoEntity);
    }

    @Override
    public void update(DriverInfoEntity driverInfoEntity) {
    	driverInfoEntity = dao.merge(driverInfoEntity);
    	dao.update(driverInfoEntity);
    }

    @Override
    public void delete(Integer id) {
    	dao.delete(id);
    }

	@Override
	public void operate(BaseInfoDriver entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("licenseId", entity.getLicenseId());
    	DriverInfoEntity qentity = dao.unique("from DriverInfoEntity where companyId =:companyId and licenseId =:licenseId", map);
    	DriverInfoEntity model = new DriverInfoEntity();
    	model.setAddress(entity.getAddress());
    	model.setCertificateNo(entity.getCertificateNo());
    	model.setCommercialType(entity.getCommercialType());
    	model.setCompanyId(entity.getCompanyId());
    	model.setContractCompany(entity.getContractCompany());
    	model.setContractOff(entity.getContractOff());
    	model.setContractOn(entity.getContractOn());
    	model.setDriverAddress(entity.getDriverAddress());
    	model.setDriverBirthday(entity.getDriverBirthday());
    	model.setDriverCensus(entity.getDriverCensus());
    	model.setDriverContactAddress(entity.getDriverContactAddress());
    	model.setDriverEducation(entity.getDriverEducation());
    	model.setDriverGender(entity.getDriverGender());
    	model.setDriverLanguageLevel(entity.getDriverLanguageLevel());
    	model.setDriverLicenseOff(entity.getDriverLicenseOff());
    	model.setDriverLicenseOn(entity.getDriverLicenseOn());
    	model.setDriverMaritalStatus(entity.getDriverMaritalStatus());
    	model.setDriverName(entity.getDriverName());
    	model.setDriverNation(entity.getDriverNation());
    	model.setDriverNationality(entity.getDriverNationality());
    	model.setDriverPhone(entity.getDriverPhone());
    	model.setDriverType(entity.getDriverType());
    	model.setEmergencyContact(entity.getEmergencyContact());
    	model.setEmergencyContactAddress(entity.getEmergencyContactAddress());
    	model.setEmergencyContactPhone(entity.getEmergencyContactPhone());
    	model.setFlag(entity.getFlag());
    	model.setFullTimeDriver(entity.getFullTimeDriver());
    	model.setGetDriverLicenseDate(entity.getGetDriverLicenseDate());
    	model.setGetNetworkCarProofDate(entity.getGetNetworkCarProofDate());
    	model.setInDriverBlacklist(entity.getInDriverBlacklist());
    	model.setLicenseId(entity.getLicenseId());
    	model.setLicensePhotoId(entity.getLicensePhotoId());
    	model.setNetworkCarIssueDate(entity.getNetworkCarIssueDate());
    	model.setNetworkCarIssueOrganization(entity.getNetworkCarIssueOrganization());
    	model.setNetworkCarProofOff(entity.getNetworkCarProofOff());
    	model.setNetworkCarProofOn(entity.getNetworkCarProofOn());
    	model.setPhotoId(entity.getPhotoId());
    	model.setRegisterDate(entity.getRegisterDate());
    	model.setState(entity.getState());
    	model.setTaxiDriver(entity.getTaxiDriver());
    	model.setUpdateTime(entity.getUpdateTime());
    	
    	
    	if (model.getFlag().equals(TypeConstants.ADD_FLAG)){
    		this.save(model);
    	}else if(model.getFlag().equals(TypeConstants.UPDATE_FLAG) || model.getFlag().equals(TypeConstants.DELETE_FLAG)){
    		if(qentity != null){
    			model.setId(qentity.getId());
    			this.update(model);
    		}
    	}else{
    		LOG.error(String.format("类%s,操作标识有误：%s", this.getClass().getName(),String.valueOf(model.getFlag())));
    	}
		
	}
}
