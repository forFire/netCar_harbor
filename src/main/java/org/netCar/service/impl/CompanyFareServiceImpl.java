package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.CompanyFareDao;
import org.netCar.domain.CompanyFareEntity;
import org.netCar.service.CompanyFareService;
import org.netCar.vo.OTIpcDef.BaseInfoCompanyFare;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyFareServiceImpl implements CompanyFareService {
	
	private static Logger LOG = LoggerFactory.getLogger(CompanyFareService.class);
    @Autowired
    private CompanyFareDao dao;
    @Override
    public void save(CompanyFareEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(CompanyFareEntity entity) {
    	entity = dao.merge(entity);
        dao.update(entity);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

	@Override
	public void operate(BaseInfoCompanyFare entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("fareType", entity.getFareType());
    	CompanyFareEntity qentity = dao.unique("from CompanyFareEntity where companyId =:companyId and fareType = :fareType", map);
    	CompanyFareEntity model = new CompanyFareEntity();
    	model.setAddress(entity.getAddress());
    	model.setCompanyId(entity.getCompanyId());
    	model.setEveningPeakTimeOff(entity.getEveningPeakTimeOff());
    	model.setEveningPeakTimeOn(entity.getEveningPeakTimeOn());
    	model.setFareType(entity.getFareType());
    	model.setFareTypeNote(entity.getFareTypeNote());
    	model.setFareValidOff(entity.getFareValidOff());
    	model.setFareValidOn(entity.getFareValidOn());
    	model.setFlag(entity.getFlag());
    	model.setLowSpeedPricePerMinute(entity.getLowSpeedPricePerMinute());
    	model.setMorningPeakTimeOff(entity.getMorningPeakTimeOff());
    	model.setMorningPeakTimeOn(entity.getMorningPeakTimeOn());
    	model.setNightPricePerMile(entity.getNightPricePerMile());
    	model.setNightPricePerMinute(entity.getNightPricePerMinute());
    	model.setOtherPeakTimeOff(entity.getOtherPeakTimeOff());
    	model.setOtherPeakTimeOn(entity.getOtherPeakTimeOn());
    	model.setOtherPrice(String.valueOf(entity.getOtherPrice()));
    	model.setPeakPriceStartMile(entity.getPeakPriceStartMile());
    	model.setPeakUnitPrice(entity.getPeakUnitPrice());
    	model.setUpdateTime(entity.getUpdateTime());
    	model.setUpPrice(entity.getUpPrice());
    	model.setUpPriceStartMile(entity.getUpPriceStartMile());
    	
    	
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
