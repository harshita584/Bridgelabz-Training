package com.functionalinterfaces.digitalpaymentsystem;

public class DriverClass {
	public static void main(String[] args) {
		Wallet wallet = new Wallet();
		wallet.pay();
		
		UPI upi = new UPI();
		upi.pay();
		
		CreditCard creditCard = new CreditCard();
		creditCard.pay();
	}
}
