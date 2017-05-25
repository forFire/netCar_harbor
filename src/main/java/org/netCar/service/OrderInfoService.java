package org.netCar.service;

import org.netCar.vo.OTIpcDef;

/**
 * Created by lyq on 2017/4/19.
 */
public interface OrderInfoService {
	public void operateOrderCreate(OTIpcDef.OrderCreate orderCreate);
	public void operateOrderMatch(OTIpcDef.OrderMatch orderMatch);
	public void operateOrderCancel(OTIpcDef.OrderCancel orderCancel);
}
