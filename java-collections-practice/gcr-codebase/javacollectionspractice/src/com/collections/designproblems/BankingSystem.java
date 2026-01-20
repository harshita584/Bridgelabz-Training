package com.collections.designproblems;

import java.util.*;

public class BankingSystem {
    private Map<Integer, Integer> accounts = new HashMap<>();
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    public void addAccount(int accountNumber, int balance) {
        accounts.put(accountNumber, balance);
    }

    public void requestWithdrawal(int accountNumber, int amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    public void processWithdrawals() {
        System.out.println("Processing Withdrawals : ");
        
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();

            int account = request.accountNumber;
            int amount = request.amount;

            if (!accounts.containsKey(account)) {
                System.out.println(account + " not found");
                continue;
            }

            int balance = accounts.get(account);

            if (balance >= amount) {
                accounts.put(account, balance - amount);
                System.out.println("Withdrawal successful " + " Amount: " + amount);
            } 
            else System.out.println("Insufficient balance");
        }
    }

    public void displaySortedByBalance() {
        System.out.println("Customers Sorted by Balance:");

        TreeMap<Integer, List<Integer>> sortedMap = new TreeMap<>();

        for (int accountNo : accounts.keySet()) {
        	int balance = accounts.get(accountNo);
        	
            if(!sortedMap.containsKey(balance)) sortedMap.put(balance, new ArrayList<>());
            sortedMap.get(balance).add(accountNo);
        }

        System.out.println(sortedMap);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount(101, 5000);
        bank.addAccount(102, 12000);
        bank.addAccount(103, 5000);
        bank.addAccount(104, 20000);

        bank.requestWithdrawal(101, 2000);
        bank.requestWithdrawal(102, 15000);
        bank.requestWithdrawal(104, 5000);

        bank.processWithdrawals();
        bank.displaySortedByBalance();
    }
}