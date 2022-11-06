import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class FirstInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy firstInterceptor");
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Initialize firstInterceptor");
		
	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("StartInterceptor-1");
		String result = actionInvocation.invoke();
		System.out.println("End Interceptor-1");
		return result;
	}

}
