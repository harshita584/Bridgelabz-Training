package homenest;

public class Light extends Device {

    public Light(int id) {
        super(id, 2.5);
    }

    public void reset() {
        System.out.println("Light " + deviceId + " brightness reset.");
    }
}
