package birdSantuary;

public class Duck extends Bird implements Flyable, Swimmable {
    public Duck(int id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println("Duck is flying distance");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}