package smarthomeautomation;

public class Fan extends Appliance {

	public Fan() {
		super(75);
	}

	public Fan(int watts) {
		super(watts);
	}

	@Override
	public void turnOn() {
		setState(true);
		System.out.println("Fan is ON : Air circulation started");
	}

	@Override
	public void turnOff() {
		setState(false);
		System.out.println("Fan is OFF");
	}

	@Override
	public void deviceStatus() {
		System.out.println("Fan | Power: " + getPowerConsumption() + "W | State: " + isOn());
	}
}