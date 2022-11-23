package com.struts.poc;

import java.util.HashMap;
import java.util.Map;

public class LoginService {

	public boolean validate(String userName, String password) {
		Map<String, String> users = new HashMap<String, String>();
		users.put("Abhishek", "abhi@1234");
		users.put("Agneya", "agneya@1234");
		users.put("Hema", "hema@1234");
		users.put("Jyothsna", "jyo@1234");

		for (Map.Entry user : users.entrySet())
			if (userName.equals(user.getKey()) && password.equals(user.getValue())) {
				return true;
			}
		return false;
	}

}
