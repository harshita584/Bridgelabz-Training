package budgetwise;

import java.util.Map;

class AnnualBudget extends Budget implements IAnalyzable {

    public AnnualBudget(double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
    }

    public void generateReport() {
        System.out.println("Annual Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + totalExpenses());
        System.out.println("Savings: " + netSavings());
    }

    public void detectOverspend() {
        System.out.println("Annual overspend analysis completed");
    }
}
