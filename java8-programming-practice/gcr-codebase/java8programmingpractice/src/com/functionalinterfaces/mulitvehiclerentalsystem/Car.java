package com.functionalinterfaces.mulitvehiclerentalsystem;

public class Car implements Vehicle{
	public void rent() {
		System.out.println("Rent car");
	}

	public void returnVehicle() {
		System.out.println("Return car");
	}
}
