package com.example.config_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigDemoApplication.class, args);
	}

	/**
	 * Precendence Order
	 * 1. Command Line Arguments --build.id=12345
	 * 2. JAVA System Properties -Dbuild.id=6789
	 * 3. OS Environment variables export build_id=1011
	 * 4. application.properties or application.yml
	 * 5. Spring Cloud Config Server (if used)
	 * 6. default values inside the application code
	 */
}
