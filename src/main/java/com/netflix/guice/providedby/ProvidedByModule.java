package com.netflix.guice.providedby;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class ProvidedByModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(ProvidedByCar.class).in(Singleton.class);
	}

}
