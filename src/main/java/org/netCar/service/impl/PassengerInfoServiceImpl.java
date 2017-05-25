package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.PassengerInfoDao;
import org.netCar.domain.PassengerInfoEntity;
import org.netCar.service.PassengerInfoService;
import org.netCar.vo.OTIpcDef.BaseInfoPassenger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class PassengerInfoServiceImpl implements PassengerInfoService {
	
	private static Logger LOG = LoggerFactory.getLogger(PassengerInfoService.class);

    @Autowired
    PassengerInfoDao dao;

    @Override
    public void save(PassengerInfoEntity passengerInfoEntity) {
    	dao.save(passengerInfoEntity);
    }

    @Override
    public void update(PassengerInfoEntity passengerInfoEntity) {
    	passengerInfoEntity = dao.merge(passengerInfoEntity);
    	dao.update(passengerInfoEntity);
    }

    @Override
    public void delete(PassengerInfoEntity passengerInfoEntity) {
    	dao.deleteObject(passengerInfoEntity);
    }

	@Override
	public void operate(BaseInfoPassenger entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("passengerPhone", entity.getPassengerPhone());
    	PassengerInfoEntity qentity = dao.unique("from PassengerInfoEntity where companyId =:companyId and passengerPhone =:passengerPhone", map);
    	PassengerInfoEntity model = new PassengerInfoEntity();
    	model.setCompanyId(entity.getCompanyId());
    	model.setFlag(entity.getFlag());
    	model.setPassengerGender(entity.getPassengerGender());
    	model.setPassengerName(entity.getPassengerName());
    	model.setPassengerPhone(entity.getPassengerPhone());
    	model.setRegisterDate(entity.getRegisterDate());
    	model.setState(entity.getState());
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
