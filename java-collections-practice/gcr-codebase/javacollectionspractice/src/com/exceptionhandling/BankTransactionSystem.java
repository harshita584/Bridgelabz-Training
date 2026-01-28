package com.exceptionhandling;

public class BankTransactionSystem {
	static int balance;
	
	private static int withdraw(double amount) throws Exception {
		if(amount > balance) throw new InsufficientBalanceException("Insufficient balance!");
		if(amount < 0) throw new IllegalArgumentException("Invalid amount!");
		
		balance -= amount;
		return balance;
	}
	
	public static void main(String[] args) {
		balance = 1000;
		try {
			int newBalance = withdraw(10000);
			System.out.println("Withdrawal successful, new balance: " + newBalance);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
