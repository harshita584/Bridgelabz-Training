package com.inheritance.hierarchicalinheritance.bankaccount;

class FixedDepositAccount extends BankAccount {
    int lockPeriod;   // in months

    FixedDepositAccount(int accountNumber, double balance, int lockPeriod) {
        super(accountNumber, balance);
        this.lockPeriod = lockPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
