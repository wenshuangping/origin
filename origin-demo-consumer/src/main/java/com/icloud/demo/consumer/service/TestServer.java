package com.icloud.demo.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class TestServer {

	@Autowired
	RestTemplate restTemplate;

	
	@HystrixCommand(fallbackMethod="testserviceError")  
	public String testservice() {
		// http://demo/users/testservice
		// demo 对应 spring.application.name
		// users/testservice 对应controller提供的rest服务
		return restTemplate.getForEntity("http://demo/users/testservice", String.class).getBody();
	}
	
	
	/**
	 * 服务降级方法与业务方法返回值类型要一致，否则会报不相容错误
	 * @return
	 * @throws InterruptedException
	 */
	@HystrixCommand(fallbackMethod="testserviceError" )  
	public String testservice2() throws InterruptedException {
		Thread.currentThread().sleep(3000);
		
		return "testservice2";
	}

	
	
	
	/**
	 *发现错误，调用此方法 
	 * @param e  业务方法执行过程抛出得异常
	 * @return
	 */
	private String testserviceError(Throwable e){
		
		e.printStackTrace();
		
		return "error::testservice";
	}
	
	
	
	

}
