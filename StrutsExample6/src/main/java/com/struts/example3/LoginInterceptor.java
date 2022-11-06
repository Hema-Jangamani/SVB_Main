package com.struts.example3;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor,ModelDriven<User>{
	
	private User user = new User();
	public Boolean verifyLogin(User user) {
		System.out.println("Within Login Service");
		if(user.getUserId().equals("user") && user.getPassword().equals("password")) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		   System.out.println("StarInterceptor 1");
	        String result=actionInvocation.invoke();
	        System.out.println("End Interceptor 1");
	        return result;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		System.out.println(user.getUserId()+" "+user.getPassword());
		return user;
	}

}
