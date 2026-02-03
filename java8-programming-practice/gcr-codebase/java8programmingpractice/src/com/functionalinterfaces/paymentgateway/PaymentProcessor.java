package com.functionalinterfaces.paymentgateway;

public interface PaymentProcessor {
	public default void refund() {
		System.out.println("Refund in progress!");
	}
}
