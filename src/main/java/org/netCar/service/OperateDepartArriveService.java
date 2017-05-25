package org.netCar.service;

import org.netCar.vo.OTIpcDef;

/**
 * Created by lyq on 2017/4/19.
 */
public interface OperateDepartArriveService {
	public void operateDepartData(OTIpcDef.OperateDepart operateDepart);
	public void operateArriveData(OTIpcDef.OperateArrive operateArrive);
	public void operatePayData(OTIpcDef.OperatePay operatePay);
}
