package com.netflix.guice.instancebindings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class InstanceBindingModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(String.class).annotatedWith(Names.named("JDBC_URL")).toInstance("SampleJDBCURL");
	}

}
