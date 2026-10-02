package com.example.config_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/command-info")
public class CommandLineInfoController {

    @Value("${build.id:default}")
    private String buildId;

    @Value("${build.version:default}")
    private String buildVersion;

    @Value("${build.name:default}")
    private String buildName;

    @GetMapping("/")
    private String getCommandLineInfo() {
        return "Build Id: " + buildId
                + "Build Version: " + buildVersion
                + "Build Name: " + buildName;

    }

    /**
     * BUILD_ID will be translated to build.id
     *
     * Linux/macOS (Terminal)
     * -------------------------
     *  export BUILD_ID=12345
     *  export BUILD_VERSION=1.0.0
     *  export BUILD_NAME=ProductService
     *  java -jar target/app.jar
     *
     *  Windows Command Prompt
     *  -------------------------
     *  set BUILD_ID=123
     *  set BUILD_VERSION=1.2.3
     *  set BUILD_NAME=ProductService
     *  java -jar target/app.jar
     *
     *  Windows Power Shell
     *  -------------------------
     *  $env:BUILD_ID="12345"
     *  $env:BUILD_VERSION="1.0.0"
     *  #env:BUILD_NAME=ProductService
     *  java -jar target/app.jar
     *
     * 1. IntelliJ Environment Variables
     * -------------------------------------------
     * -> next to run, debug, triple dot
     * -> Run with parameters
     * -> In Edit Configuration Settings
     * -> Modify Options link
     * -> Add Run Options
     * -> Operating System
     * -> Environment Variable
     * ----------------------------------------
     * BUILD_ID=321;BUILD_VERSION=3.2.1;BUILD_NAME=ProductService;
     *
     * 2. IntelliJ Program Argumets with Place holders in application.yml
     * ------------------------------------------------------------------
     * -> next to run, debug, triple dot
     * -> Run with parameters
     * -> In Edit Configuration Settings
     * -> Mpdify Options link
     * -> Add Run Options
     * -> JAVA
     * -> Program Arguments add id and use it as placeholder in application.yml
     * --id=456
     * in application.yml
     *  build:
     *      id: ${id}
     *
     * 3. Setting up through .env file in SpringBoot for Externalized Configurations
     * - use when more propeties are there
     * - ignore the .env properties file in .gitignore
     * -----------------------------------------------------------------------------
     * create file-name.env file in resources folder
     * -> next to run, debug, triple dot
     * -> Run with parameters
     * -> In Edit Configuration Settings
     * -> Modify Options link
     * -> Add Run Options
     * -> Operating System
     * -> Environment Variable
     * ----------------------------------------
     * F:/Learning Workspace/configuration management/config-demo/src/main/resources/properties.env
     * in properties.env
     *  BUILD_ID=999;
     *  BUILD_VERSION=9.9.9;
     *  BUILD_NAME=EnvironmentPropertiesFile;
     *
     *  4. Passing Configuration via Command-Line Arguments in SpringBoot
     *  -------------------------------------------------------------------
     * open command prompt in IntelliJ Terminal -> Command Prompt
     * run mvn clean package
     * once jar file is created in \target folder then execute below
     * java -Dbuild.id=9999 -Dbuild.version=9.9.9.9 -Dbuild.name=CommandLineArguments -jar target\config-demo-0.0.1-SNAPSHOT.jar
     *
     * same thing we can do in IntelliJ
     * -> next to run, debug, triple dot
     * -> Run with parameters
     * -> In Edit Configuration Settings
     * -> Modify Options link
     * -> Add Run Options
     * -> JAVA
     * -> Program Arguments
     * --build.id=9990 --build.version=9.9.9.0 --build.name=VMOptions
     */
}
