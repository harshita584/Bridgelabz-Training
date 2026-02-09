package com.banktransactions;

public class Driver {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer(new Customer("Cust1", 1000));
        bank.addCustomer(new Customer("Cust2", 1500));

        TransactionThread t1 = new TransactionThread(bank, 0, "Thread-1");
        TransactionThread t2 = new TransactionThread(bank, 0, "Thread-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
