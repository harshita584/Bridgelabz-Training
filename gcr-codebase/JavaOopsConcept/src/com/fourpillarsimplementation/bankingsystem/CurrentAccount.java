package com.fourpillarsimplementation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

	public CurrentAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	public void applyForLoan() {
		if(getBalance() < 20000)
		{
			System.out.println("Minimum balance not maintained. Loan denied!");
			return;
			
		}
		System.out.println("Loan approved for: " + calculateLoanEligibility());	
	}

	@Override
	public double calculateLoanEligibility() {
		double balance = getBalance();
		return balance*2;
	}

	@Override
	double calculateInterest() {
		return 0.0;
	}

}
