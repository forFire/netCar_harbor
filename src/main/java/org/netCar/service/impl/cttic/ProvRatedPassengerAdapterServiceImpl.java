package org.netCar.service.impl.cttic;

import org.netCar.service.DriverPunishService;
import org.netCar.service.DriverReputationService;
import org.netCar.service.PassengerComplaintService;
import org.netCar.service.PassengerEvaluationService;
import org.netCar.service.cttic.ProvRatedPassengerAdapterService;
import org.netCar.util.CtticDataUtils;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

@Service
public class ProvRatedPassengerAdapterServiceImpl implements ProvRatedPassengerAdapterService{
	
	private static Logger LOG = LoggerFactory.getLogger(ProvRatedPassengerAdapterServiceImpl.class);
	
	@Autowired
	private PassengerComplaintService passengerComplaintService;
	@Autowired
	private PassengerEvaluationService passengerEvaluationService;
	@Autowired
	private DriverPunishService driverPunishService;
	@Autowired
	private DriverReputationService driverReputationService;
	
	@Override
	public void adapterHandler(boolean batch,boolean compress,byte[] message) {
		LOG.info("adapter service ==> " + message.length);
		try {
			if (batch) {
				if (compress) {
					LOG.info("===" + OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList().size() + "===");
					
					for(OTIpc obj : OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList()){
                    	switch (obj.getIPCType()) {
						case ratedPassenger:
							for(OTIpcDef.RatedPassenger ratedPassenger : obj.getRatedPassengerList()){
								passengerEvaluationService.operationPassengerEvaluate(ratedPassenger);
                            }
							break;
						case ratedPassengerComplaint:
							for(OTIpcDef.RatedPassengerComplaint ratedPassengerComplaint : obj.getRatedPassengerComplaintList()){
								passengerComplaintService.operationPassengerComplaint(ratedPassengerComplaint);
                            }
							break;
						case ratedDriverPunish:
							for(OTIpcDef.RatedDriverPunish ratedDriverPunish : obj.getRatedDriverPunishList()){
								driverPunishService.operationDriverPunish(ratedDriverPunish);
                            }
							break;
						case ratedDriver:
							for(OTIpcDef.RatedDriver ratedDriver : obj.getRatedDriverList()){
								driverReputationService.operationDriverReputation(ratedDriver);
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
