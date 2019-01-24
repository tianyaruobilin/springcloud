package com.springcloudoauth2.serviceprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "hi/{message}")
    public String sayHi(@PathVariable(name = "message") String message) {

        return String.format("Hi,you message is: %s ,i am from port: %s", message, port);
    }
}
