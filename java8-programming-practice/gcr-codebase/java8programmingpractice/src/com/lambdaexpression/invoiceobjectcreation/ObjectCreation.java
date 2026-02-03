package com.lambdaexpression.invoiceobjectcreation;

import java.util.List;

public class ObjectCreation {
	public static void main(String[] args) {
		List<String> transactionIds = List.of("Tran1", "Tran2", "Tran3", "Tran4", "Tran5");
		
		List<Invoice> inovices = transactionIds.stream().map(Invoice::new).toList();
		inovices.stream().map(Invoice::getTransactionId).forEach(System.out::println);
	}
}
