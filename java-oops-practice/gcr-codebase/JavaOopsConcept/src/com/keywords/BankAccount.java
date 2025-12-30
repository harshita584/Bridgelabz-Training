package com.keywords;

public class BankAccount {
	  
	   // Static variable shared across all accounts
	   private static String bankName = "State bank of India";
	   private static int totalAccounts = 0;
	   // Final variable to ensure account number cannot be changed once assigned
	   private final String accountNumber;
	   private String accountHolderName;
	   private double balance;
	   // Constructor using 'this' to avoid ambiguity
	   public BankAccount(String accountHolderName, String accountNumber, double balance) {
	       this.accountHolderName = accountHolderName;
	       this.accountNumber = accountNumber;  // Final variable assigned only once
	       this.balance = balance;
	       totalAccounts++;   // Increment total accounts with each new account
	   }
	   // Static method to get the total number of accounts
	   public static void getTotalAccounts() {
	       System.out.println("Total number of accounts: " + totalAccounts);
	   }
	   // Method to display account details
	   public void displayAccountDetails() {
	       // Using instanceof to check if the object is a BankAccount instance
	       if (this instanceof BankAccount) {
	           System.out.println("Bank Name: " + bankName);
	           System.out.println("Account Holder: " + accountHolderName);
	           System.out.println("Account Number: " + accountNumber);
	           System.out.println("Balance: $" + balance);
	       } else {
	           System.out.println("Invalid account instance.");
	       }
	   }
	   // Getters and setters
	   public String getAccountHolderName() {
	       return accountHolderName;
	   }
	   public void setAccountHolderName(String accountHolderName) {
	       this.accountHolderName = accountHolderName;
	   }
	   public double getBalance() {
	       return balance;
	   }
	   public void deposit(double amount) {
	       if (amount > 0) {
	           balance += amount;
	           System.out.println("Deposited: $" + amount);
	       } else {
	           System.out.println("Invalid deposit amount.");
	       }
	   }
	   public void withdraw(double amount) {
	       if (amount > 0 && amount <= balance) {
	           balance -= amount;
	           System.out.println("Withdrawn: $" + amount);
	       } else {
	           System.err.println("Insufficient balance or invalid amount.");
	       }
	   }
	   // Main method for testing
	   public static void main(String[] args) {
	       // Create two bank accounts
	       BankAccount account1 = new BankAccount("Harshita Patel", "ACC12345", 1000.00);
	       BankAccount account2 = new BankAccount("Diksha Vaidyaraj", "ACC67890", 500.00);
	       // Display account details
	       System.out.println("\nAccount 1 Details:");
	       account1.displayAccountDetails();
	       System.out.println("\nAccount 2 Details:");
	       account2.displayAccountDetails();
	       // Check total accounts
	       BankAccount.getTotalAccounts();
	       // Deposit and withdraw operations
	       System.out.println("\nPerforming transactions on Account 1:");
	       account1.deposit(200);
	       account1.withdraw(150);
	       account1.displayAccountDetails();
	       account2.displayAccountDetails();
	       account2.deposit(100);
	       account2.withdraw(800);
	   }
	}

