package homenest;

public class HomeNestDemo {

    public static void main(String[] args) {

        Device light = new Light(101);
        Device camera = new Camera(102);
        Device thermostat = new Thermostat(103);
        Device lock = new Lock(104);

        light.turnOn();
        camera.turnOn();
        thermostat.turnOff();

        System.out.println("Light energy (30 days): " + light.calculateMonthlyEnergy(30));

     
        light.reset();
        camera.reset();
        thermostat.reset();
        lock.reset();
    }
}
