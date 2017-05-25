package org.netCar.service;

import org.netCar.vo.OTIpcDef;

/**
 * Created by lyq on 2017/4/19.
 */
public interface OperateLogInOutService {
	public void operationLogInData(OTIpcDef.OperateLogin operateLogin);
	public void operationLogOutData(OTIpcDef.OperateLogout operateLogout);
}
