package com.linjing.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//该注解能激活Eureka中的DiscoveryClient实现，这样才能实现Controller中对服务信息的输出
@EnableDiscoveryClient
//@EnableEurekaClient
@ServletComponentScan(basePackages = {"com.linjing.controller"})
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}

