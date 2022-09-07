package com.proxy.pattern;

public class ProxyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommandExecutor executor = new CommandExecutorProxy("User1", "wrong_pwd");
		
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Message :: "+e.getMessage());
		}

	}

}
