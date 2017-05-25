package org.netCar.service.impl;

import org.netCar.dao.PassengerEvaluationDao;
import org.netCar.domain.OrderInfoEntity;
import org.netCar.domain.PassengerComplaintEntity;
import org.netCar.domain.PassengerEvaluationEntity;
import org.netCar.service.PassengerEvaluationService;
import org.netCar.vo.OTIpcDef.RatedPassenger;
import org.netCar.vo.OTIpcDef.RatedPassengerComplaint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class PassengerEvaluationServiceImpl implements PassengerEvaluationService {
	
	private static Logger LOG = LoggerFactory.getLogger(PassengerEvaluationServiceImpl.class);
	
    @Autowired
    private PassengerEvaluationDao passengerEvaluationDao;

	@Override
	public void operationPassengerEvaluate(RatedPassenger ratedPassenger) {
		PassengerEvaluationEntity entity = transToModelFromEvaluation(ratedPassenger);
    	if(null == entity){
    		LOG.info("operationPassengerEvaluate error:entity is null "); 
    		return ;
    	}
    	passengerEvaluationDao.save(entity);
		
	}
	
	private PassengerEvaluationEntity transToModelFromEvaluation(RatedPassenger ratedPassenger){
		if(null == ratedPassenger){
			return null;
		}
		PassengerEvaluationEntity entity = new PassengerEvaluationEntity();
		entity.setCompanyId(ratedPassenger.getCompanyId());
		entity.setOrderId(ratedPassenger.getOrderId());
		entity.setEvaluateTime(ratedPassenger.getEvaluateTime());
		entity.setServiceScore(ratedPassenger.getServiceScore());
		entity.setDriverScore(ratedPassenger.getDriverScore());
		entity.setVehicleScore(ratedPassenger.getVehicleScore());
		entity.setDetail(ratedPassenger.getDetail());
		return entity;
	}

   
}
