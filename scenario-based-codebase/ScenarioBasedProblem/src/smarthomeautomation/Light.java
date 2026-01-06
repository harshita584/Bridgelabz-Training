package smarthomeautomation;

public class Light extends Appliance {

    public Light() {
        super(60); // default 60W
    }

    public Light(int watts) {
        super(watts);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("Light is ON → Soft illumination started");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("Light is OFF");
    }

    @Override
    public void deviceStatus() {
        System.out.println("Light | Power: " + getPowerConsumption() + "W | State: " + isOn());
    }
}