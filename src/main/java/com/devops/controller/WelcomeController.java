package com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        System.out.println("Testing triggering polls");
        System.out.println("Testing triggering polls");
        
        return "Welcome to DevOps Automation Application!";
    }
}
