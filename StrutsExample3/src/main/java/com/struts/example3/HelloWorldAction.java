package com.struts.example3;

import java.util.ArrayList;

public class HelloWorldAction {
	
	private String name;
	private String list;
	public String execute() throws Exception{
		
		HelloWorldService obj = new HelloWorldService();
		 list=obj.getList().toString();		
		return "success";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	
	

}
