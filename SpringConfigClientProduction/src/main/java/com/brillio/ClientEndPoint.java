package com.brillio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientEndPoint {
	
	@Autowired
	private DBSettings db1;
	
	@Value("${my.greeting}")
	private String greetingMessage;
	
	@Value("${my.list.values}")
	private List<String> listValues;
	
	@Value("static message...")
	private String staticmessage;
	
	@RequestMapping("config")
	public String hello() {
		return "DB: "+greetingMessage +staticmessage+ db1.getConnection() + db1.getHost() + db1.getPort();
	}

	@RequestMapping("getListValues")
	public List abc() {
		return listValues;
	}
}
