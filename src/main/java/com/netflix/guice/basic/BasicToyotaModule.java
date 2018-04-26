package com.netflix.guice.basic;

import com.google.inject.AbstractModule;

public class BasicToyotaModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(BasicCar.class).to(BasicToyotaCar.class);
		bind(BasicEngine.class).to(BasicFastEngine.class);
	}

}
