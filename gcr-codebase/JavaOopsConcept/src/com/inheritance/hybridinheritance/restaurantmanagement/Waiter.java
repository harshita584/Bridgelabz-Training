package com.inheritance.hybridinheritance.restaurantmanagement;

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter is serving food to customers.");
    }
}
