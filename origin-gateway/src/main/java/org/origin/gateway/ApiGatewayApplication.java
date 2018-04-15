package org.origin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import org.origin.gateway.filter.AccessFilter;

//开启zuul网关
@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApplication {
	
	
	
	
	
	
	
	
	
	
	
	

	
	/**
	 * 使用自定过滤器
	 * 
	 * @return
	 */
	@Bean
	public AccessFilter accessFilter(){
		
		
		
		return new AccessFilter();
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}
