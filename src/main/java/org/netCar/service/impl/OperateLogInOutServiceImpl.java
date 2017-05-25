package org.netCar.service.impl;

import org.netCar.dao.OperateLogInOutDao;
import org.netCar.domain.OperateLogInOutEntity;
import org.netCar.service.OperateLogInOutService;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OperateLogin;
import org.netCar.vo.OTIpcDef.OperateLogout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lyq on 2017/4/19.
 */
@Service
public class OperateLogInOutServiceImpl implements OperateLogInOutService {
	
	private static Logger LOG = LoggerFactory.getLogger(OperateLogInOutServiceImpl.class);
	
    @Autowired
    private OperateLogInOutDao operateLogInOutDao;

	@Override
	public void operationLogInData(OperateLogin operateLogin) {
		OperateLogInOutEntity entity = transToModelFromLogin(operateLogin);
		if(null == entity){
			LOG.info("operationLogInData error:entity is null "); 
    		return ;
		}
		operateLogInOutDao.save(entity);
	}

	@Override
	public void operationLogOutData(OperateLogout operateLogout) {
		OperateLogInOutEntity entity = transToModelFromLogout(operateLogout);
		if(null == entity){
			LOG.info("operateLogout error:entity is null "); 
    		return ;
		}
		operateLogInOutDao.save(entity);
		
	}
	
	/**
     * 运营上线 转化model
     * @param operateLogin
     * @return
     */
    private OperateLogInOutEntity transToModelFromLogin(OTIpcDef.OperateLogin operateLogin){
    	OperateLogInOutEntity entity = new OperateLogInOutEntity();
    	
    	if(null == operateLogin){
    		LOG.info("transToModelFromLogin error : operateLogin is null");
    		return null;
    	}
    	
    	entity.setCompanyId(operateLogin.getCompanyId());
    	entity.setLicenseId(operateLogin.getLicenseId());
    	entity.setVehicleNo(operateLogin.getVehicleNo());
    	entity.setLoginTime(operateLogin.getLoginTime());
    	entity.setInLongitude((double)operateLogin.getLongitude() / 1000000);
    	entity.setInLatitude((double)operateLogin.getLatitude()/1000000);
    	entity.setInEncrypt(operateLogin.getEncrypt());
		return entity;
    }
    
    /**
     * 运营下线 转化model
     * @param operateLogout
     * @return
     */
    private OperateLogInOutEntity transToModelFromLogout(OTIpcDef.OperateLogout operateLogout){
    	
    	OperateLogInOutEntity entity = new OperateLogInOutEntity();
    	
    	if(null == operateLogout){
    		LOG.info("transToModelFromLogout error : operateLogout is null");
    		return null;
    	}
    	
    	entity.setCompanyId(operateLogout.getCompanyId());
    	entity.setLicenseId(operateLogout.getLicenseId());
    	entity.setVehicleNo(operateLogout.getVehicleNo());
    	entity.setLogoutTime(operateLogout.getLogoutTime());
    	entity.setOutLongitude((double)operateLogout.getLongitude() / 1000000);
    	entity.setOutLatitude((double)operateLogout.getLatitude()/1000000);
    	entity.setOutEncrypt(operateLogout.getEncrypt());
    	
		return entity;
    }
    
}
