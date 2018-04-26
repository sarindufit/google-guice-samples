package com.netflix.guice.bindingannotations;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

public class BindingAnnotationsMain {

	public static void main (String [] args) {
		
		Injector injector = Guice.createInjector(new BindingAnnotationsModule());
		BindingAnnotationsCar bindingAnnotationsCarNissan = injector.getInstance(Key.get(BindingAnnotationsCar.class, Names.named("nissan")));
		BindingAnnotationsCar bindingAnnotationsCarToyota = injector.getInstance(Key.get(BindingAnnotationsCar.class, Names.named("toyota")));
		
		bindingAnnotationsCarNissan.drive();
		bindingAnnotationsCarToyota.drive();
		
	}
}
