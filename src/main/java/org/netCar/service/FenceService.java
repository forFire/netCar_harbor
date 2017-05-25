package org.netCar.service;

import java.util.List;

import org.netCar.domain.FenceEntity;

/**
 * Created by gujgkjg on 2017/4/19.
 */
public interface FenceService {
	public List<FenceEntity> listFencesByCounty(String remark,Integer status);
    public void save(FenceEntity entity);
    public void update(FenceEntity entity);
    public void delete(FenceEntity entity);
}
