
public class LoginService {

	public Boolean verifyLogin(User user) {
		if(user.getUserId().equals("userId") && user.getPassword().equals("password")) {
			return true;
		}
		else {
			return false;
		}
	}
}
