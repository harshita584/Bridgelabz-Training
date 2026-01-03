package com.inheritance.hybridinheritance.restaurantmanagement;

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef is cooking food in the kitchen.");
    }
}
