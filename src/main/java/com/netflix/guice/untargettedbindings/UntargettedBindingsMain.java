package com.netflix.guice.untargettedbindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class UntargettedBindingsMain {
	
	public static void main (String [] args) {
		Injector injector = Guice.createInjector(new UntargettedBindingsModule());
		UntargettedBindingsCar car = injector.getInstance(UntargettedBindingsCar.class);
		System.out.println("UntargettedBindings +++++++++++++++++++++++++    " + car.brand);
		System.out.println("UntargettedBindings +++++++++++++++++++++++++    " + car.model);
	}

}