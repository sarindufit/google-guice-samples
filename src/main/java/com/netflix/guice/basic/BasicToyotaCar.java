package com.netflix.guice.basic;

import com.google.inject.Inject;


public class BasicToyotaCar implements BasicCar{

	BasicEngine basicEngine;
	
	@Inject
	public BasicToyotaCar(BasicEngine basicEngine) {
		this.basicEngine = basicEngine;
	}
	
	@Override
	public void drive() {
		System.out.println("This is a toyota car running on: ");
		basicEngine.run();
		System.out.println("\n");
	}

}
