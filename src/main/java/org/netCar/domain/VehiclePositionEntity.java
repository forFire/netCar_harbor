package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lyq on 2017/4/19.
 * 车辆定位信息
 */
@Entity
@Table(name = "vehicle_position")
public class VehiclePositionEntity extends IdEntity {

    //公司标识
    @Column(name = "company_id", length = 32)
    private String companyId;
    //车辆号牌
    @Column(name = "vehicle_no", length = 32)
    private String vehicleNo;
    //行政区划代码
    @Column(name = "vehicle_region_code")
    private Integer vehicleRegionCode;
    //定位时间
    @Column(name = "position_time")
    private Long positionTime;
    //经度
    @Column(name = "longitude")
    private Integer longitude;
    //纬度
    @Column(name = "latitude")
    private Integer latitude;
    //瞬时速度
    @Column(name = "speed")
    private Integer speed;
    //方向角
    @Column(name = "direction")
    private Integer direction;
    //海拔高度
    @Column(name = "elevation")
    private Integer elevation;
    //行驶里程
    @Column(name = "mileage")
    private Integer mileage;
    //坐标加密标识
    @Column(name = "encrypt")
    private Integer encrypt;
    //预警状态
    @Column(name = "warn_status")
    private Integer warnStatus;
    //车辆状态
    @Column(name = "veh_status")
    private Integer vehStatus;
    //营运状态
    @Column(name = "biz_status")
    private Integer bizStatus;
    //订单编号
    @Column(name = "order_id", length = 64)
    private String orderId;


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    public Integer getVehicleRegionCode() {
        return vehicleRegionCode;
    }

    public void setVehicleRegionCode(Integer vehicleRegionCode) {
        this.vehicleRegionCode = vehicleRegionCode;
    }


    public Long getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(Long positionTime) {
        this.positionTime = positionTime;
    }


    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }


    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }


    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }


    public Integer getElevation() {
        return elevation;
    }

    public void setElevation(Integer elevation) {
        this.elevation = elevation;
    }


    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }


    public Integer getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Integer encrypt) {
        this.encrypt = encrypt;
    }


    public Integer getWarnStatus() {
        return warnStatus;
    }

    public void setWarnStatus(Integer warnStatus) {
        this.warnStatus = warnStatus;
    }


    public Integer getVehStatus() {
        return vehStatus;
    }

    public void setVehStatus(Integer vehStatus) {
        this.vehStatus = vehStatus;
    }


    public Integer getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(Integer bizStatus) {
        this.bizStatus = bizStatus;
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


}
