import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SecondInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy secondInterceptor");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Initialize secondInterceptor");

	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		// TODO Auto-generated method stub
		String startInterceptor = " Start Interceptor 2";
		System.out.println("Start Interceptor 2");
		String result = actionInvocation.invoke();
		System.out.println("End Interceptor 2");
		return result;
	}

}
