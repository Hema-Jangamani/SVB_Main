package com.brillio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProjectRatingDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectRatingDataServiceApplication.class, args);
	}

}
