package com.springcloudoauth2.serviceconsumefeign.fallback;

import com.springcloudoauth2.serviceconsumefeign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceFallBack implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
