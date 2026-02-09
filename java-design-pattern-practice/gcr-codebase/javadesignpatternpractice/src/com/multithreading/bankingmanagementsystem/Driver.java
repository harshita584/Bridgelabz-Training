package com.multithreading.bankingmanagementsystem;

public class Driver {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Customer 1", 10000);
		
		Thread t1 = new Thread(new Transaction(account, 3000));
		Thread t2 = new Thread(new Transaction(account, 4000));
		Thread t3 = new Thread(new Transaction(account, 2000));
		Thread t4 = new Thread(new Transaction(account, 5000));
		Thread t5 = new Thread(new Transaction(account, 1500));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
