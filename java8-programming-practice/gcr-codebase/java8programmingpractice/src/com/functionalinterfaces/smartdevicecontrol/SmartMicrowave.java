package com.functionalinterfaces.smartdevicecontrol;

public class SmartMicrowave implements Device {
	public void turnOn() {
		System.out.println("Smart microwave turned on");
	}

	public void turnOff() {
		System.out.println("Smart microwave turned off");
	}
	
}
