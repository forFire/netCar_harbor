package org.netCar.domain;

import javax.persistence.Entity;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@javax.persistence.Table(name = "company_fare")
public class CompanyFareEntity extends IdEntity{

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

    @javax.persistence.Column(name = "fare_type", length = 16)
    private String fareType;


    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }

    @javax.persistence.Column(name = "fare_type_note", length = 128)
    private String fareTypeNote;


    public String getFareTypeNote() {
        return fareTypeNote;
    }

    public void setFareTypeNote(String fareTypeNote) {
        this.fareTypeNote = fareTypeNote;
    }

    @javax.persistence.Column(name = "fare_valid_on")
    private Long fareValidOn;


    public Long getFareValidOn() {
        return fareValidOn;
    }

    public void setFareValidOn(Long fareValidOn) {
        this.fareValidOn = fareValidOn;
    }

    @javax.persistence.Column(name = "fare_valid_off")
    private Long fareValidOff;


    public Long getFareValidOff() {
        return fareValidOff;
    }

    public void setFareValidOff(Long fareValidOff) {
        this.fareValidOff = fareValidOff;
    }

    @javax.persistence.Column(name = "start_fare")
    private Integer startFare;


    public Integer getStartFare() {
        return startFare;
    }

    public void setStartFare(Integer startFare) {
        this.startFare = startFare;
    }

    @javax.persistence.Column(name = "start_mile")
    private Integer startMile;


    public Integer getStartMile() {
        return startMile;
    }

    public void setStartMile(Integer startMile) {
        this.startMile = startMile;
    }

    @javax.persistence.Column(name = "unit_price_per_mile")
    private Integer unitPricePerMile;


    public Integer getUnitPricePerMile() {
        return unitPricePerMile;
    }

    public void setUnitPricePerMile(Integer unitPricePerMile) {
        this.unitPricePerMile = unitPricePerMile;
    }

    @javax.persistence.Column(name = "unit_price_per_minute")
    private Integer unitPricePerMinute;


    public Integer getUnitPricePerMinute() {
        return unitPricePerMinute;
    }

    public void setUnitPricePerMinute(Integer unitPricePerMinute) {
        this.unitPricePerMinute = unitPricePerMinute;
    }

    @javax.persistence.Column(name = "up_price")
    private Float upPrice;


    public Float getUpPrice() {
        return upPrice;
    }

    public void setUpPrice(Float upPrice) {
        this.upPrice = upPrice;
    }

    @javax.persistence.Column(name = "up_price_start_mile")
    private Float upPriceStartMile;


    public Float getUpPriceStartMile() {
        return upPriceStartMile;
    }

    public void setUpPriceStartMile(Float upPriceStartMile) {
        this.upPriceStartMile = upPriceStartMile;
    }

    @javax.persistence.Column(name = "morning_peak_time_on", length = 8)
    private String morningPeakTimeOn;


    public String getMorningPeakTimeOn() {
        return morningPeakTimeOn;
    }

    public void setMorningPeakTimeOn(String morningPeakTimeOn) {
        this.morningPeakTimeOn = morningPeakTimeOn;
    }

    @javax.persistence.Column(name = "morning_peak_time_off", length = 8)
    private String morningPeakTimeOff;


    public String getMorningPeakTimeOff() {
        return morningPeakTimeOff;
    }

    public void setMorningPeakTimeOff(String morningPeakTimeOff) {
        this.morningPeakTimeOff = morningPeakTimeOff;
    }

    @javax.persistence.Column(name = "evening_peak_time_on", length = 8)
    private String eveningPeakTimeOn;


    public String getEveningPeakTimeOn() {
        return eveningPeakTimeOn;
    }

    public void setEveningPeakTimeOn(String eveningPeakTimeOn) {
        this.eveningPeakTimeOn = eveningPeakTimeOn;
    }

    @javax.persistence.Column(name = "evening_peak_time_off", length = 8)
    private String eveningPeakTimeOff;


    public String getEveningPeakTimeOff() {
        return eveningPeakTimeOff;
    }

    public void setEveningPeakTimeOff(String eveningPeakTimeOff) {
        this.eveningPeakTimeOff = eveningPeakTimeOff;
    }

    @javax.persistence.Column(name = "other_peak_time_on", length = 8)
    private String otherPeakTimeOn;


    public String getOtherPeakTimeOn() {
        return otherPeakTimeOn;
    }

    public void setOtherPeakTimeOn(String otherPeakTimeOn) {
        this.otherPeakTimeOn = otherPeakTimeOn;
    }

    @javax.persistence.Column(name = "other_peak_time_off", length = 8)
    private String otherPeakTimeOff;


    public String getOtherPeakTimeOff() {
        return otherPeakTimeOff;
    }

    public void setOtherPeakTimeOff(String otherPeakTimeOff) {
        this.otherPeakTimeOff = otherPeakTimeOff;
    }

    @javax.persistence.Column(name = "peak_unit_price")
    private Float peakUnitPrice;


    public Float getPeakUnitPrice() {
        return peakUnitPrice;
    }

    public void setPeakUnitPrice(Float peakUnitPrice) {
        this.peakUnitPrice = peakUnitPrice;
    }

    @javax.persistence.Column(name = "peak_price_start_mile")
    private Float peakPriceStartMile;


    public Float getPeakPriceStartMile() {
        return peakPriceStartMile;
    }

    public void setPeakPriceStartMile(Float peakPriceStartMile) {
        this.peakPriceStartMile = peakPriceStartMile;
    }

    @javax.persistence.Column(name = "low_speed_price_per_minute")
    private Float lowSpeedPricePerMinute;


    public float getLowSpeedPricePerMinute() {
        return lowSpeedPricePerMinute;
    }

    public void setLowSpeedPricePerMinute(float lowSpeedPricePerMinute) {
        this.lowSpeedPricePerMinute = lowSpeedPricePerMinute;
    }

    @javax.persistence.Column(name = "night_price_per_mile")
    private Float nightPricePerMile;


    public Float getNightPricePerMile() {
        return nightPricePerMile;
    }

    public void setNightPricePerMile(Float nightPricePerMile) {
        this.nightPricePerMile = nightPricePerMile;
    }

    @javax.persistence.Column(name = "night_price_per_minute")
    private Float nightPricePerMinute;


    public Float getNightPricePerMinute() {
        return nightPricePerMinute;
    }

    public void setNightPricePerMinute(Float nightPricePerMinute) {
        this.nightPricePerMinute = nightPricePerMinute;
    }

    @javax.persistence.Column(name = "other_price", length = 10)
    private String otherPrice;


    public String getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(String otherPrice) {
        this.otherPrice = otherPrice;
    }

    @javax.persistence.Column(name = "state")
    private Integer state;


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @javax.persistence.Column(name = "update_time")
    private Long updateTime;


    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @javax.persistence.Column(name = "flag")
    private Integer flag;


    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyFareEntity that = (CompanyFareEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (fareType != null ? !fareType.equals(that.fareType) : that.fareType != null) return false;
        if (fareTypeNote != null ? !fareTypeNote.equals(that.fareTypeNote) : that.fareTypeNote != null) return false;
        if (fareValidOn != null ? !fareValidOn.equals(that.fareValidOn) : that.fareValidOn != null) return false;
        if (fareValidOff != null ? !fareValidOff.equals(that.fareValidOff) : that.fareValidOff != null) return false;
        if (startFare != null ? !startFare.equals(that.startFare) : that.startFare != null) return false;
        if (startMile != null ? !startMile.equals(that.startMile) : that.startMile != null) return false;
        if (unitPricePerMile != null ? !unitPricePerMile.equals(that.unitPricePerMile) : that.unitPricePerMile != null)
            return false;
        if (unitPricePerMinute != null ? !unitPricePerMinute.equals(that.unitPricePerMinute) : that.unitPricePerMinute != null)
            return false;
        if (upPrice != null ? !upPrice.equals(that.upPrice) : that.upPrice != null) return false;
        if (upPriceStartMile != null ? !upPriceStartMile.equals(that.upPriceStartMile) : that.upPriceStartMile != null)
            return false;
        if (morningPeakTimeOn != null ? !morningPeakTimeOn.equals(that.morningPeakTimeOn) : that.morningPeakTimeOn != null)
            return false;
        if (morningPeakTimeOff != null ? !morningPeakTimeOff.equals(that.morningPeakTimeOff) : that.morningPeakTimeOff != null)
            return false;
        if (eveningPeakTimeOn != null ? !eveningPeakTimeOn.equals(that.eveningPeakTimeOn) : that.eveningPeakTimeOn != null)
            return false;
        if (eveningPeakTimeOff != null ? !eveningPeakTimeOff.equals(that.eveningPeakTimeOff) : that.eveningPeakTimeOff != null)
            return false;
        if (otherPeakTimeOn != null ? !otherPeakTimeOn.equals(that.otherPeakTimeOn) : that.otherPeakTimeOn != null)
            return false;
        if (otherPeakTimeOff != null ? !otherPeakTimeOff.equals(that.otherPeakTimeOff) : that.otherPeakTimeOff != null)
            return false;
        if (peakUnitPrice != null ? !peakUnitPrice.equals(that.peakUnitPrice) : that.peakUnitPrice != null)
            return false;
        if (peakPriceStartMile != null ? !peakPriceStartMile.equals(that.peakPriceStartMile) : that.peakPriceStartMile != null)
            return false;
        if (lowSpeedPricePerMinute != null ? !lowSpeedPricePerMinute.equals(that.lowSpeedPricePerMinute) : that.lowSpeedPricePerMinute != null)
            return false;
        if (nightPricePerMile != null ? !nightPricePerMile.equals(that.nightPricePerMile) : that.nightPricePerMile != null)
            return false;
        if (nightPricePerMinute != null ? !nightPricePerMinute.equals(that.nightPricePerMinute) : that.nightPricePerMinute != null)
            return false;
        if (otherPrice != null ? !otherPrice.equals(that.otherPrice) : that.otherPrice != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (flag != null ? !flag.equals(that.flag) : that.flag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (fareType != null ? fareType.hashCode() : 0);
        result = 31 * result + (fareTypeNote != null ? fareTypeNote.hashCode() : 0);
        result = 31 * result + (fareValidOn != null ? fareValidOn.hashCode() : 0);
        result = 31 * result + (fareValidOff != null ? fareValidOff.hashCode() : 0);
        result = 31 * result + (startFare != null ? startFare.hashCode() : 0);
        result = 31 * result + (startMile != null ? startMile.hashCode() : 0);
        result = 31 * result + (unitPricePerMile != null ? unitPricePerMile.hashCode() : 0);
        result = 31 * result + (unitPricePerMinute != null ? unitPricePerMinute.hashCode() : 0);
        result = 31 * result + (upPrice != null ? upPrice.hashCode() : 0);
        result = 31 * result + (upPriceStartMile != null ? upPriceStartMile.hashCode() : 0);
        result = 31 * result + (morningPeakTimeOn != null ? morningPeakTimeOn.hashCode() : 0);
        result = 31 * result + (morningPeakTimeOff != null ? morningPeakTimeOff.hashCode() : 0);
        result = 31 * result + (eveningPeakTimeOn != null ? eveningPeakTimeOn.hashCode() : 0);
        result = 31 * result + (eveningPeakTimeOff != null ? eveningPeakTimeOff.hashCode() : 0);
        result = 31 * result + (otherPeakTimeOn != null ? otherPeakTimeOn.hashCode() : 0);
        result = 31 * result + (otherPeakTimeOff != null ? otherPeakTimeOff.hashCode() : 0);
        result = 31 * result + (peakUnitPrice != null ? peakUnitPrice.hashCode() : 0);
        result = 31 * result + (peakPriceStartMile != null ? peakPriceStartMile.hashCode() : 0);
        result = 31 * result + (lowSpeedPricePerMinute != null ? lowSpeedPricePerMinute.hashCode() : 0);
        result = 31 * result + (nightPricePerMile != null ? nightPricePerMile.hashCode() : 0);
        result = 31 * result + (nightPricePerMinute != null ? nightPricePerMinute.hashCode() : 0);
        result = 31 * result + (otherPrice != null ? otherPrice.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        return result;
    }
}
