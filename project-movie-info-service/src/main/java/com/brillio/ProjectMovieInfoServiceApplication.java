package com.brillio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProjectMovieInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMovieInfoServiceApplication.class, args);
	}

}
