package com.struts.example3;

public class LoginService {


	public Boolean verifyLogin(User user) {
		if(user.getUserId().equals("user") && user.getPassword().equals("password")) {
			return true;
		}
		else {
			return false;
		}
	}
}



