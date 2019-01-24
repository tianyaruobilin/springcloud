package com.springcloudoauth2.serviceconsumeribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard  //开启熔断器仪表盘监控
@EnableHystrix  //开启熔断器
@EnableDiscoveryClient //表示这是一个服务消费者
@SpringBootApplication
public class ServiceconsumeRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceconsumeRibbonApplication.class, args);
    }

}

