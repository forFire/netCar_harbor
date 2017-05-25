package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 * 乘客基本信息
 */
@Entity
@Table(name = "passenger_info")
public class PassengerInfoEntity  extends IdEntity{


	@Column(name = "company_id", length = 32)
    private String companyId;
	@Column(name = "register_date")
    private Long registerDate;
	@Column(name = "passenger_phone", length = 32)
    private String passengerPhone;
	@Column(name = "passenger_name", length = 64)
    private String passengerName;
	@Column(name = "passenger_gender", length = 2)
    private String passengerGender;
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


    public Long getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Long registerDate) {
        this.registerDate = registerDate;
    }


    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }


    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }


    public String getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(String passengerGender) {
        this.passengerGender = passengerGender;
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

        PassengerInfoEntity that = (PassengerInfoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;
        if (passengerPhone != null ? !passengerPhone.equals(that.passengerPhone) : that.passengerPhone != null)
            return false;
        if (passengerName != null ? !passengerName.equals(that.passengerName) : that.passengerName != null)
            return false;
        if (passengerGender != null ? !passengerGender.equals(that.passengerGender) : that.passengerGender != null)
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
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (passengerPhone != null ? passengerPhone.hashCode() : 0);
        result = 31 * result + (passengerName != null ? passengerName.hashCode() : 0);
        result = 31 * result + (passengerGender != null ? passengerGender.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
