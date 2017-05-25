package org.netCar.domain;

import javax.persistence.Entity;
import java.util.Arrays;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@javax.persistence.Table(name = "gm_company_business_license")
public class GmCompanyBusinessLicenseEntity  extends IdEntity{

	@javax.persistence.Column(name = "company_name", length = 32)
    private String companyName;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @javax.persistence.Column(name = "address_code")
    private Integer addressCode;


    public Integer getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(Integer addressCode) {
        this.addressCode = addressCode;
    }

    @javax.persistence.Column(name = "address_name", length = 64)
    private String addressName;


    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @javax.persistence.Column(name = "address", length = 128)
    private String address;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @javax.persistence.Column(name = "operating_state", length = 8)
    private String operatingState;


    public String getOperatingState() {
        return operatingState;
    }

    public void setOperatingState(String operatingState) {
        this.operatingState = operatingState;
    }

    @javax.persistence.Column(name = "economic_nature", length = 8)
    private String economicNature;


    public String getEconomicNature() {
        return economicNature;
    }

    public void setEconomicNature(String economicNature) {
        this.economicNature = economicNature;
    }

    @javax.persistence.Column(name = "latitude", precision = 0)
    private Double latitude;


    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @javax.persistence.Column(name = "longitude", precision = 0)
    private Double longitude;


    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @javax.persistence.Column(name = "operation_area", length = 128)
    private String operationArea;


    public String getOperationArea() {
        return operationArea;
    }

    public void setOperationArea(String operationArea) {
        this.operationArea = operationArea;
    }

    @javax.persistence.Column(name = "operation_area2", length = 128)
    private String operationArea2;


    public String getOperationArea2() {
        return operationArea2;
    }

    public void setOperationArea2(String operationArea2) {
        this.operationArea2 = operationArea2;
    }

    @javax.persistence.Column(name = "certificate", length = 64)
    private String certificate;


    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    @javax.persistence.Column(name = "start_date")
    private Integer startDate;


    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    @javax.persistence.Column(name = "stop_date")
    private Integer stopDate;


    public Integer getStopDate() {
        return stopDate;
    }

    public void setStopDate(Integer stopDate) {
        this.stopDate = stopDate;
    }

    @javax.persistence.Column(name = "organization", length = 256)
    private String organization;


    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @javax.persistence.Column(name = "certify_date")
    private Integer certifyDate;


    public Integer getCertifyDate() {
        return certifyDate;
    }

    public void setCertifyDate(Integer certifyDate) {
        this.certifyDate = certifyDate;
    }

    @javax.persistence.Column(name = "type")
    private byte[] type;


    public byte[] getType() {
        return type;
    }

    public void setType(byte[] type) {
        this.type = type;
    }

    @javax.persistence.Column(name = "flag")
    private Integer flag;


    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @javax.persistence.Column(name = "update_time")
    private Long updateTime;


    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GmCompanyBusinessLicenseEntity that = (GmCompanyBusinessLicenseEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (addressCode != null ? !addressCode.equals(that.addressCode) : that.addressCode != null) return false;
        if (addressName != null ? !addressName.equals(that.addressName) : that.addressName != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (operatingState != null ? !operatingState.equals(that.operatingState) : that.operatingState != null)
            return false;
        if (economicNature != null ? !economicNature.equals(that.economicNature) : that.economicNature != null)
            return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (operationArea != null ? !operationArea.equals(that.operationArea) : that.operationArea != null)
            return false;
        if (operationArea2 != null ? !operationArea2.equals(that.operationArea2) : that.operationArea2 != null)
            return false;
        if (certificate != null ? !certificate.equals(that.certificate) : that.certificate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (stopDate != null ? !stopDate.equals(that.stopDate) : that.stopDate != null) return false;
        if (organization != null ? !organization.equals(that.organization) : that.organization != null) return false;
        if (certifyDate != null ? !certifyDate.equals(that.certifyDate) : that.certifyDate != null) return false;
        if (!Arrays.equals(type, that.type)) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (addressCode != null ? addressCode.hashCode() : 0);
        result = 31 * result + (addressName != null ? addressName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (operatingState != null ? operatingState.hashCode() : 0);
        result = 31 * result + (economicNature != null ? economicNature.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (operationArea != null ? operationArea.hashCode() : 0);
        result = 31 * result + (operationArea2 != null ? operationArea2.hashCode() : 0);
        result = 31 * result + (certificate != null ? certificate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (stopDate != null ? stopDate.hashCode() : 0);
        result = 31 * result + (organization != null ? organization.hashCode() : 0);
        result = 31 * result + (certifyDate != null ? certifyDate.hashCode() : 0);
        result = 31 * result + (type != null ? Arrays.hashCode(type) : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
