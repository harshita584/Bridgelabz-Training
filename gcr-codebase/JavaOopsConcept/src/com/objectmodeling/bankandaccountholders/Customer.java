package com.objectmodeling.bankandaccountholders;

public class Customer {
    String name;
    double balance;
    Bank bank;   // Associated Bank

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Set associated bank
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    // Set account balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to view balance
    public void viewBalance() {
        System.out.println(name + "'s balance in " +
                           bank.bankName + " is: " + balance);
    }
}

