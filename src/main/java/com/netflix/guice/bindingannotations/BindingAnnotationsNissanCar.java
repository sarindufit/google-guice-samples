package com.netflix.guice.bindingannotations;

public class BindingAnnotationsNissanCar implements BindingAnnotationsCar {

	@Override
	public void drive() {
		System.out.println("This is a Nissan car ...");
	}

}
