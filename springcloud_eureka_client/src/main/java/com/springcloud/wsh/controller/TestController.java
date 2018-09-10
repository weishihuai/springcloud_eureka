package com.springcloud.wsh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: TestController
 * @ProjectName springcloud_eureka
 * @Description: 测试
 * @Author WeiShiHuai
 * @Date 2018/9/7 9:53
 */
//@RestController注解是一个组合注解， @RestController = @Controller  + @ResponseBody
@RestController
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    //获取配置文件中的自定义参数
    @Value("${com.springcloud.author}")
    private String author;
    @Value("${com.springcloud.date}")
    private String date;

    @GetMapping("/test")
    public String test() {
        //获取当前服务的实例
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        String info = "hello eureka, 主机名:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId() + "　作者: " + author + " / 日期： " + date;
        logger.info(info);
        return info;
    }

}
