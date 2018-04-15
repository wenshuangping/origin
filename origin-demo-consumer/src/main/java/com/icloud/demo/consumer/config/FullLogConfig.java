package com.icloud.demo.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

@Configuration
public class FullLogConfig {
	@Bean
	Logger.Level feignLogLevel(){
		return Logger.Level.FULL;
	}
}
