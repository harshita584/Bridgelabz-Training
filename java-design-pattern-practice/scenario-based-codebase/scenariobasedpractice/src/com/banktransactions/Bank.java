package com.banktransactions;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public synchronized void deposit(int i, int amount) {
        Customer customer = customers.get(i);
        
        int balance = customer.getBalance();
        balance = balance + amount;
        customer.setBalance(balance);

        System.out.println(customer.name + " Balance: " + balance);
    }

    public synchronized void withdraw(int i, int amount) {
        Customer customer = customers.get(i);
        int balance = customer.getBalance();

        if (balance >= amount) {
            balance = balance - amount;
            customer.setBalance(balance);
            System.out.println("Withdraw from " + customer.name +  " Balance: " + balance);
        } 
        else System.out.println("Insufficient balance for " + customer.name);
    }

    public synchronized int getBalance(int i) {
        return customers.get(i).getBalance();
    }
}
