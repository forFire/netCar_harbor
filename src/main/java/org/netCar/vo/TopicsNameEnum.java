package org.netCar.vo;

public enum TopicsNameEnum {
	
	PROVCOMPANYINFO("公司信息接口","ProvCompanyInfo","ProvCompany,ProvCompanyStat,ProvCompanyPay,ProvCompanyService,ProvCompanyPermit,ProvCompanyFare",true),
	PROVVEHICLEINFO("车辆信息","ProvVehicleInfo","ProvVehicle,ProvVehicleInsurance,ProvVehicleTotalMile",true),
	PROVDRIVERINFO("驾驶员接口","ProvDriverInfo","ProvDriver,ProvDriverEducate,ProvDriverApp,ProvDriverStat,ProvPassenger",true),
	PROVORDERINFO("订单接口","ProvOrderInfo","ProvOrderCreate,ProvOrderMatch,ProvOrderCancel",true),
	PROVOPERATEINFO("经营接口","ProvOperateInfo","ProvOperateLogin,ProvOperateLogout,ProvOperateDepart,ProvOperateArrive,ProvOperatePay",true),
	PROVPOSITIONDRIVER("驾驶员定位信息","ProvPositionDriver","ProvPositionDriver",true),
	PROVPOSITIONVEHICLE("车辆定位信息接口","ProvPositionVehicle","ProvPositionVehicle",true),
	PROVRATEDPASSENGER("评价及投诉接口","ProvRatedPassenger","ProvRatedPassenger,ProvPassengerComplaint,ProvDriverPunish,ProvRatedDriver",true);
	
	private String zhName;
	private String topics;
	private String serviceName;
	private boolean enable;
	
	private TopicsNameEnum(String zhName,String serviceName,String topics,boolean enable){
		this.zhName = zhName;
		this.serviceName = serviceName;
		this.topics = topics;
		this.enable = enable;
	}

	public String getZhName() {
		return zhName;
	}

	public void setZhName(String zhName) {
		this.zhName = zhName;
	}

	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	

}
