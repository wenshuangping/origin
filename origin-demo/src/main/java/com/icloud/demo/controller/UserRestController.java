package com.icloud.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icloud.demo.api.UserRestService;
import com.icloud.demo.entity.User;

/**
 * 设置restful服务
 * @author wsp
 *
 */
@RestController
public class UserRestController implements UserRestService {

	@Override
	public String testservicePathVariable( @PathVariable("pathVariable2") String pathVariable2) {
		
		//模拟容错服务
		/*try {
			Thread.currentThread().sleep(1000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		
		return "testservicePathVariable value:"+pathVariable2;
	}
	
	@Override
	public String testserviceRequestHeader( @RequestHeader("requestHeader")String requestHeader) {
		return "testserviceRequestHeader value:"+requestHeader;
	}
	
	@Override
	public String testserviceRequestParam(@RequestParam("requestParam2") String requestParam2){
		return requestParam2;
	}
	
	@Override
	public User testserviceRequestBody(@RequestBody User user) {
		return user;
	}
	
	
}
