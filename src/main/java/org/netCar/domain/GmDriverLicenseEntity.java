package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by lyq on 2017/4/19.
 */
@Entity
@Table(name = "gm_driver_license")
public class GmDriverLicenseEntity  extends IdEntity{

	@Column(name = "address")
    private Integer address;


    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    @Column(name = "driver_name", length = 64)
    private String driverName;


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Column(name = "driver_gender")
    private Integer driverGender;


    public Integer getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(Integer driverGender) {
        this.driverGender = driverGender;
    }

    @Column(name = "document_type")
    private Integer documentType;


    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    @Column(name = "id_number", length = 32)
    private String idNumber;


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Column(name = "nation", length = 32)
    private String nation;


    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Column(name = "driver_phone", length = 32)
    private String driverPhone;


    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    @Column(name = "driver_address", length = 256)
    private String driverAddress;


    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    @Column(name = "driver_education", length = 64)
    private String driverEducation;


    public String getDriverEducation() {
        return driverEducation;
    }

    public void setDriverEducation(String driverEducation) {
        this.driverEducation = driverEducation;
    }

    @Column(name = "technical_title", length = 32)
    private String technicalTitle;


    public String getTechnicalTitle() {
        return technicalTitle;
    }

    public void setTechnicalTitle(String technicalTitle) {
        this.technicalTitle = technicalTitle;
    }

    @Column(name = "employee_status", length = 32)
    private String employeeStatus;


    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    @Column(name = "household_registration", length = 32)
    private String householdRegistration;


    public String getHouseholdRegistration() {
        return householdRegistration;
    }

    public void setHouseholdRegistration(String householdRegistration) {
        this.householdRegistration = householdRegistration;
    }

    @Column(name = "certificate_no", length = 128)
    private String certificateNo;


    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    @Column(name = "driver_birthday")
    private Integer driverBirthday;


    public Integer getDriverBirthday() {
        return driverBirthday;
    }

    public void setDriverBirthday(Integer driverBirthday) {
        this.driverBirthday = driverBirthday;
    }

    @Column(name = "get_driver_license_date")
    private Date getDriverLicenseDate;


    public Date getGetDriverLicenseDate() {
        return getDriverLicenseDate;
    }

    public void setGetDriverLicenseDate(Date getDriverLicenseDate) {
        this.getDriverLicenseDate = getDriverLicenseDate;
    }

    @Column(name = "network_car_issue_date")
    private Integer networkCarIssueDate;


    public Integer getNetworkCarIssueDate() {
        return networkCarIssueDate;
    }

    public void setNetworkCarIssueDate(Integer networkCarIssueDate) {
        this.networkCarIssueDate = networkCarIssueDate;
    }

    @Column(name = "network_car_proof_on")
    private Integer networkCarProofOn;


    public Integer getNetworkCarProofOn() {
        return networkCarProofOn;
    }

    public void setNetworkCarProofOn(Integer networkCarProofOn) {
        this.networkCarProofOn = networkCarProofOn;
    }

    @Column(name = "network_car_proof_off")
    private Integer networkCarProofOff;


    public Integer getNetworkCarProofOff() {
        return networkCarProofOff;
    }

    public void setNetworkCarProofOff(Integer networkCarProofOff) {
        this.networkCarProofOff = networkCarProofOff;
    }

    @Column(name = "network_car_issue_organization", length = 256)
    private String networkCarIssueOrganization;


    public String getNetworkCarIssueOrganization() {
        return networkCarIssueOrganization;
    }

    public void setNetworkCarIssueOrganization(String networkCarIssueOrganization) {
        this.networkCarIssueOrganization = networkCarIssueOrganization;
    }

    @Column(name = "network_car_issue_organization_code", length = 32)
    private String networkCarIssueOrganizationCode;


    public String getNetworkCarIssueOrganizationCode() {
        return networkCarIssueOrganizationCode;
    }

    public void setNetworkCarIssueOrganizationCode(String networkCarIssueOrganizationCode) {
        this.networkCarIssueOrganizationCode = networkCarIssueOrganizationCode;
    }

    @Column(name = "adhere_address", length = 32)
    private String adhereAddress;


    public String getAdhereAddress() {
        return adhereAddress;
    }

    public void setAdhereAddress(String adhereAddress) {
        this.adhereAddress = adhereAddress;
    }

    @Column(name = "card_type", length = 32)
    private String cardType;


    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Column(name = "ic_card", length = 32)
    private String icCard;


    public String getIcCard() {
        return icCard;
    }

    public void setIcCard(String icCard) {
        this.icCard = icCard;
    }

    @Column(name = "license_id", length = 32)
    private String licenseId;


    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    @Column(name = "emergency_contact", length = 64)
    private String emergencyContact;


    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    @Column(name = "emergency_contact_phone", length = 32)
    private String emergencyContactPhone;


    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    @Column(name = "emergency_contact_address", length = 256)
    private String emergencyContactAddress;


    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
    }

    @Column(name = "state")
    private Integer state;


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Column(name = "flag")
    private Integer flag;


    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Column(name = "update_time")
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

        GmDriverLicenseEntity that = (GmDriverLicenseEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (driverName != null ? !driverName.equals(that.driverName) : that.driverName != null) return false;
        if (driverGender != null ? !driverGender.equals(that.driverGender) : that.driverGender != null) return false;
        if (documentType != null ? !documentType.equals(that.documentType) : that.documentType != null) return false;
        if (idNumber != null ? !idNumber.equals(that.idNumber) : that.idNumber != null) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (driverPhone != null ? !driverPhone.equals(that.driverPhone) : that.driverPhone != null) return false;
        if (driverAddress != null ? !driverAddress.equals(that.driverAddress) : that.driverAddress != null)
            return false;
        if (driverEducation != null ? !driverEducation.equals(that.driverEducation) : that.driverEducation != null)
            return false;
        if (technicalTitle != null ? !technicalTitle.equals(that.technicalTitle) : that.technicalTitle != null)
            return false;
        if (employeeStatus != null ? !employeeStatus.equals(that.employeeStatus) : that.employeeStatus != null)
            return false;
        if (householdRegistration != null ? !householdRegistration.equals(that.householdRegistration) : that.householdRegistration != null)
            return false;
        if (certificateNo != null ? !certificateNo.equals(that.certificateNo) : that.certificateNo != null)
            return false;
        if (driverBirthday != null ? !driverBirthday.equals(that.driverBirthday) : that.driverBirthday != null)
            return false;
        if (getDriverLicenseDate != null ? !getDriverLicenseDate.equals(that.getDriverLicenseDate) : that.getDriverLicenseDate != null)
            return false;
        if (networkCarIssueDate != null ? !networkCarIssueDate.equals(that.networkCarIssueDate) : that.networkCarIssueDate != null)
            return false;
        if (networkCarProofOn != null ? !networkCarProofOn.equals(that.networkCarProofOn) : that.networkCarProofOn != null)
            return false;
        if (networkCarProofOff != null ? !networkCarProofOff.equals(that.networkCarProofOff) : that.networkCarProofOff != null)
            return false;
        if (networkCarIssueOrganization != null ? !networkCarIssueOrganization.equals(that.networkCarIssueOrganization) : that.networkCarIssueOrganization != null)
            return false;
        if (networkCarIssueOrganizationCode != null ? !networkCarIssueOrganizationCode.equals(that.networkCarIssueOrganizationCode) : that.networkCarIssueOrganizationCode != null)
            return false;
        if (adhereAddress != null ? !adhereAddress.equals(that.adhereAddress) : that.adhereAddress != null)
            return false;
        if (cardType != null ? !cardType.equals(that.cardType) : that.cardType != null) return false;
        if (icCard != null ? !icCard.equals(that.icCard) : that.icCard != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
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
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (driverName != null ? driverName.hashCode() : 0);
        result = 31 * result + (driverGender != null ? driverGender.hashCode() : 0);
        result = 31 * result + (documentType != null ? documentType.hashCode() : 0);
        result = 31 * result + (idNumber != null ? idNumber.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (driverPhone != null ? driverPhone.hashCode() : 0);
        result = 31 * result + (driverAddress != null ? driverAddress.hashCode() : 0);
        result = 31 * result + (driverEducation != null ? driverEducation.hashCode() : 0);
        result = 31 * result + (technicalTitle != null ? technicalTitle.hashCode() : 0);
        result = 31 * result + (employeeStatus != null ? employeeStatus.hashCode() : 0);
        result = 31 * result + (householdRegistration != null ? householdRegistration.hashCode() : 0);
        result = 31 * result + (certificateNo != null ? certificateNo.hashCode() : 0);
        result = 31 * result + (driverBirthday != null ? driverBirthday.hashCode() : 0);
        result = 31 * result + (getDriverLicenseDate != null ? getDriverLicenseDate.hashCode() : 0);
        result = 31 * result + (networkCarIssueDate != null ? networkCarIssueDate.hashCode() : 0);
        result = 31 * result + (networkCarProofOn != null ? networkCarProofOn.hashCode() : 0);
        result = 31 * result + (networkCarProofOff != null ? networkCarProofOff.hashCode() : 0);
        result = 31 * result + (networkCarIssueOrganization != null ? networkCarIssueOrganization.hashCode() : 0);
        result = 31 * result + (networkCarIssueOrganizationCode != null ? networkCarIssueOrganizationCode.hashCode() : 0);
        result = 31 * result + (adhereAddress != null ? adhereAddress.hashCode() : 0);
        result = 31 * result + (cardType != null ? cardType.hashCode() : 0);
        result = 31 * result + (icCard != null ? icCard.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (emergencyContact != null ? emergencyContact.hashCode() : 0);
        result = 31 * result + (emergencyContactPhone != null ? emergencyContactPhone.hashCode() : 0);
        result = 31 * result + (emergencyContactAddress != null ? emergencyContactAddress.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
