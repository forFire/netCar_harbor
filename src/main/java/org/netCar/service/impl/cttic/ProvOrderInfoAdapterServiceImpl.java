package org.netCar.service.impl.cttic;

import org.netCar.service.OrderInfoService;
import org.netCar.service.cttic.ProvOrderInfoAdapterService;
import org.netCar.util.CtticDataUtils;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

@Service
public class ProvOrderInfoAdapterServiceImpl implements ProvOrderInfoAdapterService{
	
	private static Logger LOG = LoggerFactory.getLogger(ProvOrderInfoAdapterServiceImpl.class);
	
	@Autowired
	private OrderInfoService orderInfoService;
	
	@Override
	public void adapterHandler(boolean batch,boolean compress,byte[] message) {
		LOG.info("adapter service ==> " + message.length);
		try {
			if (batch) {
				if (compress) {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList().size() + "===");
					/*if (logMessage) {
						LOG.info(OTIpcDef.OTIpcList.parseFrom(decompress(message)).getOtpicList().toString());
						
					}*/
					for(OTIpc obj : OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList()){
                    	switch (obj.getIPCType()) {
						case orderCreate:
							for(OTIpcDef.OrderCreate orderCreate : obj.getOrderCreateList()){
								orderInfoService.operateOrderCreate(orderCreate);
                            }
							break;
						case orderMatch:
							for(OTIpcDef.OrderMatch orderMatch : obj.getOrderMatchList()){
								orderInfoService.operateOrderMatch(orderMatch);
                            }
							break;
						case orderCancel:
							for(OTIpcDef.OrderCancel orderCancel : obj.getOrderCancelList()){
								orderInfoService.operateOrderCancel(orderCancel);
                            }
							break;	
						default:
							LOG.error("order operation error:not find match type{}",obj.getIPCType());
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
