package com.netflix.guice.linkedbindings;

import com.google.inject.AbstractModule;

public class LinkedBindingVanModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(LinkedBindingVehicle.class).to(LinkedBindingVan.class);
		bind(LinkedBindingVan.class).to(LinkedBindingToyota.class);
	}

}
