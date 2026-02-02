package com.annotation.override;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    
    public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
	}
}