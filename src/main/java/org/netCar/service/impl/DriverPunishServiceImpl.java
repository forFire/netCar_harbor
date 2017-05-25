package org.netCar.service.impl;

import org.netCar.dao.DriverPunishDao;
import org.netCar.domain.DriverPunishEntity;
import org.netCar.domain.OrderInfoEntity;
import org.netCar.service.DriverPunishService;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.RatedDriverPunish;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverPunishServiceImpl implements DriverPunishService {
	
	private static Logger LOG = LoggerFactory.getLogger(DriverPunishServiceImpl.class);
	
	@Autowired
	private DriverPunishDao driverPunishDao;

	@Override
	public void operationDriverPunish(RatedDriverPunish ratedDriverPunish) {
		DriverPunishEntity entity = transToModelFromCreate(ratedDriverPunish);
		if(null == entity){
    		LOG.info("operationDriverPunish error:entity is null "); 
    		return ;
    	}
		driverPunishDao.save(entity);

	}

	/**
	 * OrderCreate
	 * 
	 * @param orderObj
	 * @return
	 */
	private DriverPunishEntity transToModelFromCreate(RatedDriverPunish ratedDriverPunish) {

		if (null == ratedDriverPunish) {
			return null;
		}

		DriverPunishEntity entity = new DriverPunishEntity();
		entity.setCompanyId(ratedDriverPunish.getCompanyId());
		entity.setLicenseId(ratedDriverPunish.getLicenseId());
		entity.setPunishTime(ratedDriverPunish.getPunishTime());
		entity.setPunishReason(ratedDriverPunish.getPunishReason());
		entity.setPunishResult(ratedDriverPunish.getPunishResult());
		return entity;
	}

}
