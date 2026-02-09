package com.multithreading.bankingmanagementsystem;

public class BankAccount {
	String name;
	int balance;
	
	public BankAccount(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public synchronized void withdraw(int amount) {
		if(amount >= balance) {
			System.out.println(name + " cannot withdraw " + amount + ", insufficient balance!");
			return;
		}
		balance -= amount;
	}
}
