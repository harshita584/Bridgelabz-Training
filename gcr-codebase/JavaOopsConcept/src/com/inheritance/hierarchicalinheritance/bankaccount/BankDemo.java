package com.inheritance.hierarchicalinheritance.bankaccount;

public class BankDemo {
    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount(101, 50000, 4.5);
        CheckingAccount c1 = new CheckingAccount(102, 30000, 10000);
        FixedDepositAccount f1 = new FixedDepositAccount(103, 100000, 24);

        s1.displayAccountType();
        s1.displayDetails();
        System.out.println();

        c1.displayAccountType();
        c1.displayDetails();
        System.out.println();

        f1.displayAccountType();
        f1.displayDetails();
    }
}
