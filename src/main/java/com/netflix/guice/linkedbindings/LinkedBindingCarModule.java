package com.netflix.guice.linkedbindings;

import com.google.inject.AbstractModule;

public class LinkedBindingCarModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(LinkedBindingVehicle.class).to(LinkedBindingCar.class);
		bind(LinkedBindingCar.class).to(LinkedBindingNissan.class);
	}

}
