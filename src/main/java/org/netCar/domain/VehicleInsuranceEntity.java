package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by lyq on 2017/4/19.
 * 网约车车辆保险信息
 */
@Entity
@Table(name = "vehicle_insurance")
public class VehicleInsuranceEntity  extends IdEntity{

	@Column(name = "company_id", length = 32)
    private String companyId;
	@Column(name = "vehicle_no", length = 32)
    private String vehicleNo;
	@Column(name = "insur_com", length = 64)
    private String insurCom;
	@Column(name = "insur_num", length = 64)
    private String insurNum;
	@Column(name = "insur_type", length = 32)
    private String insurType;
    @Column(name = "insur_count")
    private Float insurCount;
    @Column(name = "insur_eff")
    private Long insurEff;
    @Column(name = "insur_exp")
    private Long insurExp;
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


    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }


    public String getInsurCom() {
        return insurCom;
    }

    public void setInsurCom(String insurCom) {
        this.insurCom = insurCom;
    }


    public String getInsurNum() {
        return insurNum;
    }

    public void setInsurNum(String insurNum) {
        this.insurNum = insurNum;
    }


    public String getInsurType() {
        return insurType;
    }

    public void setInsurType(String insurType) {
        this.insurType = insurType;
    }


    public Float getInsurCount() {
        return insurCount;
    }

    public void setInsurCount(Float insurCount) {
        this.insurCount = insurCount;
    }


    public Long getInsurEff() {
        return insurEff;
    }

    public void setInsurEff(Long insurEff) {
        this.insurEff = insurEff;
    }


    public Long getInsurExp() {
        return insurExp;
    }

    public void setInsurExp(Long insurExp) {
        this.insurExp = insurExp;
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

        VehicleInsuranceEntity that = (VehicleInsuranceEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (insurCom != null ? !insurCom.equals(that.insurCom) : that.insurCom != null) return false;
        if (insurNum != null ? !insurNum.equals(that.insurNum) : that.insurNum != null) return false;
        if (insurType != null ? !insurType.equals(that.insurType) : that.insurType != null) return false;
        if (insurCount != null ? !insurCount.equals(that.insurCount) : that.insurCount != null) return false;
        if (insurEff != null ? !insurEff.equals(that.insurEff) : that.insurEff != null) return false;
        if (insurExp != null ? !insurExp.equals(that.insurExp) : that.insurExp != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (insurCom != null ? insurCom.hashCode() : 0);
        result = 31 * result + (insurNum != null ? insurNum.hashCode() : 0);
        result = 31 * result + (insurType != null ? insurType.hashCode() : 0);
        result = 31 * result + (insurCount != null ? insurCount.hashCode() : 0);
        result = 31 * result + (insurEff != null ? insurEff.hashCode() : 0);
        result = 31 * result + (insurExp != null ? insurExp.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
