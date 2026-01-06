package ewalletapplication;

import java.time.LocalDateTime;

public class Transaction {
    private String description;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return timestamp + " | " + description + " | ₹" + amount;
    }
}