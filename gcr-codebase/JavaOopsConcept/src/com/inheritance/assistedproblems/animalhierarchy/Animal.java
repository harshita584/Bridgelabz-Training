package com.inheritance.assistedproblems.animalhierarchy;

public class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
