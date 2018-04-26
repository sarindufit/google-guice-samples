package com.netflix.guice.providerbindings;

import com.google.inject.AbstractModule;

public class ProviderBindingsModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(ProviderBindingsCar.class).toProvider(ProviderBindingsCarProvider.class);
	}

}
