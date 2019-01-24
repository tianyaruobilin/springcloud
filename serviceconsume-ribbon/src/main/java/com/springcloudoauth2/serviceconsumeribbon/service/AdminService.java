package com.springcloudoauth2.serviceconsumeribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 用于调用远程服务
 */
@Service
public class AdminService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")  //经过测试，fallback方法和这个调用服务必须在同一个类下
    public String sayHi(String message)
    {
        return restTemplate.getForObject("http://serviceprovider-hello/hi/" + message, String.class);
    }

    public String hiError(String message){
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

}
