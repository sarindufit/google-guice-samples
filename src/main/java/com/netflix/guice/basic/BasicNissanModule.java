package com.netflix.guice.basic;

import com.google.inject.AbstractModule;

public class BasicNissanModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(BasicCar.class).to(BasicNissanCar.class);
		bind(BasicEngine.class).to(BasicSlowEngine.class);
	}

}
