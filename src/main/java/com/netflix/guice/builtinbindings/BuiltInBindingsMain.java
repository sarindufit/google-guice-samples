package com.netflix.guice.builtinbindings;

import java.util.logging.Logger;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class BuiltInBindingsMain {
	
	private Logger logger;
	
	@Inject
	public BuiltInBindingsMain (Logger logger) {
		this.logger = logger;
	}
	
	public void logMessage () {
		logger.info("This is an info log");
	}
	
	public static void main (String [] args) {
		Injector injector = Guice.createInjector(new BuiltInBindingsModule());
		BuiltInBindingsMain main = injector.getInstance(BuiltInBindingsMain.class);
		main.logMessage();
	}

}
