package com.example.config_demo.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * create a package configuration
 * create a class BuildInfo
 *
 * annotate the class as @Configuration - so we can confirm it is going to give the beans
 * annotate the class as @ConfigurationProperties(prefix="build")
 * so it maps to application.yml file with prefix as build
 *
 * annotate the class with @Data so it has all getters and setters
 */

@Configuration
@ConfigurationProperties(prefix="build")
@Data
public class BuildInfo {

    private String id;

    private String version;

    private String name;
}
