package mybank;

public interface ITransaction {
	void deposit(double amount);
	void withdraw(double amount);
	double checkBalance();
}