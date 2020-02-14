package com.lemon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//@EnableEurekaServer eureka 服务端的启动类
@EnableEurekaServer
public class Application_7002 {

    public static void main(String[] args) {
        SpringApplication.run(Application_7002.class,args);
    }
}
