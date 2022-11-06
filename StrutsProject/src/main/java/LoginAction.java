
import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport {
	
	String userId;
	String password;
	
	public String execute() {
		if(getUserId().equals("user1") && getPassword().equals("password"))
			return "success";
		else
			return "failure";
	}
	
	public void validate() {
		if (StringUtils.isEmpty(getUserId())) {
			addFieldError("userId", "User id cant be null");
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
