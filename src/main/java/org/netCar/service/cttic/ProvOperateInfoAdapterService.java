package org.netCar.service.cttic;

/**
 * 
 * @author ffd
 * 经营接口 业务分发器
 *
 */
public interface ProvOperateInfoAdapterService {
    public void adapterHandler(boolean batch,boolean compress,byte[] data);
}
