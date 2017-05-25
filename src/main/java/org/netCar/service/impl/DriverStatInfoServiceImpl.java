package org.netCar.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.netCar.constant.TypeConstants;
import org.netCar.dao.DriverStatInfoDao;
import org.netCar.domain.DriverStatInfoEntity;
import org.netCar.service.DriverStatInfoService;
import org.netCar.vo.OTIpcDef.BaseInfoDriverStat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Service
public class DriverStatInfoServiceImpl implements DriverStatInfoService {

	private static Logger LOG = LoggerFactory
			.getLogger(DriverStatInfoService.class);
	@Autowired
	private DriverStatInfoDao dao;

	@Override
	public void save(DriverStatInfoEntity entity) {
		dao.save(entity);
	}

	@Override
	public void update(DriverStatInfoEntity entity) {
		entity = dao.merge(entity);
		dao.update(entity);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public void operate(BaseInfoDriverStat entity) {
		Map<String, Object> map = new HashMap<>();
		map.put("companyId", entity.getCompanyId());
		map.put("licenseId", entity.getLicenseId());
		DriverStatInfoEntity qentity = dao
				.unique("from DriverStatInfoEntity where companyId =:companyId and licenseId =:licenseId",
						map);
		DriverStatInfoEntity model = new DriverStatInfoEntity();
		model.setAddress(entity.getAddress());
		model.setCompanyId(entity.getCompanyId());
		model.setComplainedCount(String.valueOf(entity.getComplainedCount()));
		model.setCycle(entity.getCycle());
		model.setFlag(entity.getFlag());
		model.setLicenseId(entity.getLicenseId());
		model.setOrderCount(String.valueOf(entity.getOrderCount()));
		model.setTrafficViolationCount(String.valueOf(entity
				.getTrafficViolationCount()));
		model.setUpdateTime(entity.getUpdateTime());

		if (model.getFlag().equals(TypeConstants.ADD_FLAG)) {
			this.save(model);
		} else if (model.getFlag().equals(TypeConstants.UPDATE_FLAG)
				|| model.getFlag().equals(TypeConstants.DELETE_FLAG)) {
			if (qentity != null) {
				model.setId(qentity.getId());
				this.update(model);
			}
		} else {
			LOG.error(String.format("类%s,操作标识有误：%s", this.getClass().getName(),
					String.valueOf(model.getFlag())));
		}

	}
}
