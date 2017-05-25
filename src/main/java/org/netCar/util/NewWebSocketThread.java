package org.netCar.util;

import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.netCar.service.DriverPositionService;
import org.netCar.service.VehiclepositionService;
import org.netCar.service.cttic.CompanyInfoAdapterService;
import org.netCar.service.cttic.DriverInfoAdapterService;
import org.netCar.service.cttic.ProvOperateInfoAdapterService;
import org.netCar.service.cttic.ProvOrderInfoAdapterService;
import org.netCar.service.cttic.ProvRatedPassengerAdapterService;
import org.netCar.service.cttic.VehicleInfoAdapterService;
import org.netCar.service.impl.WebsocketClientEndpoint;
import org.netCar.vo.TopicsNameEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class NewWebSocketThread implements Runnable {  
	
	private static Logger LOG = LoggerFactory.getLogger(NewWebSocketThread.class);
	
	@Autowired
	private CompanyInfoAdapterService  provCompanyInfoAdapterService;
	@Autowired
	private DriverInfoAdapterService driverInfoAdapterService ;
	@Autowired
	private VehicleInfoAdapterService vehicleInfoAdapterService;
	@Autowired
	private ProvOrderInfoAdapterService provOrderInfoAdapterService;
	@Autowired
	private ProvOperateInfoAdapterService provOperateInfoAdapterService;
	@Autowired
	private ProvRatedPassengerAdapterService provRatedPassengerAdapterService;
	@Autowired
	private VehiclepositionService vehiclepositionService;
	@Autowired
	private DriverPositionService driverPositionService;
	
	private String serverBaseUri;

	private String offsetReset;

	private long timeout;

	private boolean batch;

	private boolean compress;

	private boolean logMessage;
	
	private String token;
	
	private TopicsNameEnum topicsEnum;
	
	
    public NewWebSocketThread( String token, TopicsNameEnum topicsEnum,
    		String serverBaseUri,String offsetReset,long timeout,boolean batch,boolean compress,
    		boolean logMessage) {  
        this.token = token;  
        this.topicsEnum = topicsEnum;
        this.serverBaseUri = serverBaseUri;
        this.offsetReset = offsetReset;
        this.timeout = timeout;
        this.batch = batch;
        this.compress = compress;
        this.logMessage = logMessage;
    }  
  
    @Override  
    public void run() {  
    	
    	LOG.info("serverBaseUri ==> " + serverBaseUri);
		LOG.info("topics ==> " + topicsEnum.getTopics());
		LOG.info("offsetReset ==> " + offsetReset);
		LOG.info("batch ==> " + batch);
		LOG.info("compress ==> " + compress);
		LOG.info("timeout ==> " + timeout);
		
		try{
			final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(
					new URI(new StringBuilder("ws://").append(serverBaseUri).append("/broker/?token=")
							.append(token).append("&topics=").append(topicsEnum.getTopics()).append("&offset_reset=")
							.append(offsetReset).toString()),
					message -> {
						LOG.info("message length ==> " + message.length);
						
						switch (topicsEnum.getServiceName()) {
						case "ProvCompanyInfo"://公司基本信息
							provCompanyInfoAdapterService.adapterHandler(batch,compress,message);
							break;
							
						case "ProvVehicleInfo"://车辆基本信息
							vehicleInfoAdapterService.adapterHandler(batch, compress, message);
							break;
							
						case "ProvDriverInfo"://驾驶员基本信息
							driverInfoAdapterService.adapterHandler(batch, compress, message);
							break;
							
						case "ProvOrderInfo"://订单信息
							provOrderInfoAdapterService.adapterHandler(batch, compress, message);
							break;
							
						case "ProvOperateInfo"://营运信息
							provOperateInfoAdapterService.adapterHandler(batch, compress, message);
							break;
							
						case "ProvPositionDriver"://驾驶员位置定位
							driverPositionService.operationDriverPostion(batch, compress, message);
							break;
							
						case "ProvPositionVehicle"://车辆位置定位
							vehiclepositionService.operationVehiclePostion(batch, compress, message);
							break;
							
						case "ProvRatedPassenger"://乘客评价信息
							provRatedPassengerAdapterService.adapterHandler(batch, compress, message);
							break;
						default:
							break;
						}
						
					});
			while (!Thread.currentThread().isInterrupted()) {
				try {
					TimeUnit.SECONDS.sleep(timeout);
					clientEndPoint.sendPing("test");
				}
				// 一般设计合理的阻塞方法都会响应中断，并抛出InterruptedException异常，需要捕获该异常并中断当前线程
				catch (InterruptedException e) {
					LOG.info("interrupted from TimeUnit#sleep() ==> " + Thread.currentThread().getName());
					Thread.currentThread().interrupt();
				}
			}
		} catch (Exception e) {
			LOG.error("", e);
		}
    	
    }  
     
}
