package ewalletapplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet() {
        super();
    }

    public PersonalWallet(double referralBonus) {
        super(referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount <= 0) {
            System.out.println("Invalid transfer amount");
            return;
        }

        if (!hasSufficientBalance(amount)) {
            System.out.println("Insufficient balance");
            return;
        }

        debit(amount, "Transfer to " + receiver.getName());
        receiver.getWallet().receive(amount, "Received from personal wallet");
    }
}
