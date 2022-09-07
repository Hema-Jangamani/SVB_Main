package com.proxy.pattern;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void runCommand(String cmd) throws IOException {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec(cmd);
		System.out.println("'"+cmd+"' command executed.");
		
	}

}
