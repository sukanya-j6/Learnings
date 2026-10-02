package com.example.config_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/build-info")
public class BuildInfoController {
    @Value("${build.id:default}")
    private String buildId;

    @Value("${build.version:default}")
    private String buildVersion;

    @Value("${build.name:default}")
    private String buildName;

    @GetMapping("/")
    public String getBuildInfo() {
        return "Build ID: " + buildId
                + "Build Version: "+ buildVersion
                + "Build Name: "+ buildName;
    }
}
