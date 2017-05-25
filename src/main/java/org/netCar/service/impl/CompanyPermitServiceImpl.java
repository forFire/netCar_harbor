package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.CompanyPermitDao;
import org.netCar.domain.CompanyPermitEntity;
import org.netCar.service.CompanyPermitService;
import org.netCar.vo.OTIpcDef.BaseInfoCompanyPermit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyPermitServiceImpl implements CompanyPermitService {
	
	private static Logger LOG = LoggerFactory.getLogger(CompanyPermitService.class);
    @Autowired
    private CompanyPermitDao dao;

    @Override
    public void save(CompanyPermitEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(CompanyPermitEntity entity) {
    	entity = dao.merge(entity);
        dao.update(entity);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

	@Override
	public void operate(BaseInfoCompanyPermit entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	CompanyPermitEntity qentity = dao.unique("from CompanyPermitEntity where companyId =:companyId", map);
    	CompanyPermitEntity model = new CompanyPermitEntity();
    	model.setCompanyId(entity.getCompanyId());
    	model.setAddress(entity.getAddress());
    	model.setCertificate(entity.getCertificate());
    	model.setCertifyDate(entity.getCertifyDate());
    	model.setFlag(entity.getFlag());
    	model.setOperationArea(entity.getOperationArea());
    	model.setOrganization(entity.getOrganization());
    	model.setOwnerName(entity.getOwnerName());
    	model.setStartDate(entity.getStartDate());
    	model.setState(entity.getState());
    	model.setStopDate(entity.getStartDate());
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
