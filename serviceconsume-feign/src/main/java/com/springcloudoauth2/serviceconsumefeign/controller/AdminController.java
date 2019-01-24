package com.springcloudoauth2.serviceconsumefeign.controller;

import com.springcloudoauth2.serviceconsumefeign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "/hi/{message}")
    public String hi(@PathVariable(name = "message") String message){
        return adminService.sayHi(message);
    }
}
