package smarthomeautomation;

public abstract class Appliance implements Controllable {

    private boolean isOn;          // internal state (encapsulated)
    private int powerConsumption;  // watts

    // Default power constructor
    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    // User-defined power constructor
    public Appliance(int powerConsumption, boolean defaultState) {
        this.powerConsumption = powerConsumption;
        this.isOn = defaultState;
    }

    protected void setState(boolean state) {
        this.isOn = state;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public abstract void deviceStatus();
}