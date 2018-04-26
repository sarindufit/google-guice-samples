package com.netflix.guice.basic;

public class BasicSlowEngine implements BasicEngine{

	@Override
	public void run() {
		System.out.println("This is a slow engine");
	}

}
