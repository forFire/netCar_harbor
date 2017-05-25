package org.netCar.service.impl;

import org.netCar.dao.PassengerComplaintDao;
import org.netCar.domain.PassengerComplaintEntity;
import org.netCar.service.PassengerComplaintService;
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
public class PassengerComplaintServiceImpl implements PassengerComplaintService {
	
	private static Logger LOG = LoggerFactory.getLogger(PassengerComplaintServiceImpl.class);
	
    @Autowired
    private PassengerComplaintDao passengerComplaintDao;

	@Override
	public void operationPassengerComplaint(RatedPassengerComplaint ratedPassengerComplaint) {
		PassengerComplaintEntity entity = transToModelFromComplain(ratedPassengerComplaint);
		if(null == entity){
			LOG.info("operationPassengerComplaint error:entity is null "); 
    		return ;
		}
		passengerComplaintDao.save(entity);
	}
	
	private PassengerComplaintEntity transToModelFromComplain(RatedPassengerComplaint ratedPassengerComplaint){
		if(null == ratedPassengerComplaint){
			return null;
		}
		PassengerComplaintEntity entity = new PassengerComplaintEntity();
		entity.setCompanyId(ratedPassengerComplaint.getCompanyId());
		entity.setOrderId(ratedPassengerComplaint.getOrderId());
		entity.setComplaintTime(ratedPassengerComplaint.getComplaintTime());
		entity.setDetail(ratedPassengerComplaint.getDetail());
		entity.setResult(ratedPassengerComplaint.getResult());
		return entity;
	}
}
