package com.lemon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Ribbon 和 Eureka 整合以后,客户端可以直接调用，不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient
public class Application_80 {

    public static void main(String[] args) {
        SpringApplication.run(Application_80.class,args);
    }
}
