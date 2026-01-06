package mybank;

public abstract class  Account implements ITransaction{
	private String accountNumber;
	private double balance;
	
	
	//Constructor 
	public Account(String accountNumber, double openingBalance) {
		this.accountNumber = accountNumber;
		this.balance = openingBalance;
	}
	
	@Override
	public void deposit(double amount) {
		if(amount> 0) {
			balance +=amount;
			System.out.println("Amount deposited Successfully");
		}else {
			System.out.println("Invalid deposit amount.");
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Amount withdrawn successfully.");
		}else {
			System.out.println("Insufficient Balance.");
		}
		
	}

	@Override
	public double checkBalance() {
		return balance;
	}
	protected abstract double calculateInterest();

}