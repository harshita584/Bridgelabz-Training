package com.functionalinterfaces.mulitvehiclerentalsystem;

public class DriverClass {
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.rent();
		bike.returnVehicle();
		
		Bus bus = new Bus();
		bus.rent();
		bus.returnVehicle();
		
		Car car = new Car();
		car.rent();
		car.returnVehicle();
	}
}
