package com.fourpillarsimplementation.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void printAccountDetails(List <BankAccount> bankAccounts)
	{
		for(BankAccount b : bankAccounts)
		{
			if(b instanceof Loanable)
			{
				Loanable a = (Loanable) b;
				 a.applyForLoan();
				 System.out.println(a.calculateLoanEligibility());
			}
		}
	}
	
	public static void main(String[] args) {
		List <BankAccount> bankAccounts = new ArrayList<>();
		bankAccounts.add(new SavingsAccount(123456789, "Harshita Patel", 15000));
		bankAccounts.add(new CurrentAccount(987654321, "Palak Agrawal", 20000));
		printAccountDetails(bankAccounts);
	}
}
