package com.netflix.guice.implementedby;

public class ImplementedByBike implements ImplementedByVehicle{

	@Override
	public void drive() {
		System.out.println("A brike is  being driven");
	}

}
