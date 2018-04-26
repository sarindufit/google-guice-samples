package com.netflix.guice.providerbindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ProviderBindingsMain {
	
	public static void main (String [] args) {
		Injector injector = Guice.createInjector(new ProviderBindingsModule());
		ProviderBindingsCar car = injector.getInstance(ProviderBindingsCar.class);
		System.out.println("ProviderBindings ++++++++++++++++++            " + car.getBrand());
		System.out.println("ProviderBindings ++++++++++++++++++            " + car.getModel());
	}

}
