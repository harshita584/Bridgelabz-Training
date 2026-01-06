package mybank;

public class CurrentAccount extends Account {

	
	public CurrentAccount(String accountNumber, double openingBalance) {
		super(accountNumber, openingBalance);
	}

	@Override
	protected double calculateInterest() {
		// Current accounts do not earn interest
		return 0;
	}

}