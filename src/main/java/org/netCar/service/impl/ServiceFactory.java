package org.netCar.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.netCar.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceFactory")
public class ServiceFactory {
    private static ServiceFactory f;

    @Autowired
    private CompanyInfoService companyInfoService;
    

    @PostConstruct
    public void init() {
        f = this;
        f.companyInfoService = this.companyInfoService;
        
    }


	public CompanyInfoService getCompanyInfoService() {
		return companyInfoService;
	}


	public void setCompanyInfoService(CompanyInfoService companyInfoService) {
		this.companyInfoService = companyInfoService;
	}
    

}
