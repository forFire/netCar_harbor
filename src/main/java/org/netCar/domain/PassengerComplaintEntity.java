package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 * 乘客投诉信息
 */
@Entity
@Table(name = "passenger_complaint")
public class PassengerComplaintEntity  extends IdEntity{


	@Column(name = "company_id", length = 32)
    private String companyId;
	@Column(name = "order_id", length = 64)
    private String orderId;
	@Column(name = "complaint_time")
    private Long complaintTime;
	@Column(name = "detail", length = 256)
    private String detail;
	@Column(name = "result", length = 128)
    private String result;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    public Long getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(Long complaintTime) {
        this.complaintTime = complaintTime;
    }


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassengerComplaintEntity that = (PassengerComplaintEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (complaintTime != null ? !complaintTime.equals(that.complaintTime) : that.complaintTime != null)
            return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = id != null ? id.hashCode() : 0;
        result1 = 31 * result1 + (companyId != null ? companyId.hashCode() : 0);
        result1 = 31 * result1 + (orderId != null ? orderId.hashCode() : 0);
        result1 = 31 * result1 + (complaintTime != null ? complaintTime.hashCode() : 0);
        result1 = 31 * result1 + (detail != null ? detail.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        return result1;
    }
}
