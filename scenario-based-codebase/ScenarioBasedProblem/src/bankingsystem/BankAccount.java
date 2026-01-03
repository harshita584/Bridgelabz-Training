package com.fourpillarsimplementation.bankingsystem;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;
    
     public BankAccount(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	 public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	void deposit(double amount)
     {
    	 balance += amount;
     }
    
     void withdraw(double amount)
     {
    	 balance -= amount;
     }
    
    abstract double calculateInterest();
}
