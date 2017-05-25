package org.netCar.service.cttic;

/**
 * 
 * @author ffd
 * 订单接口 业务分发器
 *
 */
public interface ProvOrderInfoAdapterService {
    public void adapterHandler(boolean batch,boolean compress,byte[] data);
}
