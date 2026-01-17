package birdSantuary;

public class Eagle extends Bird implements Flyable {
    public Eagle(int id, String name) {
        super(id, name, "Eagle");
    }

    public void fly() {
        System.out.println("Eagle is flying");
    }
}