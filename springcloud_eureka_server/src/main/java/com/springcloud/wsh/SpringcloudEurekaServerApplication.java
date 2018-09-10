package com.springcloud.wsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//@EnableEurekaServer注解的作用: 开启Eureka服务发现的功能
@EnableEurekaServer
public class SpringcloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
	}
}
