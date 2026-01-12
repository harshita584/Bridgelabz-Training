package homenest;

public abstract class Device implements IControllable {

    protected int deviceId;
    private boolean status;          
    protected double energyUsage;

    // secured firmware log
    protected String firmwareLog = "Firmware v1.0";

    public Device(int deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        System.out.println("Device " + deviceId + " registered.");
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Device " + deviceId + " turned ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Device " + deviceId + " turned OFF");
    }

    public double calculateMonthlyEnergy(int days) {
        return energyUsage * days;
    }

    protected void updateFirmware(String log) {
        firmwareLog = log;
    }
}

