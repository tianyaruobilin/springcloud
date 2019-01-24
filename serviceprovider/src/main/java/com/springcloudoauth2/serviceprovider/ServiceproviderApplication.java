package com.springcloudoauth2.serviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //表示自己是一个服务提供者
@SpringBootApplication
public class ServiceproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceproviderApplication.class, args);
    }

}

