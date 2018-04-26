package com.netflix.guice.linkedbindings;

public class LinkedBindingNissan extends LinkedBindingCar{

	@Override
	public void drive() {
		System.out.println("This is a car and it is a Nissan ...");
	}

}
