package org.netCar.domain;

import org.omg.CORBA.portable.IDLEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@Table(name = "company_scale")
public class CompanyScaleEntity extends IdEntity{
	@Column(name = "company_id", length = 32)
    private String companyId;
	@Column(name = "vehicle_num", length = 64)
    private String vehicleNum;
	@Column(name = "driver_num", length = 64)
    private String driverNum;
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


    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }


    public String getDriverNum() {
        return driverNum;
    }

    public void setDriverNum(String driverNum) {
        this.driverNum = driverNum;
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

        CompanyScaleEntity that = (CompanyScaleEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (vehicleNum != null ? !vehicleNum.equals(that.vehicleNum) : that.vehicleNum != null) return false;
        if (driverNum != null ? !driverNum.equals(that.driverNum) : that.driverNum != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (vehicleNum != null ? vehicleNum.hashCode() : 0);
        result = 31 * result + (driverNum != null ? driverNum.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
