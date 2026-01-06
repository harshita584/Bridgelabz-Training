package bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable{

	public SavingsAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyForLoan() {
		if(getBalance() < 20000)
		{
			System.out.println("Minimum balance not maintained. Loan denied!");
			return;
			
		}
		System.out.println("Loan approved for: " + calculateLoanEligibility());	
	}

	public double calculateLoanEligibility() {
		double balance = getBalance();
		return balance*4;
	}

	@Override
	double calculateInterest() {
		return getBalance()*0.04;
	}

}
