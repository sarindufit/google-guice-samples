package com.netflix.guice.linkedbindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class LinkedBindingMain {

	public static void main (String [] args) {
		
		Injector nissanCarInjector = Guice.createInjector(new LinkedBindingCarModule());
		LinkedBindingVehicle linkedBindingNissanCar = nissanCarInjector.getInstance(LinkedBindingVehicle.class);
		
		
		Injector toyotaVanInjector = Guice.createInjector(new LinkedBindingVanModule());
		LinkedBindingVehicle linkedBindingToyotaVan = toyotaVanInjector.getInstance(LinkedBindingVehicle.class);
		
		linkedBindingNissanCar.drive();
		linkedBindingToyotaVan.drive();
	}
}
