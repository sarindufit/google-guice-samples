package com.netflix.guice.basic;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BasicMain {

	public static void main (String [] args) {
		
		Injector toyotaInjector = Guice.createInjector(new BasicToyotaModule());
		BasicCar toyotaCar = toyotaInjector.getInstance(BasicCar.class);
		toyotaCar.drive();
		
		Injector nissanInjector = Guice.createInjector(new BasicNissanModule());
		BasicCar nissanCar = nissanInjector.getInstance(BasicCar.class);
		nissanCar.drive();
		
	}
}
