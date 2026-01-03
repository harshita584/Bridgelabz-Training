package com.inheritance.assistedproblems.animalhierarchy;

public class AnimalDemo {
    public static void main(String[] args) {

        // Polymorphic references
        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Whiskers", 2);
        Animal a3 = new Bird("Tweety", 1);

        // Same method, different behavior
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
