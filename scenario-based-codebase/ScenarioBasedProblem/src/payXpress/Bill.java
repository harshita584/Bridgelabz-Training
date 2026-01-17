package payXpress;

public class Bill {

    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid;   // encapsulation

    // constructor for recurring bills
    public Bill(String type, double amount, String dueDate)
    {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // calculate late fee using operators
    protected double calculateLateFee(double penalty)
    {
        return amount + penalty;
    }

    // controlled payment
    protected void markAsPaid()
    {
        isPaid = true;
    }

    protected boolean getPaymentStatus()
    {
        return isPaid;
    }
}
