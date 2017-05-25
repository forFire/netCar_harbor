package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.CompanyServiceDao;
import org.netCar.domain.CompanyInfoEntity;
import org.netCar.domain.CompanyServiceEntity;
import org.netCar.service.CompanyServiceService;
import org.netCar.vo.OTIpcDef;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyServiceServiceImpl implements CompanyServiceService {
	
	private static Logger LOG = LoggerFactory.getLogger(CompanyServiceService.class);
    @Autowired
    private CompanyServiceDao dao;
    @Override
    public void save(CompanyServiceEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(CompanyServiceEntity entity) {
    	entity = dao.merge(entity);
        dao.update(entity);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }
    
    @Override
    public void operate(OTIpcDef.BaseInfoCompanyService entity) {
    	Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("serviceNo", entity.getServiceNo());
    	CompanyServiceEntity qentity = dao.unique("from CompanyServiceEntity where companyId =:companyId and serviceNo =:serviceNo", map);
    	CompanyServiceEntity model = new CompanyServiceEntity();
    	model.setAddress(entity.getAddress());
    	model.setCompanyId(entity.getCompanyId());
    	model.setContactPhone(entity.getContactPhone());
    	model.setCreateDate(entity.getCreateDate());
    	model.setDetailAddress(entity.getDetailAddress());
    	model.setFlag(entity.getFlag());
    	model.setMailAddress(entity.getMailAddress());
    	model.setManagerName(entity.getManagerName());
    	model.setManagerPhone(entity.getManagerPhone());
    	model.setResponsibleName(entity.getResponsibleName());
    	model.setResponsiblePhone(entity.getResponsiblePhone());
    	model.setServiceName(entity.getServiceName());
    	model.setServiceNo(entity.getServiceNo());
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
    
     public static void main(String[] args) {
		System.out.println(String.format("类%s,操作标识有误：%s", CompanyServiceServiceImpl.class.getName(),String.valueOf(1)));
	}

}
