package mybank;

import java.util.*;



public class MyBankApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to MyBank");
		System.out.println("-----------------");
		
		//choose account type
		System.out.println("Select Account Type");
		System.out.println("1. Savings Account");
		System.out.println("2. Current Account");
		int choice = input.nextInt();
		input.nextLine();
		
		
		System.out.println("Enter Account Number: ");
		String accountNumber = input.nextLine();
		
		
		System.out.println("Enter Opening Balance: ");
		double openingBalance = input.nextDouble();
		
		Account account;
		
		if(choice ==1) {
			
			System.out.println("Enter Interest Rate(%): ");
			double interestRate = input.nextDouble();
			
			account = new SavingsAccount(accountNumber, openingBalance, interestRate);
		}else if(choice ==2) {
			
			account = new CurrentAccount(accountNumber, openingBalance);
		}else {
			System.out.println("Invalid Account type. Exiting");
			input.close();
			return;
		}
		int option;
		do {
			System.out.println("\nChoose Option:");
			System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Calculate Interest\n5. Exit");
			option = input.nextInt();
			
			switch(option) {
				case 1 : 
					System.out.println("Enter the amount to deposit: ");
					account.deposit(input.nextDouble());
					break;
					
				case 2 :
					System.out.println("Enter the amount to withdraw");
					account.withdraw(input.nextDouble());
					break;
					
				case 3 : 
					System.out.println("Current Balance: " + account.checkBalance());
					break;
					
				case 4 :
					System.out.println("Calculated Intrest: " + account.calculateInterest());
					break;
					
				case 5 : 
					System.out.println("Thank you for using MyBank.");
					break;
				
				default:
					System.out.println("Invalid option.");
			}
		}while(option != 5);
		
		input.close();
		
		
	}
}