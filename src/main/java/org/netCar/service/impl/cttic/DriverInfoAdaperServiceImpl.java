package org.netCar.service.impl.cttic;

import org.netCar.service.DriverAppService;
import org.netCar.service.DriverEducateService;
import org.netCar.service.DriverInfoService;
import org.netCar.service.DriverStatInfoService;
import org.netCar.service.PassengerInfoService;
import org.netCar.service.cttic.DriverInfoAdapterService;
import org.netCar.util.CtticDataUtils;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

@Service
public class DriverInfoAdaperServiceImpl implements DriverInfoAdapterService {
	private static Logger LOG = LoggerFactory.getLogger(DriverInfoAdapterService.class);
	@Autowired
	private DriverInfoService driverInfoService;
	@Autowired
	private DriverEducateService driverEducateService;
	@Autowired
	private DriverAppService driverAppService;
	@Autowired
	private DriverStatInfoService driverStatInfoService;
	@Autowired
	private PassengerInfoService passengerInfoServie;

	@Override
	public void adapterHandler(boolean batch, boolean compress, byte[] message) {
		LOG.info("adapter service ==> " + message.length);
		try {
			if (batch) {
				if (compress) {
					LOG.info("==="
							+ OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList().size()
							+ "===");
					/*
					 * if (logMessage) {
					 * LOG.info(OTIpcDef.OTIpcList.parseFrom(decompress(message)
					 * ).getOtpicList().toString());
					 * 
					 * }
					 */
					for (OTIpc obj : OTIpcDef.OTIpcList.parseFrom(CtticDataUtils.decompress(message)).getOtpicList()) {
						switch (obj.getIPCType()) {
						case baseInfoDriver:
							for (OTIpcDef.BaseInfoDriver driver : obj.getBaseInfoDriverList()) {
								driverInfoService.operate(driver);
							}
							break;
						case baseInfoDriverEducate:
							for (OTIpcDef.BaseInfoDriverEducate edu : obj.getBaseInfoDriverEducateList()) {
								driverEducateService.operate(edu);
							}
							break;
						case baseInfoDriverApp:
							for (OTIpcDef.BaseInfoDriverApp app : obj.getBaseInfoDriverAppList()) {
								driverAppService.operate(app);
							}
							break;
						case baseInfoDriverStat:
							for (OTIpcDef.BaseInfoDriverStat stat : obj.getBaseInfoDriverStatList()) {
								driverStatInfoService.operate(stat);
							}
							break;
						case baseInfoPassenger:
							for (OTIpcDef.BaseInfoPassenger passenger : obj.getBaseInfoPassengerList()) {
								passengerInfoServie.operate(passenger);
							}
							break;
						default:
							LOG.error(String.format("%s获取IPCType有误:%s", this.getClass().getName(),
									obj.getIPCType().getNumber()));
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
