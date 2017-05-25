package org.netCar.service.impl;

import org.netCar.dao.DriverReputationDao;
import org.netCar.domain.DriverReputationEntity;
import org.netCar.service.DriverReputationService;
import org.netCar.vo.OTIpcDef.RatedDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverReputationServiceImpl implements DriverReputationService {
	
	private static Logger LOG = LoggerFactory.getLogger(DriverReputationServiceImpl.class);
	
    @Autowired
    private DriverReputationDao driverReputationDao;

	@Override
	public void operationDriverReputation(RatedDriver ratedDriver) {
		DriverReputationEntity entity = transToModelFromReputation(ratedDriver);
    	if(null == entity){
    		LOG.info("operationDriverReputation error:entity is null "); 
    		return ;
    	}
    	driverReputationDao.save(entity);
	}
	
	/**
     * 驾驶员信誉信息 转化model
     * @param ratedDriver
     * @return
     */
    private DriverReputationEntity transToModelFromReputation(RatedDriver ratedDriver){
    	
    	if(null == ratedDriver){
    		return null;
    	}
    	DriverReputationEntity entity = new DriverReputationEntity();
    	entity.setCompanyId(ratedDriver.getCompanyId());
    	entity.setLicenseId(ratedDriver.getLicenseId());
    	entity.setLevel(ratedDriver.getLevel());
    	entity.setTestDate(ratedDriver.getTestDate());
    	entity.setTestDepartment(ratedDriver.getTestDepartment());
		return entity;
    }

    
}
