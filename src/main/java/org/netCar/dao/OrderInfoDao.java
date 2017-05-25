package org.netCar.dao;

import org.netCar.domain.OrderInfoEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by lyq on 2017/4/19.
 */
@Repository
public class OrderInfoDao extends BaseHBDao<OrderInfoEntity, Integer> {
	
	public OrderInfoEntity getOrderInfoEntityByOrderId(String orderId){
		String hql = " from  OrderInfoEntity where orderId = ? ";
		return unique(hql, orderId);
	}
	
}
