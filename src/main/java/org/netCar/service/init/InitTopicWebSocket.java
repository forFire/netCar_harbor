package org.netCar.service.init;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.netCar.util.NewWebSocketThread;
import org.netCar.vo.TopicsNameEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("initTopicWebSocket")
public class InitTopicWebSocket {
	private static Logger LOG = LoggerFactory.getLogger(InitTopicWebSocket.class);
	
	@Value("${r.uri}")
	private String serverBaseUri;
	
	@Value("${r.user}")
	private String userId;
	
	@Value("${r.password}")
	private String password;

	@Value("${r.offset.reset}")
	private String offsetReset;

	@Value("${r.timeout}")
	private long timeout;

	@Value("${r.batch}")
	private boolean batch;

	@Value("${r.compress}")
	private boolean compress;

	@Value("${r.log.message}")
	private boolean logMessage;

	public void initWebSocket() {
		try {
			
			RestTemplate restTemplate = new RestTemplate();

			String uri = new StringBuilder("http://").append(serverBaseUri).append("/auth/").append(userId).toString();
			LOG.info("request uri ==> " + uri);
			ResponseEntity<String> res = restTemplate.postForEntity(uri, password, String.class);
			if (res.getStatusCode().equals(HttpStatus.OK)) {
				LOG.info("token ==> " + res.getBody());
				
		        LinkedBlockingDeque<Runnable> linkedWorkQueue = new LinkedBlockingDeque<Runnable>();  
		        ExecutorService threadPool = new ThreadPoolExecutor(5,
		                10, //线程池中最大线程数  
		                60, //线程池中线程的最大空闲时间，超过这个时间空闲线程将被回收  
		                TimeUnit.SECONDS,//时间单位  
		                linkedWorkQueue, //下面是采用有界队列和无界队列的区别  
		                new ThreadPoolExecutor.AbortPolicy());  
				//为每一个topics 初始化websocket 
				for (TopicsNameEnum topicsEnum : TopicsNameEnum.values()) {
		            if(topicsEnum.isEnable()){
		            	NewWebSocketThread task = new NewWebSocketThread(res.getBody(),topicsEnum,
		            			serverBaseUri, offsetReset, timeout, batch, compress, logMessage);  
		                threadPool.execute(task); 
		            }
		        }
			}

		} catch (Exception e) {
			LOG.error("", e);
		}
	}

}

