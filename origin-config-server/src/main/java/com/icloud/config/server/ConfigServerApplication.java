package com.icloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
//XXX import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;








//注册及发现服务
@EnableDiscoveryClient
//XXX @EnableWebSecurity
//开启配置服务
@EnableConfigServer
//启动spring boot
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
