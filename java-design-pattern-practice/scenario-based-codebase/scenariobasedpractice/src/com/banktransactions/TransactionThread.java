package com.banktransactions;

public class TransactionThread extends Thread {
    private Bank bank;
    private int i;

    public TransactionThread(Bank bank, int i, String threadName) {
        this.bank = bank;
        this.i = i;
        setName(threadName);
    }

    public void run() {
        bank.deposit(i, 500);
        bank.withdraw(i, 300);
        bank.withdraw(i, 800);
        bank.deposit(i, 200);
    }
}

