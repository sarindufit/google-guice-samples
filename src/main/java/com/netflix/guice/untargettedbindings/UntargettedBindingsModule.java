package com.netflix.guice.untargettedbindings;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class UntargettedBindingsModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(UntargettedBindingsCar.class).in(Singleton.class);
	}

}
