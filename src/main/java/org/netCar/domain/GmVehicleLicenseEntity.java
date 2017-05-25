package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@Table(name = "gm_vehicle_license")
public class GmVehicleLicenseEntity  extends IdEntity{

	@Column(name = "address")
    private Integer address;

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    @Column(name = "vehicle_no", length = 32)
    private String vehicleNo;


    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    @Column(name = "plate_color", length = 32)
    private String plateColor;


    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    @Column(name = "brand", length = 64)
    private String brand;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Column(name = "model", length = 64)
    private String model;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Column(name = "engine_id", length = 32)
    private String engineId;


    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    @Column(name = "vIN", length = 17)
    private String vIn;


    public String getvIn() {
        return vIn;
    }

    public void setvIn(String vIn) {
        this.vIn = vIn;
    }

    @Column(name = "vehicle_type", length = 64)
    private String vehicleType;


    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Column(name = "vehicle_type_code", length = 32)
    private String vehicleTypeCode;


    public String getVehicleTypeCode() {
        return vehicleTypeCode;
    }

    public void setVehicleTypeCode(String vehicleTypeCode) {
        this.vehicleTypeCode = vehicleTypeCode;
    }

    @Column(name = "delivery_date")
    private Integer deliveryDate;


    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Column(name = "certify_dateA")
    private Integer certifyDateA;


    public Integer getCertifyDateA() {
        return certifyDateA;
    }

    public void setCertifyDateA(Integer certifyDateA) {
        this.certifyDateA = certifyDateA;
    }

    @Column(name = "fuel_type", length = 32)
    private String fuelType;


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Column(name = "wheelbase")
    private Integer wheelbase;


    public Integer getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(Integer wheelbase) {
        this.wheelbase = wheelbase;
    }

    @Column(name = "commander")
    private Integer commander;


    public Integer getCommander() {
        return commander;
    }

    public void setCommander(Integer commander) {
        this.commander = commander;
    }

    @Column(name = "width")
    private Integer width;


    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Column(name = "height")
    private Integer height;


    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Column(name = "power")
    private Integer power;


    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Column(name = "seats")
    private Integer seats;


    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    @Column(name = "gPS_brand", length = 256)
    private String gPsBrand;


    public String getgPsBrand() {
        return gPsBrand;
    }

    public void setgPsBrand(String gPsBrand) {
        this.gPsBrand = gPsBrand;
    }

    @Column(name = "gPS_model", length = 64)
    private String gPsModel;


    public String getgPsModel() {
        return gPsModel;
    }

    public void setgPsModel(String gPsModel) {
        this.gPsModel = gPsModel;
    }

    @Column(name = "state")
    private Integer state;


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Column(name = "trans_area", length = 256)
    private String transArea;


    public String getTransArea() {
        return transArea;
    }

    public void setTransArea(String transArea) {
        this.transArea = transArea;
    }

    @Column(name = "certificate", length = 64)
    private String certificate;


    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    @Column(name = "trans_agency", length = 256)
    private String transAgency;


    public String getTransAgency() {
        return transAgency;
    }

    public void setTransAgency(String transAgency) {
        this.transAgency = transAgency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GmVehicleLicenseEntity that = (GmVehicleLicenseEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(that.vehicleNo) : that.vehicleNo != null) return false;
        if (plateColor != null ? !plateColor.equals(that.plateColor) : that.plateColor != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (engineId != null ? !engineId.equals(that.engineId) : that.engineId != null) return false;
        if (vIn != null ? !vIn.equals(that.vIn) : that.vIn != null) return false;
        if (vehicleType != null ? !vehicleType.equals(that.vehicleType) : that.vehicleType != null) return false;
        if (vehicleTypeCode != null ? !vehicleTypeCode.equals(that.vehicleTypeCode) : that.vehicleTypeCode != null)
            return false;
        if (deliveryDate != null ? !deliveryDate.equals(that.deliveryDate) : that.deliveryDate != null) return false;
        if (certifyDateA != null ? !certifyDateA.equals(that.certifyDateA) : that.certifyDateA != null) return false;
        if (fuelType != null ? !fuelType.equals(that.fuelType) : that.fuelType != null) return false;
        if (wheelbase != null ? !wheelbase.equals(that.wheelbase) : that.wheelbase != null) return false;
        if (commander != null ? !commander.equals(that.commander) : that.commander != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (power != null ? !power.equals(that.power) : that.power != null) return false;
        if (seats != null ? !seats.equals(that.seats) : that.seats != null) return false;
        if (gPsBrand != null ? !gPsBrand.equals(that.gPsBrand) : that.gPsBrand != null) return false;
        if (gPsModel != null ? !gPsModel.equals(that.gPsModel) : that.gPsModel != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (transArea != null ? !transArea.equals(that.transArea) : that.transArea != null) return false;
        if (certificate != null ? !certificate.equals(that.certificate) : that.certificate != null) return false;
        if (transAgency != null ? !transAgency.equals(that.transAgency) : that.transAgency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (plateColor != null ? plateColor.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (engineId != null ? engineId.hashCode() : 0);
        result = 31 * result + (vIn != null ? vIn.hashCode() : 0);
        result = 31 * result + (vehicleType != null ? vehicleType.hashCode() : 0);
        result = 31 * result + (vehicleTypeCode != null ? vehicleTypeCode.hashCode() : 0);
        result = 31 * result + (deliveryDate != null ? deliveryDate.hashCode() : 0);
        result = 31 * result + (certifyDateA != null ? certifyDateA.hashCode() : 0);
        result = 31 * result + (fuelType != null ? fuelType.hashCode() : 0);
        result = 31 * result + (wheelbase != null ? wheelbase.hashCode() : 0);
        result = 31 * result + (commander != null ? commander.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (seats != null ? seats.hashCode() : 0);
        result = 31 * result + (gPsBrand != null ? gPsBrand.hashCode() : 0);
        result = 31 * result + (gPsModel != null ? gPsModel.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (transArea != null ? transArea.hashCode() : 0);
        result = 31 * result + (certificate != null ? certificate.hashCode() : 0);
        result = 31 * result + (transAgency != null ? transAgency.hashCode() : 0);
        return result;
    }
}
