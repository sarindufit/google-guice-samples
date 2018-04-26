package com.netflix.guice.constructorbindings;

import com.google.inject.AbstractModule;

public class ConstructorBindingsModule extends AbstractModule{

	@Override
	protected void configure() {
		try {
			bind(ConstructorBindingsCar.class).toConstructor(ConstructorBindingsCar.class.getConstructor(ConstructorBindingsWheel.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

}