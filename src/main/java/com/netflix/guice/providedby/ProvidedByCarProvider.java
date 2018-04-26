package com.netflix.guice.providedby;

import com.google.inject.Provider;

public class ProvidedByCarProvider implements Provider<ProvidedByCar>{

	@Override
	public ProvidedByCar get() {
		ProvidedByCar car = new ProvidedByCar();
		car.setBrand("Toyota");
		car.setModel("Vitz");
		return car;
	}
}
