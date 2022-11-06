import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	LoginService loginService = new LoginService();

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		System.out.println(" Within getModel....");
		return user;
	}
	public String execute() {
		System.out.println(" Within execute....");
		if(loginService.verifyLogin(user))
			return SUCCESS;
		else 
			return "Failure";
	}
	
	
}
