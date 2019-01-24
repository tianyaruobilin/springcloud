package com.springcloudoauth2.serviceconsumeribbon.controller;

import com.springcloudoauth2.serviceconsumeribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping(value = "/hi/{message}")
    public String sayHi(@PathVariable(name = "message") String message) {
        return adminService.sayHi(message);
    }
}
