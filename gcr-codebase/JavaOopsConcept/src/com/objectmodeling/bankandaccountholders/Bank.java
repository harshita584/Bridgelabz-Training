package com.objectmodeling.bankandaccountholders;

import java.util.ArrayList;

public class Bank {
    String bankName;
    ArrayList<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, double initialBalance) {
        customer.setBank(this);
        customer.setBalance(initialBalance);
        customers.add(customer);

        System.out.println("Account opened for " + customer.name +
                           " in " + bankName);
    }
}
