package ewalletapplication;

public interface Transferrable {
    void transferTo(User receiver, double amount);
}