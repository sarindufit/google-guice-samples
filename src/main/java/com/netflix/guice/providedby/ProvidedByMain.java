package com.netflix.guice.providedby;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ProvidedByMain {

	public static void main (String [] args) {
		Injector injector = Guice.createInjector(new ProvidedByModule());
		ProvidedByCar car = injector.getInstance(ProvidedByCar.class);
		System.out.println("++++++++++++++++++++++     " + car.getBrand());
		System.out.println("++++++++++++++++++++++     " + car.getModel());
	}
}
