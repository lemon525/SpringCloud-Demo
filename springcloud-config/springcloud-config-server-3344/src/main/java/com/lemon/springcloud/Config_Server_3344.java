package com.lemon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //开启config
public class Config_Server_3344 {

    public static void main(String[] args) {
        SpringApplication.run(Config_Server_3344.class,args);
    }
}
