package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.VehicleInsuranceDao;
import org.netCar.domain.VehicleInfoEntity;
import org.netCar.domain.VehicleInsuranceEntity;
import org.netCar.service.VehicleInsuranceService;
import org.netCar.service.VehicleinfoService;
import org.netCar.vo.OTIpcDef.BaseInfoVehicleInsurance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.zxing.qrcode.decoder.Mode;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class VehicleInsuranceServiceImpl implements VehicleInsuranceService{
	
	private static Logger LOG = LoggerFactory.getLogger(VehicleInsuranceService.class);
    @Autowired
    private VehicleInsuranceDao dao;

    @Override
    public void save(VehicleInsuranceEntity vehicleInsuranceEntity) {
        dao.save(vehicleInsuranceEntity);
    }

    @Override
    public void update(VehicleInsuranceEntity vehicleInsuranceEntity) {
    	vehicleInsuranceEntity = dao.merge(vehicleInsuranceEntity);
        dao.update(vehicleInsuranceEntity);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);;
    }

	@Override
	public void operate(BaseInfoVehicleInsurance entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("vehicleNo", entity.getVehicleNo());
    	map.put("insurNum", entity.getInsurNum());
    	VehicleInsuranceEntity qentity = dao.unique("from VehicleInsuranceEntity where companyId =:companyId and vehicleNo = :vehicleNo and insurNum = :insurNum", map);
    	VehicleInsuranceEntity model = new VehicleInsuranceEntity();
    	model.setCompanyId(entity.getCompanyId());
    	model.setFlag(entity.getFlag());
    	model.setInsurCom(entity.getInsurCom());
    	model.setInsurCount(entity.getInsurCount());
    	model.setInsurEff(entity.getInsurEff());
    	model.setInsurExp(entity.getInsurExp());
    	model.setInsurNum(entity.getInsurNum());
    	model.setInsurType(entity.getInsurType());
    	model.setUpdateTime(entity.getUpdateTime());
    	model.setVehicleNo(entity.getVehicleNo());
    	
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
