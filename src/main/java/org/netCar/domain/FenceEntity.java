package org.netCar.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ffd on 2017/4/19.
 */
@Entity
@Table(name = "fence")
public class FenceEntity  extends IdEntity{
	@Column(name = "name", length = 64)
    private String name;
	@Column(name = "shape")
    private Integer shape;
	@Column(name = "radius", precision = 0)
    private Double radius;
	@Column(name = "type")
    private Integer type;
	@Column(name = "spots", length = 32)
    private String spots;
	@Column(name = "remark", length = 128)
    private String remark;
	@Column(name = "status")
    private Integer status;
	@Column(name = "number")
    private String number;
	@Column(name = "purpose")
    private String purpose;
	@Column(name = "createTime")
    private Date createTime;
	@Column(name = "endTime")
    private Date endTime;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getShape() {
        return shape;
    }

    public void setShape(Integer shape) {
        this.shape = shape;
    }


    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    public String getSpots() {
        return spots;
    }

    public void setSpots(String spots) {
        this.spots = spots;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

   
}
