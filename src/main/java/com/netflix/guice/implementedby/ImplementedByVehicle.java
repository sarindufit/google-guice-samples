package com.netflix.guice.implementedby;

import com.google.inject.ImplementedBy;

@ImplementedBy(ImplementedByCar.class)
public interface ImplementedByVehicle {
	
	public void drive();

}
