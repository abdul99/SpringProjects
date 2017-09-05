package com.abdul.springprojects.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceDemoApp {
    
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceDemoApp.class, args);
    }
}
