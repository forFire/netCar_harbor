package org.netCar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by menxin on 2017/4/19.
 */
@Entity
@Table(name = "dict_info")
public class DictInfoEntity extends IdEntity{
	@Column(name = "code", length = 32)
    private String code;
	@Column(name = "name", length = 64)
    private String name;
    @Column(name = "type", length = 64)
    private String type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
