package petpal;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        changeHunger(-20);
        changeMood(10);
        System.out.println(name + " is eating happily!");
    }

    @Override
    public void play() {
        changeEnergy(-15);
        changeMood(20);
        changeHunger(10);
        System.out.println(name + " is playing fetch!");
    }

    @Override
    public void sleep() {
        changeEnergy(25);
        changeMood(5);
        System.out.println(name + " is sleeping peacefully.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
