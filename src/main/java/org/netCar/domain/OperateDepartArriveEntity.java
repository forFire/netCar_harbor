package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lyq on 2017/4/19.
 * 经营信息
 */
@Entity
@Table(name = "operate_depart_arrive")
public class OperateDepartArriveEntity  extends IdEntity{

	@Column(name = "company_id", length = 32)
    private String companyId;


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Column(name = "order_id", length = 64)
    private String orderId;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Column(name = "on_area")
    private Integer onArea;


    public Integer getOnArea() {
        return onArea;
    }

    public void setOnArea(Integer onArea) {
        this.onArea = onArea;
    }

    @Column(name = "driver_name", length = 64)
    private String driverName;


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Column(name = "license_id", length = 32)
    private String licenseId;


    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    @Column(name = "fare_type", length = 16)
    private String fareType;


    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    @Column(name = "vehicle_no", length = 32)
    private String vehicleNo;


    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    @Column(name = "book_dep_time")
    private Long bookDepTime;


    public Long getBookDepTime() {
        return bookDepTime;
    }

    public void setBookDepTime(Long bookDepTime) {
        this.bookDepTime = bookDepTime;
    }

    @Column(name = "wait_time")
    private Integer waitTime;


    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    @Column(name = "dep_longitude")
    private Double depLongitude;


    public Double getDepLongitude() {
        return depLongitude;
    }

    public void setDepLongitude(Double depLongitude) {
        this.depLongitude = depLongitude;
    }

    @Column(name = "dep_latitude")
    private Double depLatitude;


    public Double getDepLatitude() {
        return depLatitude;
    }

    public void setDepLatitude(Double depLatitude) {
        this.depLatitude = depLatitude;
    }

    @Column(name = "dep_area", length = 128)
    private String depArea;


    public String getDepArea() {
        return depArea;
    }

    public void setDepArea(String depArea) {
        this.depArea = depArea;
    }

    @Column(name = "dep_time")
    private Long depTime;


    public Long getDepTime() {
        return depTime;
    }

    public void setDepTime(Long depTime) {
        this.depTime = depTime;
    }

    @Column(name = "encrypt")
    private Integer encrypt;


    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
    }

    @Column(name = "dest_longitude")
    private Double destLongitude;


    public Double getDestLongitude() {
        return destLongitude;
    }

    public void setDestLongitude(Double destLongitude) {
        this.destLongitude = destLongitude;
    }

    @Column(name = "dest_latitude")
    private Double destLatitude;


    public Double getDestLatitude() {
        return destLatitude;
    }

    public void setDestLatitude(Double destLatitude) {
        this.destLatitude = destLatitude;
    }

    @Column(name = "dest_area", length = 128)
    private String destArea;


    public String getDestArea() {
        return destArea;
    }

    public void setDestArea(String destArea) {
        this.destArea = destArea;
    }

    @Column(name = "dest_time")
    private Long destTime;


    public Long getDestTime() {
        return destTime;
    }

    public void setDestTime(Long destTime) {
        this.destTime = destTime;
    }

    @Column(name = "book_model", length = 64)
    private String bookModel;


    public String getBookModel() {
        return bookModel;
    }

    public void setBookModel(String bookModel) {
        this.bookModel = bookModel;
    }

    @Column(name = "model", length = 64)
    private String model;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Column(name = "drive_mile")
    private float driveMile;


    public float getDriveMile() {
        return driveMile;
    }

    public void setDriveMile(float driveMile) {
        this.driveMile = driveMile;
    }

    @Column(name = "drive_time")
    private Integer driveTime;


    public Integer getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(Integer driveTime) {
        this.driveTime = driveTime;
    }

    @Column(name = "wait_mile")
    private Float waitMile;


    public Float getWaitMile() {
        return waitMile;
    }

    public void setWaitMile(Float waitMile) {
        this.waitMile = waitMile;
    }

    @Column(name = "fact_price")
    private float factPrice;


    public float getFactPrice() {
        return factPrice;
    }

    public void setFactPrice(float factPrice) {
        this.factPrice = factPrice;
    }

    @Column(name = "price")
    private float price;


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Column(name = "cash_price")
    private float cashPrice;


    public float getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(float cashPrice) {
        this.cashPrice = cashPrice;
    }

    @Column(name = "line_name", length = 64)
    private String lineName;


    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    @Column(name = "line_price")
    private float linePrice;


    public float getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(float linePrice) {
        this.linePrice = linePrice;
    }

    @Column(name = "pos_name", length = 64)
    private String posName;


    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    @Column(name = "pos_price")
    private float posPrice;


    public float getPosPrice() {
        return posPrice;
    }

    public void setPosPrice(float posPrice) {
        this.posPrice = posPrice;
    }

    @Column(name = "benfit_price")
    private float benfitPrice;


    public float getBenfitPrice() {
        return benfitPrice;
    }

    public void setBenfitPrice(float benfitPrice) {
        this.benfitPrice = benfitPrice;
    }

    @Column(name = "book_tip")
    private float bookTip;


    public float getBookTip() {
        return bookTip;
    }

    public void setBookTip(float bookTip) {
        this.bookTip = bookTip;
    }

    @Column(name = "passenger_tip")
    private float passengerTip;


    public float getPassengerTip() {
        return passengerTip;
    }

    public void setPassengerTip(float passengerTip) {
        this.passengerTip = passengerTip;
    }

    @Column(name = "peak_up_price")
    private float peakUpPrice;


    public float getPeakUpPrice() {
        return peakUpPrice;
    }

    public void setPeakUpPrice(float peakUpPrice) {
        this.peakUpPrice = peakUpPrice;
    }

    @Column(name = "night_up_price")
    private float nightUpPrice;


    public float getNightUpPrice() {
        return nightUpPrice;
    }

    public void setNightUpPrice(float nightUpPrice) {
        this.nightUpPrice = nightUpPrice;
    }

    @Column(name = "far_up_price")
    private float farUpPrice;


    public float getFarUpPrice() {
        return farUpPrice;
    }

    public void setFarUpPrice(float farUpPrice) {
        this.farUpPrice = farUpPrice;
    }

    @Column(name = "other_up_price")
    private float otherUpPrice;


    public float getOtherUpPrice() {
        return otherUpPrice;
    }

    public void setOtherUpPrice(float otherUpPrice) {
        this.otherUpPrice = otherUpPrice;
    }

    @Column(name = "pay_state", length = 32)
    private String payState;


    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    @Column(name = "pay_time")
    private Long payTime;


    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    @Column(name = "order_match_time")
    private Long orderMatchTime;


    public Long getOrderMatchTime() {
        return orderMatchTime;
    }

    public void setOrderMatchTime(Long orderMatchTime) {
        this.orderMatchTime = orderMatchTime;
    }

    @Column(name = "invoice_status", length = 32)
    private String invoiceStatus;


    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    private Integer isBeyondOperate;


    public Integer getIsBeyondOperate() {
        return isBeyondOperate;
    }

    public void setIsBeyondOperate(Integer isBeyondOperate) {
        this.isBeyondOperate = isBeyondOperate;
    }
    
}
