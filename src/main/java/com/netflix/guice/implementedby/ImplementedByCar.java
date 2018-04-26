package com.netflix.guice.implementedby;

public class ImplementedByCar implements ImplementedByVehicle{

	@Override
	public void drive() {
		System.out.println("Car is being driven");
	}

}
