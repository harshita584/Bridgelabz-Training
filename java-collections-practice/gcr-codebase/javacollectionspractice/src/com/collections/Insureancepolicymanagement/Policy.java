package com.collections.Insureancepolicymanagement;

import java.time.LocalDate;

public class Policy {
	int policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String policyType;

    public Policy(int policyNumber, String policyHolderName, LocalDate expiryDate, String policyType) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.policyType = policyType;
    }

    public String toString() {
        return policyNumber + " " + policyHolderName + " " + expiryDate + " " + policyType;
    }
}
