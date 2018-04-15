package com.icloud.demo.consumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;


import com.icloud.demo.consumer.entity.User;
import com.icloud.demo.consumer.interf.UserRestFeignService;


@Component
public class UserRestFeignServiceBack   {


	public String testservicePathVariable(@PathVariable("pathVariable2") String pathVariable2) {
		return "error:testservicePathVariable";
	}


	public String testserviceRequestHeader(@RequestHeader("requestHeader") String requestHeader) {
		return "error:testserviceRequestHeader";
	}


	public User testserviceRequestBody(@RequestBody User user) {
		return null;
	}


	public String testserviceRequestParam(@RequestParam("requestParam2")  String requestParam2) {
		return "error:testserviceRequestParam";
	}

}
