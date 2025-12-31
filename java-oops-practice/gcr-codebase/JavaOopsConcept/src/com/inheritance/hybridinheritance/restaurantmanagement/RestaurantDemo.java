package com.inheritance.hybridinheritance.restaurantmanagement;

public class RestaurantDemo {
    public static void main(String[] args) {

        Chef c1 = new Chef("Rohit", 201);
        Waiter w1 = new Waiter("Amit", 301);

        c1.displayDetails();
        c1.performDuties();
        System.out.println();

        w1.displayDetails();
        w1.performDuties();
    }
}
