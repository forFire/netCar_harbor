package org.netCar.domain;

import javax.persistence.Entity;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@javax.persistence.Table(name = "driver_info")
public class DriverInfoEntity extends IdEntity{

	@javax.persistence.Column(name = "company_id", length = 32)
    private String companyId;


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @javax.persistence.Column(name = "address")
    private Integer address;


    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    @javax.persistence.Column(name = "driver_name", length = 64)
    private String driverName;


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @javax.persistence.Column(name = "driver_phone", length = 32)
    private String driverPhone;


    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    @javax.persistence.Column(name = "driver_gender", length = 2)
    private String driverGender;


    public String getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(String driverGender) {
        this.driverGender = driverGender;
    }

    @javax.persistence.Column(name = "driver_birthday")
    private Long driverBirthday;


    public Long getDriverBirthday() {
        return driverBirthday;
    }

    public void setDriverBirthday(Long driverBirthday) {
        this.driverBirthday = driverBirthday;
    }

    @javax.persistence.Column(name = "driver_nationality", length = 32)
    private String driverNationality;


    public String getDriverNationality() {
        return driverNationality;
    }

    public void setDriverNationality(String driverNationality) {
        this.driverNationality = driverNationality;
    }

    @javax.persistence.Column(name = "driver_nation", length = 32)
    private String driverNation;


    public String getDriverNation() {
        return driverNation;
    }

    public void setDriverNation(String driverNation) {
        this.driverNation = driverNation;
    }

    @javax.persistence.Column(name = "driver_marital_status", length = 64)
    private String driverMaritalStatus;


    public String getDriverMaritalStatus() {
        return driverMaritalStatus;
    }

    public void setDriverMaritalStatus(String driverMaritalStatus) {
        this.driverMaritalStatus = driverMaritalStatus;
    }

    @javax.persistence.Column(name = "driver_language_level", length = 64)
    private String driverLanguageLevel;


    public String getDriverLanguageLevel() {
        return driverLanguageLevel;
    }

    public void setDriverLanguageLevel(String driverLanguageLevel) {
        this.driverLanguageLevel = driverLanguageLevel;
    }

    @javax.persistence.Column(name = "driver_education", length = 64)
    private String driverEducation;


    public String getDriverEducation() {
        return driverEducation;
    }

    public void setDriverEducation(String driverEducation) {
        this.driverEducation = driverEducation;
    }

    @javax.persistence.Column(name = "driver_census", length = 256)
    private String driverCensus;


    public String getDriverCensus() {
        return driverCensus;
    }

    public void setDriverCensus(String driverCensus) {
        this.driverCensus = driverCensus;
    }

    @javax.persistence.Column(name = "driver_address", length = 256)
    private String driverAddress;


    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    @javax.persistence.Column(name = "driver_contact_address", length = 256)
    private String driverContactAddress;


    public String getDriverContactAddress() {
        return driverContactAddress;
    }

    public void setDriverContactAddress(String driverContactAddress) {
        this.driverContactAddress = driverContactAddress;
    }

    @javax.persistence.Column(name = "photo_id", length = 128)
    private String photoId;


    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    @javax.persistence.Column(name = "license_id", length = 32)
    private String licenseId;


    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    @javax.persistence.Column(name = "license_photo_id", length = 128)
    private String licensePhotoId;


    public String getLicensePhotoId() {
        return licensePhotoId;
    }

    public void setLicensePhotoId(String licensePhotoId) {
        this.licensePhotoId = licensePhotoId;
    }

    @javax.persistence.Column(name = "driver_type", length = 16)
    private String driverType;


    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    @javax.persistence.Column(name = "get_driver_license_date")
    private Long getDriverLicenseDate;


    public Long getGetDriverLicenseDate() {
        return getDriverLicenseDate;
    }

    public void setGetDriverLicenseDate(Long getDriverLicenseDate) {
        this.getDriverLicenseDate = getDriverLicenseDate;
    }

    @javax.persistence.Column(name = "driver_license_on")
    private Long driverLicenseOn;


    public Long getDriverLicenseOn() {
        return driverLicenseOn;
    }

    public void setDriverLicenseOn(Long driverLicenseOn) {
        this.driverLicenseOn = driverLicenseOn;
    }

    @javax.persistence.Column(name = "driver_license_off")
    private Long driverLicenseOff;


    public Long getDriverLicenseOff() {
        return driverLicenseOff;
    }

    public void setDriverLicenseOff(Long driverLicenseOff) {
        this.driverLicenseOff = driverLicenseOff;
    }

    @javax.persistence.Column(name = "taxi_driver")
    private Integer taxiDriver;


    public Integer getTaxiDriver() {
        return taxiDriver;
    }

    public void setTaxiDriver(Integer taxiDriver) {
        this.taxiDriver = taxiDriver;
    }

    @javax.persistence.Column(name = "certificate_no", length = 128)
    private String certificateNo;


    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    @javax.persistence.Column(name = "network_car_issue_organization", length = 256)
    private String networkCarIssueOrganization;


    public String getNetworkCarIssueOrganization() {
        return networkCarIssueOrganization;
    }

    public void setNetworkCarIssueOrganization(String networkCarIssueOrganization) {
        this.networkCarIssueOrganization = networkCarIssueOrganization;
    }

    @javax.persistence.Column(name = "network_car_issue_date")
    private Long networkCarIssueDate;


    public Long getNetworkCarIssueDate() {
        return networkCarIssueDate;
    }

    public void setNetworkCarIssueDate(Long networkCarIssueDate) {
        this.networkCarIssueDate = networkCarIssueDate;
    }

    @javax.persistence.Column(name = "get_network_car_proof_date")
    private Long getNetworkCarProofDate;


    public Long getGetNetworkCarProofDate() {
        return getNetworkCarProofDate;
    }

    public void setGetNetworkCarProofDate(Long getNetworkCarProofDate) {
        this.getNetworkCarProofDate = getNetworkCarProofDate;
    }

    @javax.persistence.Column(name = "network_car_proof_on")
    private Long networkCarProofOn;


    public Long getNetworkCarProofOn() {
        return networkCarProofOn;
    }

    public void setNetworkCarProofOn(Long networkCarProofOn) {
        this.networkCarProofOn = networkCarProofOn;
    }

    @javax.persistence.Column(name = "network_car_proof_off")
    private Long networkCarProofOff;


    public Long getNetworkCarProofOff() {
        return networkCarProofOff;
    }

    public void setNetworkCarProofOff(Long networkCarProofOff) {
        this.networkCarProofOff = networkCarProofOff;
    }

    @javax.persistence.Column(name = "register_date")
    private Long registerDate;


    public Long getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Long registerDate) {
        this.registerDate = registerDate;
    }

    @javax.persistence.Column(name = "fullTime_driver")
    private Integer fullTimeDriver;


    public Integer getFullTimeDriver() {
        return fullTimeDriver;
    }

    public void setFullTimeDriver(Integer fullTimeDriver) {
        this.fullTimeDriver = fullTimeDriver;
    }

    @javax.persistence.Column(name = "in_driver_blacklist")
    private Integer inDriverBlacklist;


    public Integer getInDriverBlacklist() {
        return inDriverBlacklist;
    }

    public void setInDriverBlacklist(Integer inDriverBlacklist) {
        this.inDriverBlacklist = inDriverBlacklist;
    }

    @javax.persistence.Column(name = "commercial_type")
    private Integer commercialType;


    public Integer getCommercialType() {
        return commercialType;
    }

    public void setCommercialType(Integer commercialType) {
        this.commercialType = commercialType;
    }

    @javax.persistence.Column(name = "contract_company", length = 256)
    private String contractCompany;


    public String getContractCompany() {
        return contractCompany;
    }

    public void setContractCompany(String contractCompany) {
        this.contractCompany = contractCompany;
    }

    @javax.persistence.Column(name = "contract_on")
    private Long contractOn;


    public Long getContractOn() {
        return contractOn;
    }

    public void setContractOn(Long contractOn) {
        this.contractOn = contractOn;
    }

    @javax.persistence.Column(name = "contract_off")
    private Long contractOff;


    public Long getContractOff() {
        return contractOff;
    }

    public void setContractOff(Long contractOff) {
        this.contractOff = contractOff;
    }

    @javax.persistence.Column(name = "emergency_contact", length = 64)
    private String emergencyContact;


    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    @javax.persistence.Column(name = "emergency_contact_phone", length = 32)
    private String emergencyContactPhone;


    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    @javax.persistence.Column(name = "emergency_contact_address", length = 256)
    private String emergencyContactAddress;


    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
    }

    @javax.persistence.Column(name = "state")
    private Integer state;


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

        DriverInfoEntity that = (DriverInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (driverName != null ? !driverName.equals(that.driverName) : that.driverName != null) return false;
        if (driverPhone != null ? !driverPhone.equals(that.driverPhone) : that.driverPhone != null) return false;
        if (driverGender != null ? !driverGender.equals(that.driverGender) : that.driverGender != null) return false;
        if (driverBirthday != null ? !driverBirthday.equals(that.driverBirthday) : that.driverBirthday != null)
            return false;
        if (driverNationality != null ? !driverNationality.equals(that.driverNationality) : that.driverNationality != null)
            return false;
        if (driverNation != null ? !driverNation.equals(that.driverNation) : that.driverNation != null) return false;
        if (driverMaritalStatus != null ? !driverMaritalStatus.equals(that.driverMaritalStatus) : that.driverMaritalStatus != null)
            return false;
        if (driverLanguageLevel != null ? !driverLanguageLevel.equals(that.driverLanguageLevel) : that.driverLanguageLevel != null)
            return false;
        if (driverEducation != null ? !driverEducation.equals(that.driverEducation) : that.driverEducation != null)
            return false;
        if (driverCensus != null ? !driverCensus.equals(that.driverCensus) : that.driverCensus != null) return false;
        if (driverAddress != null ? !driverAddress.equals(that.driverAddress) : that.driverAddress != null)
            return false;
        if (driverContactAddress != null ? !driverContactAddress.equals(that.driverContactAddress) : that.driverContactAddress != null)
            return false;
        if (photoId != null ? !photoId.equals(that.photoId) : that.photoId != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (licensePhotoId != null ? !licensePhotoId.equals(that.licensePhotoId) : that.licensePhotoId != null)
            return false;
        if (driverType != null ? !driverType.equals(that.driverType) : that.driverType != null) return false;
        if (getDriverLicenseDate != null ? !getDriverLicenseDate.equals(that.getDriverLicenseDate) : that.getDriverLicenseDate != null)
            return false;
        if (driverLicenseOn != null ? !driverLicenseOn.equals(that.driverLicenseOn) : that.driverLicenseOn != null)
            return false;
        if (driverLicenseOff != null ? !driverLicenseOff.equals(that.driverLicenseOff) : that.driverLicenseOff != null)
            return false;
        if (taxiDriver != null ? !taxiDriver.equals(that.taxiDriver) : that.taxiDriver != null) return false;
        if (certificateNo != null ? !certificateNo.equals(that.certificateNo) : that.certificateNo != null)
            return false;
        if (networkCarIssueOrganization != null ? !networkCarIssueOrganization.equals(that.networkCarIssueOrganization) : that.networkCarIssueOrganization != null)
            return false;
        if (networkCarIssueDate != null ? !networkCarIssueDate.equals(that.networkCarIssueDate) : that.networkCarIssueDate != null)
            return false;
        if (getNetworkCarProofDate != null ? !getNetworkCarProofDate.equals(that.getNetworkCarProofDate) : that.getNetworkCarProofDate != null)
            return false;
        if (networkCarProofOn != null ? !networkCarProofOn.equals(that.networkCarProofOn) : that.networkCarProofOn != null)
            return false;
        if (networkCarProofOff != null ? !networkCarProofOff.equals(that.networkCarProofOff) : that.networkCarProofOff != null)
            return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;
        if (fullTimeDriver != null ? !fullTimeDriver.equals(that.fullTimeDriver) : that.fullTimeDriver != null)
            return false;
        if (inDriverBlacklist != null ? !inDriverBlacklist.equals(that.inDriverBlacklist) : that.inDriverBlacklist != null)
            return false;
        if (commercialType != null ? !commercialType.equals(that.commercialType) : that.commercialType != null)
            return false;
        if (contractCompany != null ? !contractCompany.equals(that.contractCompany) : that.contractCompany != null)
            return false;
        if (contractOn != null ? !contractOn.equals(that.contractOn) : that.contractOn != null) return false;
        if (contractOff != null ? !contractOff.equals(that.contractOff) : that.contractOff != null) return false;
        if (emergencyContact != null ? !emergencyContact.equals(that.emergencyContact) : that.emergencyContact != null)
            return false;
        if (emergencyContactPhone != null ? !emergencyContactPhone.equals(that.emergencyContactPhone) : that.emergencyContactPhone != null)
            return false;
        if (emergencyContactAddress != null ? !emergencyContactAddress.equals(that.emergencyContactAddress) : that.emergencyContactAddress != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (driverName != null ? driverName.hashCode() : 0);
        result = 31 * result + (driverPhone != null ? driverPhone.hashCode() : 0);
        result = 31 * result + (driverGender != null ? driverGender.hashCode() : 0);
        result = 31 * result + (driverBirthday != null ? driverBirthday.hashCode() : 0);
        result = 31 * result + (driverNationality != null ? driverNationality.hashCode() : 0);
        result = 31 * result + (driverNation != null ? driverNation.hashCode() : 0);
        result = 31 * result + (driverMaritalStatus != null ? driverMaritalStatus.hashCode() : 0);
        result = 31 * result + (driverLanguageLevel != null ? driverLanguageLevel.hashCode() : 0);
        result = 31 * result + (driverEducation != null ? driverEducation.hashCode() : 0);
        result = 31 * result + (driverCensus != null ? driverCensus.hashCode() : 0);
        result = 31 * result + (driverAddress != null ? driverAddress.hashCode() : 0);
        result = 31 * result + (driverContactAddress != null ? driverContactAddress.hashCode() : 0);
        result = 31 * result + (photoId != null ? photoId.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (licensePhotoId != null ? licensePhotoId.hashCode() : 0);
        result = 31 * result + (driverType != null ? driverType.hashCode() : 0);
        result = 31 * result + (getDriverLicenseDate != null ? getDriverLicenseDate.hashCode() : 0);
        result = 31 * result + (driverLicenseOn != null ? driverLicenseOn.hashCode() : 0);
        result = 31 * result + (driverLicenseOff != null ? driverLicenseOff.hashCode() : 0);
        result = 31 * result + (taxiDriver != null ? taxiDriver.hashCode() : 0);
        result = 31 * result + (certificateNo != null ? certificateNo.hashCode() : 0);
        result = 31 * result + (networkCarIssueOrganization != null ? networkCarIssueOrganization.hashCode() : 0);
        result = 31 * result + (networkCarIssueDate != null ? networkCarIssueDate.hashCode() : 0);
        result = 31 * result + (getNetworkCarProofDate != null ? getNetworkCarProofDate.hashCode() : 0);
        result = 31 * result + (networkCarProofOn != null ? networkCarProofOn.hashCode() : 0);
        result = 31 * result + (networkCarProofOff != null ? networkCarProofOff.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (fullTimeDriver != null ? fullTimeDriver.hashCode() : 0);
        result = 31 * result + (inDriverBlacklist != null ? inDriverBlacklist.hashCode() : 0);
        result = 31 * result + (commercialType != null ? commercialType.hashCode() : 0);
        result = 31 * result + (contractCompany != null ? contractCompany.hashCode() : 0);
        result = 31 * result + (contractOn != null ? contractOn.hashCode() : 0);
        result = 31 * result + (contractOff != null ? contractOff.hashCode() : 0);
        result = 31 * result + (emergencyContact != null ? emergencyContact.hashCode() : 0);
        result = 31 * result + (emergencyContactPhone != null ? emergencyContactPhone.hashCode() : 0);
        result = 31 * result + (emergencyContactAddress != null ? emergencyContactAddress.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
