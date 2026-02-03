package com.functionalinterfaces.smartdevicecontrol;

public class DriverClass {
	public static void main(String[] args) {
		SmartMicrowave microwave = new SmartMicrowave();
		microwave.turnOn();
		microwave.turnOff();
	}
}
