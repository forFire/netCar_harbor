package org.netCar.dao;

import org.netCar.domain.OperateDepartArriveEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by lyq on 2017/4/19.
 */
@Repository
public class OperateDepartArriveDao extends  BaseHBDao<OperateDepartArriveEntity, Integer> {
	
	public OperateDepartArriveEntity getOperateDepartArriveEntityByOrderId(String orderId){
		String hql = " from  OperateDepartArriveEntity where orderId = ? ";
		return unique(hql, orderId);
	}
	
}
