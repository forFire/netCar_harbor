package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.DriverEducateDao;
import org.netCar.domain.DriverEducateEntity;
import org.netCar.service.DriverEducateService;
import org.netCar.vo.OTIpcDef.BaseInfoDriverEducate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverEducateServcieImpl implements DriverEducateService {
	private static Logger LOG = LoggerFactory.getLogger(DriverEducateService.class);
    @Autowired
    private DriverEducateDao dao;
    @Override
    public void save(DriverEducateEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(DriverEducateEntity entity) {
    	entity = dao.merge(entity);
        dao.update(entity);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

	@Override
	public void operate(BaseInfoDriverEducate entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("licenseId", entity.getLicenseId());
    	DriverEducateEntity qentity = dao.unique("from DriverEducateEntity where companyId =:companyId and licenseId =:licenseId", map);
    	DriverEducateEntity model = new DriverEducateEntity();
    	model.setAddress(entity.getAddress());
    	model.setCompanyId(entity.getCompanyId());
    	model.setCourseDate(entity.getCourseDate());
    	model.setCourseName(entity.getCourseName());
    	model.setDuration(String.valueOf(entity.getDuration()));
    	model.setFlag(entity.getFlag());
    	model.setLicenseId(entity.getLicenseId());
    	model.setStartTime(entity.getStartTime());
    	model.setStopTime(entity.getStopTime());
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
