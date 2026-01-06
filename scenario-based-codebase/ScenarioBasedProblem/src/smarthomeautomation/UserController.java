package smarthomeautomation;

public class UserController {

    public void operateDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerConsumption() > a2.getPowerConsumption()) {
            System.out.println("First appliance consumes more power");
        } else if (a1.getPowerConsumption() < a2.getPowerConsumption()) {
            System.out.println("Second appliance consumes more power");
        } else {
            System.out.println("Both appliances consume equal power");
        }
    }
}