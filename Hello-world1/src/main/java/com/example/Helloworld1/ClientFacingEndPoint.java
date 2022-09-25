package com.example.Helloworld1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientFacingEndPoint {
	
	@Autowired
	private DbSettings db1;
	
	@Value("${my.greeting}")
	private String greetingMessage;
	
	@Value("static message...")
	private String staticmessage;
	
	@Value("${my.list.values}")
	private List<String> listValues;  //comma seperated values in property file
	
	@RequestMapping("hello1")
	public String hello() {
		return "####"+greetingMessage + db1.getConnection() + db1.getHost() + db1.getPort();
	}
	
	@RequestMapping("static")
	public String staticMsg() {
		return "####"+staticmessage;
	}

	@RequestMapping("getListValues")
	public List abc() {
		return listValues;
	}
	
	@Autowired
	private Environment env;
	
	@GetMapping("/envDetails")  // to get all details
	public String envDetails() {
		return env.toString();
	}
}
