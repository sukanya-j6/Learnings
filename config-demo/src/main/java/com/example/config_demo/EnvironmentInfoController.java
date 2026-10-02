package com.example.config_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/env-info")
public class EnvironmentInfoController {

    /**
     * reads environment variables from system -> Environment Variables
     */
    @Value("${OS:default}")
    private String OS;

    @Value("${USERNAME:default}")
    private String userName;

    @GetMapping("/")
    public String getEnvironmentInfo() {
        return "OS: " + OS
                + " USERNAME: " + userName;
    }

}
