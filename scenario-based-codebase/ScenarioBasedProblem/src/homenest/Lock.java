package homenest;

public class Lock extends Device {

    public Lock(int id) {
        super(id, 1.0);
    }

    public void reset() {
        System.out.println("Lock " + deviceId + " security reset.");
    }
}
