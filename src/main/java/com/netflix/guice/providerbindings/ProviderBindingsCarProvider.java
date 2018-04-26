package com.netflix.guice.providerbindings;

import com.google.inject.Provider;

public class ProviderBindingsCarProvider implements Provider<ProviderBindingsCar>{

	@Override
	public ProviderBindingsCar get() {
		ProviderBindingsCar car = new ProviderBindingsCar();
		car.setBrand("Toyota");
		car.setModel("Vits");
		car.setUpgraded(true);
		return car;
	}
	
}
