package com.classandobjects.leveltwo;

public class BankAccount {
	//Attributes
	private String accountHolder;
	private String accountNumber;
	private double balance;
	
	//constructor
	public BankAccount(String accountHolder,String accountNumber,double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//creating method to display bank name
	public static void displayBank() {
		System.out.println("\t\t\t\tState of Chennai\t\t\t\t");
		
	}
	//Creating the method to calculate the deposit
	public void deposit(double amount) {
		if(amount > 0) {
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}
		else {
			System.out.println("Amount to deposit must be positive");
		}
	}
	
	//Creating the method to calculate the withdraw amount
	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Withdraw amount is : "+amount);
		}
		else if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	// Method to display the current balance
   public void displayBalance() {
       System.out.println("Current balance: " + balance);
   }
   // Main method for testing
   public static void main(String[] args) {
       // Creating a BankAccount object
       BankAccount account = new BankAccount("Lynda", "123456789", 700.00);
      
       //Display the Bank name
       displayBank();
      
       // Display initial balance
       account.displayBalance();
       // Deposit money
       account.deposit(200.00);
       account.displayBalance();
       // Withdraw money
       account.withdraw(100.00);
       account.displayBalance();
       // Try to withdraw more than the available balance
       account.withdraw(900.00);
   }
}
