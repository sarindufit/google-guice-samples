package com.netflix.guice.basic;

import com.google.inject.Inject;

public class BasicNissanCar implements BasicCar{

	BasicEngine basicEngine;
	
	@Inject
	public BasicNissanCar(BasicEngine basicEngine) {
		this.basicEngine = basicEngine;
	}
	
	@Override
	public void drive() {
		System.out.println("This is a nissan car running on: ");
		basicEngine.run();
		System.out.println("\n");
	}

}
