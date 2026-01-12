package budgetwise;

import java.util.*;

class Budget {
    protected double income;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, Map<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    protected double totalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    public double netSavings() {
        return income - totalExpenses();
    }
}
