package org.netCar.service.impl;

import org.netCar.service.DriverPositionService;
import org.netCar.util.CtticDataUtils;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.InvalidProtocolBufferException;

public class DriverPositionServiceImpl implements DriverPositionService{
	
	private static Logger LOG = LoggerFactory.getLogger(DriverPositionServiceImpl.class);
	
	@Override
	public void operationDriverPostion(boolean batch, boolean compress, byte[] message) {
		LOG.info("operationDriverPostion ==> " + message.length);
		try {
			if (batch) {
				if (compress) {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList().size() + "===");
					for(OTIpc obj : OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList()){
                    	switch (obj.getIPCType()) {
						case positionDriver:
							for(OTIpcDef.PositionDriver positionDriver : obj.getPositionDriverList()){
								//TODO解析为json 存放到mq
					
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
