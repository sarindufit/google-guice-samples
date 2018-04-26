package com.netflix.guice.constructorbindings;

public class ConstructorBindingsCar {
	
	ConstructorBindingsWheel wheel;
	
	public ConstructorBindingsCar (ConstructorBindingsWheel wheel) {
		this.wheel = wheel;
	}

}
