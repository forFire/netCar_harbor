package org.netCar.service.impl;

import org.netCar.dto.VehiclepositionJMS;
import org.netCar.service.VehiclepositionService;
import org.netCar.util.CtticDataUtils;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * Created by lyq on 2017/4/19.
 * 车辆定位信息
 */
@Service
public class VehiclepositionServiceImpl implements VehiclepositionService {

    private static Logger LOG = LoggerFactory.getLogger(VehiclepositionServiceImpl.class);
    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void operationVehiclePostion(boolean batch,boolean compress,byte[] message) {
    	LOG.info("adapter service ==> " + message.length);
		try {
			if (batch) {
				if (compress) {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList().size() + "===");
					for(OTIpc obj : OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList()){
                    	switch (obj.getIPCType()) {
						case positionVehicle:
							for(OTIpcDef.PositionVehicle p : obj.getPositionVehicleList()){
								VehiclepositionJMS jms =  new VehiclepositionJMS();
								jms.setBizStatus(p.getBizStatus());
								jms.setCompanyId(p.getCompanyId());
								jms.setDirection(p.getDirection());
								jms.setEncrypt(p.getEncrypt());
								jms.setLatitude(p.getLatitude());
								jms.setLongitude(p.getLongitude());
								jms.setSpeed(p.getSpeed());
								jms.setElevation(p.getElevation());
								jms.setVehicleNo(p.getVehicleNo());
								jms.setMileage(p.getMileage());
								jms.setVehicleRegionCode(p.getVehicleRegionCode());
								jms.setVehStatus(p.getVehStatus());
								jms.setOrderId(p.getOrderId());
								jms.setWarnStatus(p.getWarnStatus());
								jmsTemplate.send(jms);
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
