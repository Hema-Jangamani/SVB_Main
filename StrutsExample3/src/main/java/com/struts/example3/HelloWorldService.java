package com.struts.example3;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldService {

	 public List<String> getList() {
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("Gulbarga");
	        list.add("Bengaluru");
	        return list;
	    }

}
