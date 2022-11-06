package com.struts.example3;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	  LoginService loginService=new LoginService();
	  
	  
	  public String execute() {
	      if(loginService.verifyLogin(this.getModel())) {
	          return "success";
	      }
	    return "failure";
	      
	  }
	  
	  
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		 System.out.println(user.getUserId()+" "+user.getPassword());
		return user;
	}
	
//	String userId;
//	String password;
	
//	public String execute() {
//		if(getUserId().equals("user1") && getPassword().equals("password"))
//			return "success";
//		else
//			return "failure";
//	}
	
//	public void validate() {
//		if (StringUtils.isEmpty(getUserId())) {
//			addFieldError("userId", "User id cant be null");
//		}
//	}

//	public String getUserId() {
//		return userId;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	

}
