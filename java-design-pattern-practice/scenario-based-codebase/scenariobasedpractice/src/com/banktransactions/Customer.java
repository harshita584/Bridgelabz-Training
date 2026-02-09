package com.banktransactions;

public class Customer {
    String name; 
    private int balance;

    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
