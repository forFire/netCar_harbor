package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@Table(name = "driver_punish")
public class DriverPunishEntity extends IdEntity{
	@Column(name = "company_id", length = 32)
    private String companyId;
	@Column(name = "license_id", length = 32)
    private String licenseId;
	@Column(name = "punish_time")
    private Long punishTime;
	@Column(name = "punish_reason", length = 128)
    private String punishReason;
	@Column(name = "punish_result", length = 128)
    private String punishResult;




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


    public Long getPunishTime() {
        return punishTime;
    }

    public void setPunishTime(Long punishTime) {
        this.punishTime = punishTime;
    }


    public String getPunishReason() {
        return punishReason;
    }

    public void setPunishReason(String punishReason) {
        this.punishReason = punishReason;
    }


    public String getPunishResult() {
        return punishResult;
    }

    public void setPunishResult(String punishResult) {
        this.punishResult = punishResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DriverPunishEntity that = (DriverPunishEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (licenseId != null ? !licenseId.equals(that.licenseId) : that.licenseId != null) return false;
        if (punishTime != null ? !punishTime.equals(that.punishTime) : that.punishTime != null) return false;
        if (punishReason != null ? !punishReason.equals(that.punishReason) : that.punishReason != null) return false;
        if (punishResult != null ? !punishResult.equals(that.punishResult) : that.punishResult != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (licenseId != null ? licenseId.hashCode() : 0);
        result = 31 * result + (punishTime != null ? punishTime.hashCode() : 0);
        result = 31 * result + (punishReason != null ? punishReason.hashCode() : 0);
        result = 31 * result + (punishResult != null ? punishResult.hashCode() : 0);
        return result;
    }
}
