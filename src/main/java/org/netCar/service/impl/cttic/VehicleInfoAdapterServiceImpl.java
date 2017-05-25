package org.netCar.service.impl.cttic;

import org.netCar.service.VehicleInsuranceService;
import org.netCar.service.VehicleTotalMileService;
import org.netCar.service.VehicleinfoService;
import org.netCar.service.cttic.VehicleInfoAdapterService;
import org.netCar.util.CtticDataUtils;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

@Service
public class VehicleInfoAdapterServiceImpl implements VehicleInfoAdapterService {
	private static Logger LOG = LoggerFactory.getLogger(VehicleInfoAdapterService.class);
	@Autowired
	private VehicleinfoService vehicleinfoService;
	@Autowired
	private VehicleInsuranceService vehicleInsuranceService;
	@Autowired
	private VehicleTotalMileService vehicleTotalMileService;
	
	@Override
	public void adapterHandler(boolean batch, boolean compress, byte[] message) {
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
						case baseInfoVehicle:
							for(OTIpcDef.BaseInfoVehicle vehicle : obj.getBaseInfoVehicleList()){
								vehicleinfoService.operate(vehicle);
                            }
							break;
						case baseInfoVehicleInsurance:
							for(OTIpcDef.BaseInfoVehicleInsurance stat : obj.getBaseInfoVehicleInsuranceList()){
								vehicleInsuranceService.operate(stat);
                            }
							break;
						case baseInfoVehicleTotalMile:
							for(OTIpcDef.BaseInfoVehicleTotalMile fare: obj.getBaseInfoVehicleTotalMileList()){
								vehicleTotalMileService.operate(fare);
							}
							break;
						
						default:
							LOG.error(String.format("%s获取IPCType有误:%s",this.getClass().getName(),obj.getIPCType().getNumber()));
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
