package artify;

public class User {

    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public boolean deductBalance(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount; // operator usage
            return true;
        }
        return false;
    }
}

