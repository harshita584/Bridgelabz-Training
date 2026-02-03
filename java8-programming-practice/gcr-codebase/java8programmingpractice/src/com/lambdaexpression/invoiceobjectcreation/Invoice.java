package com.lambdaexpression.invoiceobjectcreation;

public class Invoice {
	String transactionId;
	public Invoice(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId() {
		return transactionId;
	}
}
