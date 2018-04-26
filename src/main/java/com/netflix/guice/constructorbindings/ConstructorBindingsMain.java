package com.netflix.guice.constructorbindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ConstructorBindingsMain {

	public static void main (String [] args) {
		Injector injector = Guice.createInjector(new ConstructorBindingsModule());
		ConstructorBindingsCar car = injector.getInstance(ConstructorBindingsCar.class);
		System.out.println(car.wheel.brand);
	}
}
