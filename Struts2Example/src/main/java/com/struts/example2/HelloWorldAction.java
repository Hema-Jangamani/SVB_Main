package com.struts.example2;

public class HelloWorldAction {
    private String name;
    public String execute() throws Exception{
        
        if(name.equalsIgnoreCase("banglore")) {
            return "success";
        }
        else{
            return "failure";
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String setName(String name) {
        return this.name = name;
    }
    }
