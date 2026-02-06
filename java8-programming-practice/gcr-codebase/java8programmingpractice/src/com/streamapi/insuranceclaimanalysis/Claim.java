package com.streamapi.insuranceclaimanalysis;

public class Claim {
    String type;
    double amount;

    public Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}
