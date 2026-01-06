package petpal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-15);
        changeMood(5);
        System.out.println(name + " is eating silently.");
    }

    @Override
    public void play() {
        changeEnergy(-10);
        changeMood(15);
        System.out.println(name + " is chasing a laser!");
    }

    @Override
    public void sleep() {
        changeEnergy(30);
        System.out.println(name + " is sleeping lazily.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
