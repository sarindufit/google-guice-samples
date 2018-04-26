package com.netflix.guice.linkedbindings;

public class LinkedBindingToyota extends LinkedBindingVan{

	@Override
	public void drive() {
		System.out.println("This is a van and it is a Toyota ...");
	}

}
