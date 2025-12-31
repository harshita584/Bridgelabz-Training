package com.objectmodeling.bankandaccountholders;

public class AssociationDemo {
    public static void main(String[] args) {

        // Create Bank
        Bank bank = new Bank("State Bank");

        // Create Customers
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Anita");

        // Associate customers with bank
        bank.openAccount(c1, 5000);
        bank.openAccount(c2, 10000);

        // Customers interact with bank
        c1.viewBalance();
        c2.viewBalance();
    }
}
