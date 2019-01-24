package com.springcloudoauth2.serviceconsumefeign.service;

import com.springcloudoauth2.serviceconsumefeign.fallback.AdminServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "serviceprovider-hello",fallback = AdminServiceFallBack.class)
public interface AdminService {

    @GetMapping(value = "/hi/{message}")
    public String sayHi(@PathVariable(name = "message")String message);

}
