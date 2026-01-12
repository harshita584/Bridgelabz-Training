package homenest;

public class Thermostat extends Device {

    public Thermostat(int id) {
        super(id, 3.5);
    }

    public void reset() {
        System.out.println("Thermostat " + deviceId + " temperature reset.");
    }
}
