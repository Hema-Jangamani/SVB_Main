package com.brillio.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Student obj = (Student) context.getBean("student");
		obj.display();	
		System.out.println(obj.getStudentName());
	}

}
