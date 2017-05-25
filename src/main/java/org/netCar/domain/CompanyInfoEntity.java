package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@Table(name = "company_info")
public class CompanyInfoEntity extends IdEntity{
	@Column(name = "company_id", length = 32)
    private String companyId;
	@Column(name = "company_name", length = 256)
    private String companyName;
	@Column(name = "identifier", length = 32)
    private String identifier;
	@Column(name = "address")
    private Integer address;
	@Column(name = "business_scope", length = 256)
    private String businessScope;
	@Column(name = "contact_address", length = 256)
    private String contactAddress;
	@Column(name = "economic_type", length = 128)
    private String economicType;
	@Column(name = "reg_capital", length = 128)
    private String regCapital;
	@Column(name = "legal_name", length = 256)
    private String legalName;
	@Column(name = "legal_ID", length = 32)
    private String legalId;
	@Column(name = "legal_phone", length = 32)
    private String legalPhone;
	@Column(name = "legal_photo", length = 128)
    private String legalPhoto;
	@Column(name = "state")
    private Integer state;
	@Column(name = "flag")
    private Integer flag;
	@Column(name = "update_time")
    private Long updateTime;




    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }


    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }


    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }


    public String getEconomicType() {
        return economicType;
    }

    public void setEconomicType(String economicType) {
        this.economicType = economicType;
    }


    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }


    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }


    public String getLegalId() {
        return legalId;
    }

    public void setLegalId(String legalId) {
        this.legalId = legalId;
    }


    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone;
    }


    public String getLegalPhoto() {
        return legalPhoto;
    }

    public void setLegalPhoto(String legalPhoto) {
        this.legalPhoto = legalPhoto;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }


    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }


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

        CompanyInfoEntity that = (CompanyInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (identifier != null ? !identifier.equals(that.identifier) : that.identifier != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (businessScope != null ? !businessScope.equals(that.businessScope) : that.businessScope != null)
            return false;
        if (contactAddress != null ? !contactAddress.equals(that.contactAddress) : that.contactAddress != null)
            return false;
        if (economicType != null ? !economicType.equals(that.economicType) : that.economicType != null) return false;
        if (regCapital != null ? !regCapital.equals(that.regCapital) : that.regCapital != null) return false;
        if (legalName != null ? !legalName.equals(that.legalName) : that.legalName != null) return false;
        if (legalId != null ? !legalId.equals(that.legalId) : that.legalId != null) return false;
        if (legalPhone != null ? !legalPhone.equals(that.legalPhone) : that.legalPhone != null) return false;
        if (legalPhoto != null ? !legalPhoto.equals(that.legalPhoto) : that.legalPhoto != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (businessScope != null ? businessScope.hashCode() : 0);
        result = 31 * result + (contactAddress != null ? contactAddress.hashCode() : 0);
        result = 31 * result + (economicType != null ? economicType.hashCode() : 0);
        result = 31 * result + (regCapital != null ? regCapital.hashCode() : 0);
        result = 31 * result + (legalName != null ? legalName.hashCode() : 0);
        result = 31 * result + (legalId != null ? legalId.hashCode() : 0);
        result = 31 * result + (legalPhone != null ? legalPhone.hashCode() : 0);
        result = 31 * result + (legalPhoto != null ? legalPhoto.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
