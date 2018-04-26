package com.netflix.guice.instancebindings;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

public class InstanceBindingsMain {
	
	public static void main (String [] args) {
		Injector injector = Guice.createInjector(new InstanceBindingModule());
		String jdbcURL = injector.getInstance(Key.get(String.class, Names.named("JDBC_URL")));
		System.out.println("JDBC URL is: " + jdbcURL);
	}

}
