package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.CompanyScaleDao;
import org.netCar.domain.CompanyScaleEntity;
import org.netCar.service.CompanyScaleService;
import org.netCar.vo.OTIpcDef.BaseInfoCompanyStat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by menxin on 2017/4/19.
 */
@Service
public class CompanyScaleServiceImpl implements CompanyScaleService {
	
	private static Logger LOG = LoggerFactory.getLogger(CompanyScaleService.class);
    @Autowired
    CompanyScaleDao dao;
    @Override
    public void save(CompanyScaleEntity companyScaleEntity) {
        dao.save(companyScaleEntity);
    }

    @Override
    public void update(CompanyScaleEntity companyScaleEntity) {
    	companyScaleEntity = dao.merge(companyScaleEntity);
        dao.update(companyScaleEntity);
    }

    @Override
    public void delete(Integer id) {
       dao.delete(id);;
    }

	@Override
	public void operate(BaseInfoCompanyStat entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	CompanyScaleEntity qentity = dao.unique("from CompanyScaleEntity where companyId =:companyId", map);
    	CompanyScaleEntity model = new CompanyScaleEntity();
    	model.setCompanyId(entity.getCompanyId());
    	model.setDriverNum(String.valueOf(entity.getDriverNum()));
    	model.setFlag(entity.getFlag());
    	model.setUpdateTime(entity.getUpdateTime());
    	model.setVehicleNum(String.valueOf(entity.getVehicleNum()));
    	
    	
    	
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
