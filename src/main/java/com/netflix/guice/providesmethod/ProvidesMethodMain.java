package com.netflix.guice.providesmethod;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ProvidesMethodMain {

	public static void main (String [] args) {
		
		Injector injector = Guice.createInjector(new ProvidesMethodModule());
		ProvidesMethodCar providesMethodCar = injector.getInstance(ProvidesMethodCar.class);
		
		System.out.println("+++++++++++++++++    " + providesMethodCar.getBrand());
		System.out.println("+++++++++++++++++    " + providesMethodCar.getModel());
	
	}
}
