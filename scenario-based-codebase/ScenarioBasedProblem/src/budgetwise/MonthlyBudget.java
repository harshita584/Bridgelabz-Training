package budgetwise;

import java.util.*;

class MonthlyBudget extends Budget implements IAnalyzable {

    public MonthlyBudget(double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
    }

    public void generateReport() {
        System.out.println("Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Savings: " + netSavings());
    }

    public void detectOverspend() {
        Map<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                spent.put(
                    t.getCategory(),
                    spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
                );
            }
        }

        for (String category : spent.keySet()) {
            if (spent.get(category) > categoryLimits.getOrDefault(category, 0.0)) {
                System.out.println("Overspent in category: " + category);
            }
        }
    }
}
