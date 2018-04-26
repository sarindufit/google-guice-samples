package com.netflix.guice.basic;

public class BasicFastEngine implements BasicEngine{

	@Override
	public void run() {
		System.out.println("This is a fast engine");
	}

}
