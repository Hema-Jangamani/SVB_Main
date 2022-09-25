package com.brillio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProjectDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDiscoveryServiceApplication.class, args);
	}

}
