package com.brillio;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello There!!";
	}
	
	@RequestMapping("/user")
	public String helloUser() {
		return "Hello there User...";
	}
	
	@RequestMapping("/admin")
	public String helloAdmin() {
		return "Hello there Admin...";
	}
	

}
