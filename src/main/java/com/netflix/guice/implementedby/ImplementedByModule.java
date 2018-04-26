package com.netflix.guice.implementedby;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class ImplementedByModule extends AbstractModule{

	@Override
	protected void configure() {
		//bind(ImplementedByVehicle.class).in(Singleton.class);
		bind(ImplementedByVehicle.class).to(ImplementedByBike.class).in(Singleton.class);
	}

}
