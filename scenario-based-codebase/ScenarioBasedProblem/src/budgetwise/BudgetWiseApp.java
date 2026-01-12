package budgetwise;

import java.util.*;

public class BudgetWiseApp {
    public static void main(String[] args) {

        Map<String, Double> limits = new HashMap<>();
        limits.put("Food", 3000.0);
        limits.put("Travel", 2000.0);

        Budget budget = new MonthlyBudget(15000, limits);

        budget.addTransaction(new Transaction(2500, "EXPENSE", "Food"));
        budget.addTransaction(new Transaction(3000, "EXPENSE", "Travel"));

        IAnalyzable analyzer = (IAnalyzable) budget;
        analyzer.generateReport();
        analyzer.detectOverspend();
    }
}


