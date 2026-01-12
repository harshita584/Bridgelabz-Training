package budgetwise;

import java.time.LocalDate;

class Transaction {
    private double amount;
    private String type;
    private String category;
    private LocalDate date;

    public Transaction(double amount, String type, String category) {
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.date = LocalDate.now();
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }
}
