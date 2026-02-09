package com.multithreading.bankingmanagementsystem;

public class Transaction implements Runnable{
	BankAccount account;
	int amount;
	public Transaction(BankAccount account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	public void run() {
		account.withdraw(amount);
	}
	
}
