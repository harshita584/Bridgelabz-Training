package hospitalmanangementsystem;

public class Bill implements Payable {
    private double baseAmount;
    private double taxRate;
    private double discount;

    public Bill(double baseAmount) {
        this.baseAmount = baseAmount;
        this.taxRate = 0.05;   // 5% tax
        this.discount = 0.10; // 10% discount
    }

    @Override
    public double calculatePayment() {
        double tax = baseAmount * taxRate;
        double discountAmount = baseAmount * discount;
        return baseAmount + tax - discountAmount;
    }
}