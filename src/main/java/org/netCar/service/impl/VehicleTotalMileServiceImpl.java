package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.VehicleTotalMileDao;
import org.netCar.domain.VehicleTotalMileEntity;
import org.netCar.service.VehicleTotalMileService;
import org.netCar.vo.OTIpcDef.BaseInfoVehicleTotalMile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class VehicleTotalMileServiceImpl implements VehicleTotalMileService {
	
	private static Logger LOG = LoggerFactory.getLogger(VehicleTotalMileService.class);
    @Autowired
    private VehicleTotalMileDao dao;
    @Override
    public void save(VehicleTotalMileEntity entity) {
       dao.save(entity);
    }

    @Override
    public void update(VehicleTotalMileEntity entity) {
      entity = dao.merge(entity);
      dao.update(entity);
    }

    @Override
    public void delete(Integer id) {
      dao.delete(id);
    }

	@Override
	public void operate(BaseInfoVehicleTotalMile entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("vehicleNo", entity.getVehicleNo());
    	VehicleTotalMileEntity qentity = dao.unique("from VehicleTotalMileEntity where companyId =:companyId and vehicleNo = :vehicleNo", map);
    	VehicleTotalMileEntity model = new VehicleTotalMileEntity();
    	model.setAddress(entity.getAddress());
    	model.setCompanyId(entity.getCompanyId());
    	model.setFlag(entity.getFlag());
    	model.setTotalMile(String.valueOf(entity.getTotalMile()));
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
