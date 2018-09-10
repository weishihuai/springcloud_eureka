package com.springcloud.wsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * @Description:  高可用Eureka-服务提供者
 * @Author: WeiShiHuai  
 * @Date: 2018/9/7 14:01
*/
@SpringBootApplication
//注册成为Eureka客户端
@EnableDiscoveryClient
public class SpringcloudHignAvailabilityEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudHignAvailabilityEurekaClientApplication.class, args);
	}
}
