package org.netCar.service.impl.cttic;

import org.netCar.service.CompanyFareService;
import org.netCar.service.CompanyInfoService;
import org.netCar.service.CompanyPayService;
import org.netCar.service.CompanyPermitService;
import org.netCar.service.CompanyScaleService;
import org.netCar.service.CompanyServiceService;
import org.netCar.service.cttic.CompanyInfoAdapterService;
import org.netCar.util.CtticDataUtils;
import org.netCar.vo.OTIpcDef;
import org.netCar.vo.OTIpcDef.OTIpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.protobuf.InvalidProtocolBufferException;

@Service
public class CompanyInfoAdapterServiceImpl implements CompanyInfoAdapterService{
	
	private static Logger LOG = LoggerFactory.getLogger(CompanyInfoAdapterServiceImpl.class);
	
	@Autowired
	private CompanyInfoService companyInfoService;
	
	@Autowired
	private CompanyFareService companyFareService;
	@Autowired
	private CompanyServiceService companyServiceService;
	@Autowired
	private CompanyPayService companyPayService;
	@Autowired
	private CompanyPermitService companyPermitService;
	@Autowired
	private CompanyScaleService companyScaleService;
	
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
						case baseInfoCompany:
							for(OTIpcDef.BaseInfoCompany company : obj.getBaseInfoCompanyList()){
								companyInfoService.operate(company);
                            }
							break;
						case baseInfoCompanyService:
							for(OTIpcDef.BaseInfoCompanyService stat : obj.getBaseInfoCompanyServiceList()){
								companyServiceService.operate(stat);
                            }
							break;
						case baseInfoCompanyFare:
							for(OTIpcDef.BaseInfoCompanyFare fare: obj.getBaseInfoCompanyFareList()){
								companyFareService.operate(fare);
							}
							break;
						case baseInfoCompanyPay:
							for(OTIpcDef.BaseInfoCompanyPay pay : obj.getBaseInfoCompanyPayList()){
								companyPayService.operate(pay);
							}
							break;
						case baseInfoCompanyStat:
						    for(OTIpcDef.BaseInfoCompanyStat stat : obj.getBaseInfoCompanyStatList()){
						    	companyScaleService.operate(stat);
						    }
						    break;
						case baseInfoCompanyPermit:
							for(OTIpcDef.BaseInfoCompanyPermit permit : obj.getBaseInfoCompanyPermitList()){
								companyPermitService.operate(permit);
							}
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
