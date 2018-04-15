package com.icloud.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.icloud.demo.consumer.entity.User;
import com.icloud.demo.consumer.interf.UserRestFeignService;


@RestController
@RequestMapping(value = "/consumerFeign")
public class ConsumerFeignController {

	@Autowired
	private UserRestFeignService  userRestFeignService;	
	
	@RequestMapping(value = "/helloFeignParamConsumer", method = RequestMethod.GET)
	public void helloFeignParamConsumer(){
		
		System.out.println("testservicePathVariable:"+
			userRestFeignService.testservicePathVariable("pathVariable"));
		
		/*System.out.println("testservicePathVariable:"+
				userRestFeignService.testserviceRequestHeader("requestHeader"));
		
		User user= new User();
		user.setId(1234L);
		user.setName("my name test");
		user.setAge(1);
		User userReturn= userRestFeignService.testserviceRequestBody(user);
		System.out.println("==========Start==========================");
		System.out.println("Id:"+userReturn.getId());
		System.out.println("Name:"+userReturn.getName());
		System.out.println("Age:"+userReturn.getAge());
		
		System.out.println("testservicePathParam:"+
		userRestFeignService.testserviceRequestParam("111"));*/
	}
	
	
	
	
	
}
