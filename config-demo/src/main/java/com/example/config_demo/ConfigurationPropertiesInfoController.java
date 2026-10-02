package com.example.config_demo;

import com.example.config_demo.configurations.BuildInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config-props")
@AllArgsConstructor
public class ConfigurationPropertiesInfoController {

    private BuildInfo buildInfo;

    @GetMapping("/")
    public String getConfig() {
        return "Build Id: " + buildInfo.getId()
                + " Build Version: " + buildInfo.getVersion()
                + " Build Name: " + buildInfo.getName();
    }
}
