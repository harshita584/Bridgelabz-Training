package smarthomeautomation;

public class AC extends Appliance {

    public AC() {
        super(1500); // heavy power usage
    }

    public AC(int watts) {
        super(watts);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("AC is ON → Cooling system activated");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("AC is OFF");
    }

    @Override
    public void deviceStatus() {
        System.out.println("AC | Power: " + getPowerConsumption() + "W | State: " + isOn());
    }
}