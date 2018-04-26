package com.netflix.guice.implementedby;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ImplementedByMain {

	public static void main (String [] args) {
		Injector injector  = Guice.createInjector(new ImplementedByModule());
		ImplementedByVehicle vehicle = injector.getInstance(ImplementedByVehicle.class);
		vehicle.drive();
	}
}
