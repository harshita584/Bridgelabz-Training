package ewalletapplication;

import java.util.*;

public abstract class Wallet implements Transferrable {

    private double balance; // fully encapsulated
    private List<Transaction> transactions;

    // Normal wallet
    public Wallet() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    // Wallet with referral bonus
    public Wallet(double referralBonus) {
        this();
        balance += referralBonus;
        transactions.add(new Transaction("Referral Bonus", referralBonus));
    }

    protected boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    protected void debit(double amount, String note) {
        balance -= amount;
        transactions.add(new Transaction(note, -amount));
    }

    // SAFE public method to receive money
    public void receive(double amount, String note) {
        balance += amount;
        transactions.add(new Transaction(note, amount));
    }

    public void loadMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("Wallet Top-Up", amount));
    }

    public double getBalance() {
        return balance;
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}