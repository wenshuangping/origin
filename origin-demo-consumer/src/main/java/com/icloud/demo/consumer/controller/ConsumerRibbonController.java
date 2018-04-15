package com.icloud.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.icloud.demo.consumer.service.TestServer;

@RestController
@RequestMapping(value = "/consumer")
public class ConsumerRibbonController {
	
	@Autowired
	private TestServer testServer;
	
	@RequestMapping(value = "/helloConsumer", method = RequestMethod.GET)
	public String helloConsumer(){
		return testServer.testservice();
	}

	@RequestMapping(value = "/hystrixTimeoutConsumer", method = RequestMethod.GET)
	public String hystrixTimeoutConsumer() throws InterruptedException{
		return testServer.testservice2();
	}
	
}
