package com.icloud.demo.consumer.interf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.icloud.demo.consumer.entity.User;
import com.icloud.demo.consumer.config.FullLogConfig;
import com.icloud.demo.consumer.controller.UserRestFeignServiceBack;




/**
 * 
 * 消费者接口定义
 * 
 * @author wsp
 *
 */

@FeignClient(value="demo" , configuration=FullLogConfig.class)
public interface UserRestFeignService extends UserRestService {
	
}
