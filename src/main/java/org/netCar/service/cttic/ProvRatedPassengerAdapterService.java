package org.netCar.service.cttic;

/**
 * 
 * @author ffd
 * 评价及投诉接口 业务分发器
 *
 */
public interface ProvRatedPassengerAdapterService {
    public void adapterHandler(boolean batch,boolean compress,byte[] data);
}
