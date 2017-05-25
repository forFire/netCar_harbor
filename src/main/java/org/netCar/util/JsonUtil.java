package org.netCar.util;


import org.codehaus.jackson.map.ObjectMapper;
import java.util.Map;

/**
 * json序列化工具类
 *
 */
public class JsonUtil {

    public static <T> String toJson(T model){
        
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(model);
        } catch (Exception e) {
            return "";
        }
    }
    
    public static <T> T toModel(String json, Class<T> classOfT){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return (T)objectMapper.readValue(json, classOfT);
        } catch (Exception e) {
            return  null;
        }
        
    }
    
    public static Map<String, Object> toMap(String json){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, Map.class);
        } catch (Exception e) {
            return  null;
        }
        
    }
    

    private static ObjectMapper objectMapper = new ObjectMapper();
    
    public static <T> T json2Obj(String str, Class<T> clazz) {
		try {
			return objectMapper.readValue(str, clazz);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
    
    public static String obj2Str(Object obj) {
		try {
			return objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

    
    public static void main(String[] arg){
    	
    }
}
