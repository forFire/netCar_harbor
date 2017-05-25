package org.netCar.service.impl.cttic;

import org.netCar.service.OperateDepartArriveService;
import org.netCar.service.OperateLogInOutService;
import org.netCar.service.cttic.ProvOperateInfoAdapterService;
import org.netCar.util.CtticDataUtils;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

@Service
public class ProvOperateInfoAdapterServiceImpl implements ProvOperateInfoAdapterService{
	
	private static Logger LOG = LoggerFactory.getLogger(ProvOperateInfoAdapterServiceImpl.class);
	
	@Autowired
	private OperateLogInOutService operateLogInOutService;
	
	@Autowired
	private OperateDepartArriveService operateDepartArriveService;
	
	@Override
	public void adapterHandler(boolean batch,boolean compress,byte[] message) {
		LOG.info("adapter service ==> " + message.length);
		try {
			if (batch) {
				if (compress) {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList().size() + "===");
					for(OTIpc obj : OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList()){
                    	switch (obj.getIPCType()) {
						case operateLogin:
							for(OTIpcDef.OperateLogin operateLogin : obj.getOperateLoginList()){
								operateLogInOutService.operationLogInData(operateLogin);
                            }
							break;
						case operateLogout:
							for(OTIpcDef.OperateLogout operateLogout : obj.getOperateLogoutList()){
								operateLogInOutService.operationLogOutData(operateLogout);
                            }
							break;
						case operateDepart:
							for(OTIpcDef.OperateDepart operateDepart : obj.getOperateDepartList()){
								operateDepartArriveService.operateDepartData(operateDepart);
                            }
							break;
						case operateArrive:
							for(OTIpcDef.OperateArrive operateArrive : obj.getOperateArriveList()){
								operateDepartArriveService.operateArriveData(operateArrive);
                            }
							break;
						case operatePay:
							for(OTIpcDef.OperatePay operatePay : obj.getOperatePayList()){
								operateDepartArriveService.operatePayData(operatePay);
                            }
							break;
						default:
							break;
						}
             
                    }
					
				} else {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(message).getOtpicList().size() + "===");
				}
			} else {
				LOG.info("===" + OTIpcDef.OTIpc.parseFrom(message).toString() + "===");
			}
		} catch (InvalidProtocolBufferException e) {
			LOG.error("", e);
		}
		
	}
	
}
