package petpal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-10);
        changeMood(10);
        System.out.println(name + " is pecking seeds.");
    }

    @Override
    public void play() {
        changeEnergy(-20);
        changeMood(25);
        System.out.println(name + " is flying around!");
    }

    @Override
    public void sleep() {
        changeEnergy(20);
        System.out.println(name + " is resting in its nest.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}
