package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@Table(name = "driver_stat_info")
public class DriverStatInfoEntity  extends IdEntity{
	@Column(name = "company_id", length = 32)
    private String companyId;
	@Column(name = "address")
    private Integer address;
	@Column(name = "license_id", length = 32)
    private String licenseId;
	@Column(name = "cycle")
    private Long cycle;
	@Column(name = "order_count", length = 10)
    private String orderCount;
	@Column(name = "traffic_violation_count", length = 32)
    private String trafficViolationCount;
	@Column(name = "complained_count", length = 32)
    private String complainedCount;
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


    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }


    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }


    public Long getCycle() {
        return cycle;
    }

    public void setCycle(Long cycle) {
        this.cycle = cycle;
    }


    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }


    public String getTrafficViolationCount() {
        return trafficViolationCount;
    }

    public void setTrafficViolationCount(String trafficViolationCount) {
        this.trafficViolationCount = trafficViolationCount;
    }


    public String getComplainedCount() {
        return complainedCount;
    }

    public void setComplainedCount(String complainedCount) {
        this.complainedCount = complainedCount;
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

        DriverStatInfoEntity that = (DriverStatInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (cycle != null ? !cycle.equals(that.cycle) : that.cycle != null) return false;
        if (orderCount != null ? !orderCount.equals(that.orderCount) : that.orderCount != null) return false;
        if (trafficViolationCount != null ? !trafficViolationCount.equals(that.trafficViolationCount) : that.trafficViolationCount != null)
            return false;
        if (complainedCount != null ? !complainedCount.equals(that.complainedCount) : that.complainedCount != null)
            return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (cycle != null ? cycle.hashCode() : 0);
        result = 31 * result + (orderCount != null ? orderCount.hashCode() : 0);
        result = 31 * result + (trafficViolationCount != null ? trafficViolationCount.hashCode() : 0);
        result = 31 * result + (complainedCount != null ? complainedCount.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
