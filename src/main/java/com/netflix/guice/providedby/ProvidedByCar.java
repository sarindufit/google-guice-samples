package com.netflix.guice.providedby;

import com.google.inject.ProvidedBy;

@ProvidedBy(ProvidedByCarProvider.class)
public class ProvidedByCar {
	private String brand;
	
	private String model;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
