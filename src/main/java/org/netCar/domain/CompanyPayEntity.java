package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@Table(name = "company_pay")
public class CompanyPayEntity extends IdEntity{
	@Column(name = "company_id", length = 32)
    private String companyId;
	@Column(name = "pay_name", length = 256)
    private String payName;
	@Column(name = "pay_id", length = 32)
    private String payId;
	@Column(name = "pay_type", length = 64)
    private String payType;
	@Column(name = "pay_scope", length = 64)
    private String payScope;
	@Column(name = "prepare_bank", length = 256)
    private String prepareBank;
	@Column(name = "count_date", length = 10)
    private String countDate;
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


    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }


    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }


    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }


    public String getPayScope() {
        return payScope;
    }

    public void setPayScope(String payScope) {
        this.payScope = payScope;
    }


    public String getPrepareBank() {
        return prepareBank;
    }

    public void setPrepareBank(String prepareBank) {
        this.prepareBank = prepareBank;
    }


    public String getCountDate() {
        return countDate;
    }

    public void setCountDate(String countDate) {
        this.countDate = countDate;
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

        CompanyPayEntity that = (CompanyPayEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (payName != null ? !payName.equals(that.payName) : that.payName != null) return false;
        if (payId != null ? !payId.equals(that.payId) : that.payId != null) return false;
        if (payType != null ? !payType.equals(that.payType) : that.payType != null) return false;
        if (payScope != null ? !payScope.equals(that.payScope) : that.payScope != null) return false;
        if (prepareBank != null ? !prepareBank.equals(that.prepareBank) : that.prepareBank != null) return false;
        if (countDate != null ? !countDate.equals(that.countDate) : that.countDate != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (payName != null ? payName.hashCode() : 0);
        result = 31 * result + (payId != null ? payId.hashCode() : 0);
        result = 31 * result + (payType != null ? payType.hashCode() : 0);
        result = 31 * result + (payScope != null ? payScope.hashCode() : 0);
        result = 31 * result + (prepareBank != null ? prepareBank.hashCode() : 0);
        result = 31 * result + (countDate != null ? countDate.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
