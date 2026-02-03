package com.functionalinterfaces.digitalpaymentsystem;

public class CreditCard implements PaymentMethod{
	public void pay() {
		System.out.println("Paying via credit card");
	}
}
