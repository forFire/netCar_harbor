package org.netCar.service.impl;

import org.apache.commons.lang.StringUtils;
import org.netCar.dao.OperateDepartArriveDao;
import org.netCar.domain.OperateDepartArriveEntity;
import org.netCar.service.OperateDepartArriveService;
import org.netCar.vo.OTIpcDef.OperateArrive;
import org.netCar.vo.OTIpcDef.OperateDepart;
import org.netCar.vo.OTIpcDef.OperatePay;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class OperateDepartArriveServiceImpl implements OperateDepartArriveService {
	
	private static Logger LOG = LoggerFactory.getLogger(OperateDepartArriveServiceImpl.class);
	
    @Autowired
    private OperateDepartArriveDao operateDepartArriveDao;

	@Override
	public void operateDepartData(OperateDepart operateDepart) {
		OperateDepartArriveEntity entity = transToModelFromDepart(operateDepart);
		if(null == entity){
			LOG.info("operateDepartArriveData error : entity is null "); 
    		return ;
		}
		operateDepartArriveDao.save(entity);
	}

	@Override
	public void operateArriveData(OperateArrive operateArrive) {
		OperateDepartArriveEntity entity = transToModelFromOperateArrive(operateArrive);
		if(null == entity){
			LOG.info("operateDepartArriveData error : entity is null "); 
    		return ;
		}
		operateDepartArriveDao.update(entity);
		
	}

	@Override
	public void operatePayData(OperatePay operatePay) {
		OperateDepartArriveEntity entity = transToModelFromOperatePay(operatePay);
		if(null == entity){
			LOG.info("operatePayData error : entity is null "); 
    		return ;
		}
		operateDepartArriveDao.update(entity);
		
	}
	
	
	/**
     * 经营出发 转化model
     * @param operateDepart
     * @return
     */
    private OperateDepartArriveEntity transToModelFromDepart(OperateDepart operateDepart){
    	
    	if(null == operateDepart){
    		LOG.info("transToModelFromDepart error:operateDepart is null");
    		return null;
    	}
    	
    	OperateDepartArriveEntity entity = new OperateDepartArriveEntity();
    	entity.setCompanyId(operateDepart.getCompanyId());
    	entity.setOrderId(operateDepart.getOrderId());
    	entity.setLicenseId(operateDepart.getLicenseId());
    	entity.setFareType(operateDepart.getFareType());
    	entity.setVehicleNo(operateDepart.getVehicleNo());
    	entity.setDepLongitude((double)operateDepart.getDepLongitude()/1000000);
    	entity.setDepLatitude((double)operateDepart.getDepLatitude()/1000000);
    	entity.setEncrypt(operateDepart.getEncrypt());
    	entity.setDepTime(operateDepart.getDepTime());
    	entity.setWaitMile(operateDepart.getWaitMile());
    	entity.setWaitTime(operateDepart.getWaitTime());
		return entity;
    }
    
    
    /**
     * 经营到达 转化model
     * @param operatePay
     * @return
     */
    private OperateDepartArriveEntity transToModelFromOperateArrive(OperateArrive operateArrive){
    	
    	if(null == operateArrive){
    		LOG.info("transToModelFromOperateArrive error : operateArrive is null");
    		return null;
    	}
    	
    	if(StringUtils.isBlank(operateArrive.getOrderId())){
    		LOG.info("operatePay orderId is blank");
    		return null;
    	}
    	
    	OperateDepartArriveEntity entity = operateDepartArriveDao.getOperateDepartArriveEntityByOrderId(operateArrive.getOrderId());
    	
    	if(null == entity){
    		LOG.info("not find operate depart info orderID{}",operateArrive.getOrderId());
    		return null;
    	}
    	
    	entity.setDestLongitude((double)operateArrive.getDestLongitude()/1000000);
    	entity.setDestLatitude((double)operateArrive.getDestLatitude()/1000000);
    	entity.setDestTime(operateArrive.getDestTime());
    	entity.setDriveMile(operateArrive.getDriveMile());
    	entity.setDriveTime(operateArrive.getDriveTime());
		return entity;
    }
    
    
    /**
     * 经营支付 转化model
     * @param operatePay
     * @return
     */
    private OperateDepartArriveEntity transToModelFromOperatePay(OperatePay operatePay){
    	
    	if(null == operatePay){
    		LOG.info("transToModelFromOperatePay error:operatePay is null");
    		return null;
    	}
    	
    	if(StringUtils.isBlank(operatePay.getOrderId())){
    		LOG.info("operatePay orderId is blank");
    		return null;
    	}
    	
    	OperateDepartArriveEntity entity = operateDepartArriveDao.getOperateDepartArriveEntityByOrderId(operatePay.getOrderId());
    	
    	if(null == entity){
    		LOG.info("not find operate depart info orderID{}",operatePay.getOrderId());
    		return null;
    	}
    	
    	entity.setOnArea(operatePay.getOnArea());
    	entity.setDriverName(operatePay.getDriverName());
    	entity.setFareType(operatePay.getFareType());
    	entity.setBookDepTime(operatePay.getBookDepTime());
    	entity.setWaitTime(operatePay.getWaitTime());
    	entity.setDepLongitude((double)operatePay.getDepLongitude()/1000000);
    	entity.setDepLatitude((double)operatePay.getDepLatitude()/1000000);
    	entity.setDepArea(operatePay.getDepArea());
    	entity.setDepTime(operatePay.getDepTime());
    	entity.setDestLongitude((double)operatePay.getDestLongitude()/1000000);
    	entity.setDestLatitude((double)operatePay.getDestLatitude()/1000000);
    	entity.setDestArea(operatePay.getDestArea());
    	entity.setDestTime(operatePay.getDestTime());
    	entity.setBookModel(operatePay.getBookModel());
    	entity.setModel(operatePay.getModel());
    	entity.setDriveMile(operatePay.getDriveMile());
    	entity.setDriveTime(operatePay.getDriveTime());
    	entity.setWaitMile(operatePay.getWaitMile());
    	entity.setFactPrice(operatePay.getFactPrice());
    	entity.setPrice(operatePay.getPrice());
    	entity.setCashPrice(operatePay.getCashPrice());
    	entity.setLineName(operatePay.getLineName());
    	entity.setLinePrice(operatePay.getLinePrice());
    	entity.setPosName(operatePay.getPosName());
    	entity.setPosPrice(operatePay.getPosPrice());
    	entity.setBenfitPrice(operatePay.getBenfitPrice());
    	entity.setBookTip(operatePay.getBookTip());
    	entity.setPassengerTip(operatePay.getPassengerTip());
    	entity.setPeakUpPrice(operatePay.getPeakUpPrice());
    	entity.setNightUpPrice(operatePay.getNightUpPrice());
    	entity.setFarUpPrice(operatePay.getFarUpPrice());
    	entity.setOtherUpPrice(operatePay.getOtherUpPrice());
    	entity.setPayState(operatePay.getPayState());
    	entity.setPayTime(operatePay.getPayTime());
    	entity.setOrderMatchTime(operatePay.getOrderMatchTime());
    	entity.setInvoiceStatus(operatePay.getInvoiceStatus());
		return entity;
    }

    
}
