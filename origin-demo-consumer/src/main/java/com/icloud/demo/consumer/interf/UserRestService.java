package com.icloud.demo.consumer.interf;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icloud.demo.consumer.entity.User;

@RequestMapping(value = "/users")
public interface UserRestService {
	
	/**
	 * 提供参数路径服务
	 * @param pathVariable
	 * @return
	 */
	@RequestMapping(value = "/testservicePathVariable/{pathVariable2}", method = RequestMethod.GET)
	public String testservicePathVariable(@PathVariable("pathVariable2") String pathVariable2) ;
	
	@RequestMapping(value = "/testserviceRequestHeader", method = RequestMethod.GET)
	public String testserviceRequestHeader(@RequestHeader("requestHeader") String requestHeader);
	
	@RequestMapping(value = "/testserviceRequestBody", method = RequestMethod.POST)
	public  User testserviceRequestBody(@RequestBody User user); 
	
	
	@RequestMapping(value = "/RequestParam" ,method = RequestMethod.GET)
	public String testserviceRequestParam(@RequestParam("requestParam2") String requestParam2);

}
