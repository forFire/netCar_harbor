package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.CompanyPayDao;
import org.netCar.domain.CompanyPayEntity;
import org.netCar.service.CompanyPayService;
import org.netCar.vo.OTIpcDef.BaseInfoCompanyPay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class CompanyPayServiceImpl implements CompanyPayService {

	private static Logger LOG = LoggerFactory.getLogger(CompanyPayService.class);
    @Autowired
    private CompanyPayDao dao;
    @Override
    public void save(CompanyPayEntity companyPayEntity) {
        dao.save(companyPayEntity);
    }

    @Override
    public void update(CompanyPayEntity companyPayEntity) {
    	companyPayEntity = dao.merge(companyPayEntity);
        dao.update(companyPayEntity);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

	@Override
	public void operate(BaseInfoCompanyPay entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("payId", entity.getPayId());
    	CompanyPayEntity qentity = dao.unique("from CompanyPayEntity where companyId =:companyId and payId = :payId", map);
    	CompanyPayEntity model = new CompanyPayEntity();
    	model.setCompanyId(entity.getCompanyId());
    	model.setCountDate(String.valueOf(entity.getCountDate()));
    	model.setFlag(entity.getFlag());
    	model.setPayId(entity.getPayId());
    	model.setPayName(entity.getPayName());
    	model.setPayScope(entity.getPayScope());
    	model.setPayType(entity.getPayType());
    	model.setPrepareBank(entity.getPrepareBank());
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
