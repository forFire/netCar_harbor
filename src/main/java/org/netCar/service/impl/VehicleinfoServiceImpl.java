package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.VehicleInfoDao;
import org.netCar.domain.CompanyPermitEntity;
import org.netCar.domain.VehicleInfoEntity;
import org.netCar.service.CompanyInfoService;
import org.netCar.service.VehicleinfoService;
import org.netCar.vo.OTIpcDef.BaseInfoVehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.zxing.qrcode.decoder.Mode;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class VehicleinfoServiceImpl implements VehicleinfoService {

	private static Logger LOG = LoggerFactory.getLogger(VehicleinfoService.class);
    @Autowired
    private VehicleInfoDao dao;
    @Override
    public void save(VehicleInfoEntity vehicleInfoEntity) {
        dao.save(vehicleInfoEntity);
    }

    @Override
    public void update(VehicleInfoEntity vehicleInfoEntity) {
    	vehicleInfoEntity = dao.merge(vehicleInfoEntity);
        dao.update(vehicleInfoEntity);
    }

    @Override
    public void delete(Integer id) {
       dao.delete(id);;
    }

	@Override
	public void operate(BaseInfoVehicle entity) {
		Map<String,Object> map = new HashMap<>();
    	map.put("companyId", entity.getCompanyId());
    	map.put("vehicleNo", entity.getVehicleNo());
    	VehicleInfoEntity qentity = dao.unique("from VehicleInfoEntity where companyId =:companyId and vehicleNo = :vehicleNo", map);
    	VehicleInfoEntity model = new VehicleInfoEntity();
    	model.setAddress(entity.getAddress());
    	model.setBrand(entity.getBrand());
    	model.setCertificate(entity.getCertificate());
    	model.setCertifyDateA(entity.getCertifyDateA());
    	model.setCertifyDateB(entity.getCertifyDateB());
    	model.setCheckState(entity.getCheckState());
    	model.setCommercialType(entity.getCommercialType());
    	model.setCompanyId(entity.getCompanyId());
    	model.setEngineDisplace(entity.getEngineDisplace());
    	model.setEngineId(entity.getEngineId());
    	model.setFareType(entity.getFareType());
    	model.setFeePrintId(entity.getFeePrintId());
    	model.setFareType(entity.getFareType());
    	model.setFeePrintId(entity.getFeePrintId());
    	model.setFixState(entity.getFixState());
    	model.setFlag(entity.getFlag());
    	model.setFuelType(entity.getFuelType());
    	model.setgPsBrand(entity.getGPSBrand());
    	model.setgPsimei(entity.getGPSIMEI());
    	model.setgPsInstallDate(entity.getGPSInstallDate());
    	model.setgPsModel(entity.getGPSModel());
    	model.setModel(entity.getModel());
        model.setNextFixDate(entity.getNextFixDate());
        model.setOwnerName(entity.getOwnerName());
        model.setPhotoId(entity.getPhotoId());
        model.setPlateColor(entity.getPlateColor());
        model.setRegisterDate(entity.getRegisterDate());
        model.setSeats(entity.getSeats());
        model.setTransAgency(entity.getTransAgency());
        model.setTransArea(entity.getTransArea());
        model.setTransDateStart(entity.getTransDateStart());
    	model.setTransDateStop(entity.getTransDateStop());
    	model.setUpdateTime(entity.getUpdateTime());
    	model.setVehicleColor(entity.getVehicleColor());
    	model.setVehicleNo(entity.getVehicleNo());
    	model.setVehicleType(entity.getVehicleType());
    	model.setvIn(entity.getVIN());
    	
    	
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
