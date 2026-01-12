package homenest;

public class Camera extends Device {

    public Camera(int id) {
        super(id, 5.0);
    }

    public void reset() {
        System.out.println("Camera " + deviceId + " recalibrated.");
    }
}

