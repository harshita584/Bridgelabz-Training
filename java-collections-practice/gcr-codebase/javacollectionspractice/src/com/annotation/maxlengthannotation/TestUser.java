package com.annotation.maxlengthannotation;

public class TestUser {
    public static void main(String[] args) {
        try {
            User u1 = new User("Harshita");           
            User u2 = new User("VeryLongUsername");  
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
