package org.netCar.service.impl;

import org.apache.commons.lang.StringUtils;
import org.netCar.dao.OrderInfoDao;
import org.netCar.domain.OrderInfoEntity;
import org.netCar.service.OrderInfoService;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OrderCancel;
import org.netCar.vo.OTIpcDef.OrderCreate;
import org.netCar.vo.OTIpcDef.OrderMatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	
	private static Logger LOG = LoggerFactory.getLogger(OrderInfoServiceImpl.class);
	
    @Autowired
    private OrderInfoDao orderInfoDao;
    
    @Override
	public void operateOrderCreate(OrderCreate orderCreate) {
    	OrderInfoEntity entity = transToModelFromCreate(orderCreate);
    	if(null == entity){
    		LOG.info("operateOrderCreate error:entity is null "); 
    		return ;
    	}
    	orderInfoDao.save(entity);
	}

	@Override
	public void operateOrderMatch(OrderMatch orderMatch) {
		OrderInfoEntity entity = transToModelFromMatch(orderMatch);
		if(null == entity){
			LOG.info("operateOrderMatch error:entity is null ");
			return;
		}
		orderInfoDao.update(entity);
	}

	@Override
	public void operateOrderCancel(OrderCancel orderCancel) {
		OrderInfoEntity entity = transToModelFromCancel(orderCancel);
		if(null == entity){
			LOG.info("operateOrderCancel error:entity is null ");
			return;
		}
		orderInfoDao.update(entity);
	}
    
    /**
     * OrderCreate
     * @param orderObj
     * @return
     */
    private OrderInfoEntity transToModelFromCreate(OTIpcDef.OrderCreate orderObj){
    	OrderInfoEntity entity = new OrderInfoEntity();
    	entity.setCompanyId(orderObj.getCompanyId());
    	entity.setAddress(orderObj.getAddress());
    	entity.setOrderId(orderObj.getOrderId());
    	entity.setDepartTime(orderObj.getDepartTime());
    	entity.setOrderTime(orderObj.getOrderTime());
    	entity.setPassengerNote(orderObj.getPassengerNote());
    	entity.setDeparture(orderObj.getDeparture());
    	entity.setDepLongitude((double)(orderObj.getDepLongitude()/1000000));
    	entity.setDepLatitude((double)orderObj.getDepLatitude()/1000000);
    	entity.setDestLongitude((double)orderObj.getDestLongitude()/1000000);
    	entity.setDestLatitude((double)orderObj.getDestLatitude()/1000000);
    	entity.setEncrypt(orderObj.getEncrypt());
    	entity.setFareType(orderObj.getFareType());
		return entity;
    }
    
    /**
     * 订单成功 转化model
     * @param orderMatch
     * @return
     */
    private OrderInfoEntity transToModelFromMatch(OTIpcDef.OrderMatch orderMatch){
    	
    	if(null == orderMatch){
    		LOG.info("transToModelFromMatch error:orderMatch is null");
    		return null;
    	}
    	if(StringUtils.isBlank(orderMatch.getOrderId())){
    		LOG.info("orderMatch orderId is blank");
    		return null;
    	}
    	OrderInfoEntity entity = orderInfoDao.getOrderInfoEntityByOrderId(orderMatch.getOrderId());
    	
    	if(null == entity){
    		LOG.info("not find match order info");
    		return null;
    	}
    	
    	entity.setLongitude((double)orderMatch.getLongitude()/1000000);
    	entity.setLatitude((double)orderMatch.getLatitude()/1000000);
    	entity.setLicenseId(orderMatch.getLicenseId());
    	entity.setDriverPhone(orderMatch.getDriverPhone());
    	entity.setVehicleNo(orderMatch.getVehicleNo());
    	entity.setDistributeTime(orderMatch.getDistributeTime());
    	
    	//TODO 判断是否超运营
    	
    	
		return entity;
    }
    
    
    /**
     * 订单取消 转化model
     * @param orderCancel
     * @return
     */
    private OrderInfoEntity transToModelFromCancel(OTIpcDef.OrderCancel orderCancel){
    	
    	if(null == orderCancel){
    		LOG.info("transToModelFromCancel error:orderMatch is null");
    		return null;
    	}
    	
    	if(StringUtils.isBlank(orderCancel.getOrderId())){
    		LOG.info("orderCancel orderId is blank");
    		return null;
    	}
    	
    	OrderInfoEntity entity = orderInfoDao.getOrderInfoEntityByOrderId(orderCancel.getOrderId());
    	
    	if(null == entity){
    		LOG.info("not find order info");
    		return null;
    	}
    	
    	entity.setCancelTime(orderCancel.getCancelTime());
    	entity.setOperator(orderCancel.getOperator());
    	entity.setCancelTypeCode(orderCancel.getCancelTypeCode());
    	entity.setCancelReason(orderCancel.getCancelReason());
		return entity;
    }
    
}
