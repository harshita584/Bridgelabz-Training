package mybank;

public class SavingsAccount extends Account {
	private double interestRate;


	public SavingsAccount(String accountNumber, double openingBalance, double interestRate) {
		super(accountNumber, openingBalance);
		this.interestRate = interestRate;
	}

	@Override
	protected double calculateInterest() {
		return checkBalance() * interestRate / 100;
	}

}