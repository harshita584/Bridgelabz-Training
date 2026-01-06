package ewalletapplication;

public class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2% tax

    public BusinessWallet() {
        super();
    }

    public BusinessWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid transfer amount");
            return;
        }

        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (!hasSufficientBalance(totalDeduction)) {
            System.out.println("Insufficient balance after tax");
            return;
        }

        debit(totalDeduction, "Business transfer (tax included)");
        receiver.getWallet().receive(amount, "Received from business wallet");
    }
}