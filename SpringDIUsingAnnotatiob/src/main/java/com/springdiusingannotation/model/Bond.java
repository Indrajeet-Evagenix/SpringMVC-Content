package com.springdiusingannotation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bond {
	
	@Autowired
//	@Qualifier("Ferari")
	@Qualifier("Mustang")
	private Car car;

	public void showCar() {
		car.getCarName();
	}

}