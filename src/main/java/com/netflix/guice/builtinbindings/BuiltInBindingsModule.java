package com.netflix.guice.builtinbindings;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class BuiltInBindingsModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(BuiltInBindingsMain.class).in(Singleton.class);
	}

	
}
