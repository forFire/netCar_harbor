package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.DriverAppDao;
import org.netCar.domain.DriverAppEntity;
import org.netCar.service.DriverAppService;
import org.netCar.vo.OTIpcDef.BaseInfoDriverApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverAppServiceImpl implements DriverAppService {
	
	private static Logger LOG = LoggerFactory.getLogger(DriverAppService.class);
    @Autowired
    private DriverAppDao dao;
    @Override
    public void save(DriverAppEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(DriverAppEntity entity) {
    	entity = dao.merge(entity);
        dao.update(entity);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

	@Override
	public void operate(BaseInfoDriverApp entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("licenseId", entity.getLicenseId());
    	DriverAppEntity qentity = dao.unique("from DriverAppEntity where companyId =:companyId and licenseId =:licenseId", map);
    	DriverAppEntity model = new DriverAppEntity();
    	model.setAddress(entity.getAddress());
    	model.setAppVersion(entity.getAppVersion());
    	model.setCompanyId(entity.getCompanyId());
    	model.setDriverPhone(entity.getDriverPhone());
    	model.setFlag(entity.getFlag());
    	model.setLicenseId(entity.getLicenseId());
    	model.setMapType(entity.getMapType());
    	model.setNetType(entity.getNetType());
    	model.setState(entity.getState());
    	model.setUpdateTime(entity.getUpdateTime());
    	
    	
    	if (model.getFlag().equals(TypeConstants.ADD_FLAG)){
    		this.save(model);
    	}else if(model.getFlag().equals(TypeConstants.UPDATE_FLAG)|| model.getFlag().equals(TypeConstants.DELETE_FLAG)){
    		if(qentity != null){
    			model.setId(qentity.getId());
    			this.update(model);
    		}
    	}else{
    		LOG.error(String.format("类%s,操作标识有误：%s", this.getClass().getName(),String.valueOf(model.getFlag())));
    	}
		
	}
}
