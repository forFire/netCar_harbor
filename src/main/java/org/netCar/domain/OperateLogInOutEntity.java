package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lyq on 2017/4/19.
 * 车辆经营上下线
 */
@Entity
@Table(name = "operate_log_in_out")
public class OperateLogInOutEntity  extends IdEntity{
	
	@Column(name = "company_id", length = 32)
    private String companyId;
	@Column(name = "license_id", length = 32)
    private String licenseId;
	@Column(name = "vehicle_no", length = 32)
    private String vehicleNo;
	@Column(name = "login_time")
    private Long loginTime;
	@Column(name = "in_longitude")
    private Double inLongitude;
    @Column(name = "in_latitude")
    private Double inLatitude;
    @Column(name = "in_encrypt")
    private Integer inEncrypt;
    @Column(name = "logout_time")
    private Long logoutTime;
    @Column(name = "out_longitude")
    private Double outLongitude;
    @Column(name = "out_latitude")
    private Double outLatitude;
    @Column(name = "out_encrypt")
    private Integer outEncrypt;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }


    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    public Long getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Long loginTime) {
        this.loginTime = loginTime;
    }


    public Double getInLongitude() {
        return inLongitude;
    }

    public void setInLongitude(Double inLongitude) {
        this.inLongitude = inLongitude;
    }


    public Double getInLatitude() {
        return inLatitude;
    }

    public void setInLatitude(Double inLatitude) {
        this.inLatitude = inLatitude;
    }


    public Integer getInEncrypt() {
        return inEncrypt;
    }

    public void setInEncrypt(Integer inEncrypt) {
        this.inEncrypt = inEncrypt;
    }


    public Long getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Long logoutTime) {
        this.logoutTime = logoutTime;
    }


    public Double getOutLongitude() {
        return outLongitude;
    }

    public void setOutLongitude(Double outLongitude) {
        this.outLongitude = outLongitude;
    }


    public Double getOutLatitude() {
        return outLatitude;
    }

    public void setOutLatitude(Double outLatitude) {
        this.outLatitude = outLatitude;
    }


    public Integer getOutEncrypt() {
        return outEncrypt;
    }

    public void setOutEncrypt(Integer outEncrypt) {
        this.outEncrypt = outEncrypt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperateLogInOutEntity that = (OperateLogInOutEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (loginTime != null ? !loginTime.equals(that.loginTime) : that.loginTime != null) return false;
        if (inLongitude != null ? !inLongitude.equals(that.inLongitude) : that.inLongitude != null) return false;
        if (inLatitude != null ? !inLatitude.equals(that.inLatitude) : that.inLatitude != null) return false;
        if (inEncrypt != null ? !inEncrypt.equals(that.inEncrypt) : that.inEncrypt != null) return false;
        if (logoutTime != null ? !logoutTime.equals(that.logoutTime) : that.logoutTime != null) return false;
        if (outLongitude != null ? !outLongitude.equals(that.outLongitude) : that.outLongitude != null) return false;
        if (outLatitude != null ? !outLatitude.equals(that.outLatitude) : that.outLatitude != null) return false;
        if (outEncrypt != null ? !outEncrypt.equals(that.outEncrypt) : that.outEncrypt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (loginTime != null ? loginTime.hashCode() : 0);
        result = 31 * result + (inLongitude != null ? inLongitude.hashCode() : 0);
        result = 31 * result + (inLatitude != null ? inLatitude.hashCode() : 0);
        result = 31 * result + (inEncrypt != null ? inEncrypt.hashCode() : 0);
        result = 31 * result + (logoutTime != null ? logoutTime.hashCode() : 0);
        result = 31 * result + (outLongitude != null ? outLongitude.hashCode() : 0);
        result = 31 * result + (outLatitude != null ? outLatitude.hashCode() : 0);
        result = 31 * result + (outEncrypt != null ? outEncrypt.hashCode() : 0);
        return result;
    }
}
