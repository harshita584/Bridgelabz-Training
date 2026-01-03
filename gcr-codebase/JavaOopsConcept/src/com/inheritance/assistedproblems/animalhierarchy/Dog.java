package com.inheritance.assistedproblems.animalhierarchy;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age); // call superclass constructor
    }

    // Overridden method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}
