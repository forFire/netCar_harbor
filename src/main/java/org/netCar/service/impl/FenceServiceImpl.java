package org.netCar.service.impl;

import java.util.List;

import org.netCar.dao.FenceDao;
import org.netCar.domain.FenceEntity;
import org.netCar.service.FenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class FenceServiceImpl implements FenceService {
    @Autowired
    private FenceDao dao;
    @Override
    public void save(FenceEntity entity) {
        dao.save(entity);
    }

    @Override
    public void update(FenceEntity entity) {
    	entity = dao.merge(entity);
        dao.update(entity);
    }

    @Override
    public void delete(FenceEntity entity) {
        dao.deleteObject(entity);
    }

	@Override
	public List<FenceEntity> listFencesByCounty(String remark,Integer status) {
		return dao.listAllByCounty(remark,status);
	}
}
