package petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated variables
    private int hunger;   // 0 (full) to 100 (very hungry)
    private int energy;   // 0 (tired) to 100 (full energy)
    private int mood;     // 0 (sad) to 100 (happy)

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        Random rand = new Random();
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = rand.nextInt(50);
        this.energy = rand.nextInt(50) + 50;
        this.mood = rand.nextInt(50) + 50;
    }

    // Encapsulation: getters only
    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMood() {
        return mood;
    }

    // Internal modification only via methods
    protected void changeHunger(int value) {
        hunger = Math.max(0, Math.min(100, hunger + value));
    }

    protected void changeEnergy(int value) {
        energy = Math.max(0, Math.min(100, energy + value));
    }

    protected void changeMood(int value) {
        mood = Math.max(0, Math.min(100, mood + value));
    }

    public void showStatus() {
        System.out.println(name + " [" + type + "] | Hunger: " + hunger +
                " | Energy: " + energy + " | Mood: " + mood);
    }

    // Polymorphic method
    public abstract void makeSound();
}
