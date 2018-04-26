package com.netflix.guice.bindingannotations;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class BindingAnnotationsModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(BindingAnnotationsCar.class).annotatedWith(Names.named("toyota")).to(BindingAnnotationsToyotaCar.class);
		bind(BindingAnnotationsCar.class).annotatedWith(Names.named("nissan")).to(BindingAnnotationsNissanCar.class);
	}

}
