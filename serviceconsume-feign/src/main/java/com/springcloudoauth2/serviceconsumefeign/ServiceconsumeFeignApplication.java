package com.springcloudoauth2.serviceconsumefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrixDashboard
@EnableFeignClients //开启负载均衡
@EnableDiscoveryClient  //表示这是一个消费者
@SpringBootApplication
public class ServiceconsumeFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceconsumeFeignApplication.class, args);
    }

}

