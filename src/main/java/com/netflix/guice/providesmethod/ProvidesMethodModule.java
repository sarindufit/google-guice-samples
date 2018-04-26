package com.netflix.guice.providesmethod;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ProvidesMethodModule extends AbstractModule {

	@Override
	protected void configure() {
		
	}

	@Provides
	ProvidesMethodCar providesMethodCar() {
		ProvidesMethodCar providesMethodCar = new ProvidesMethodCar();
		providesMethodCar.setBrand("Toyota");
		providesMethodCar.setModel("Vitz");
		providesMethodCar.setUpgraded(false);
		return providesMethodCar;
	}

}
