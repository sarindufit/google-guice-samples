package com.netflix.guice.bindingannotations;

public class BindingAnnotationsToyotaCar implements BindingAnnotationsCar{

	@Override
	public void drive() {
		System.out.println("This is a Toyota car ...");
	}

}
