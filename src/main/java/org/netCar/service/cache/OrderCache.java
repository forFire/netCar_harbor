package org.netCar.service.cache;

import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 订单实时信息
 */
@Component
public class OrderCache {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String ORDER = "order";

    /**
     * code  行政区域编码
     * num   日订单数
     */
    public void setOrderNum(String code , Integer num ) {
        redisTemplate.opsForHash().increment(getOrderPre(),code,num);
    }


    /**
     * code  行政区域编码
     */
    public  int  getOrderNum(String code){
        return (Integer) redisTemplate.opsForHash().get(getOrderPre(),code);
    }

    /**
     * 获取订单前缀
     * @return
     */
    private static String getOrderPre(){
        return String.format("%s_%s",ORDER,  DateFormatUtils.format(new Date(), "yyyyMMdd") );
    }


}
