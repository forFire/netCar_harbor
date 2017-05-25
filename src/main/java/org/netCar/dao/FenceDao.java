package org.netCar.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.netCar.domain.FenceEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by gujgkjg on 2017/4/19.
 */
@Repository
public class FenceDao extends BaseHBDao<FenceEntity, Integer> {

	public List<FenceEntity> listAllByCounty(String remark, Integer status) {
	   StringBuffer sql = new StringBuffer(" SELECT * FROM fence where 1=1 ");
	   Map<String,Object> params = new HashMap<String,Object>();
        if(StringUtils.isBlank(remark)){
        	sql.append(" and remark = :remark ");
        	params.put("remark", remark);
        }
        if(status != 0){
        	sql.append(" and status = :status ");
        	params.put("status", status);
        }
	        
		return listAll(sql.toString(), FenceEntity.class, params) ;
	}
}
