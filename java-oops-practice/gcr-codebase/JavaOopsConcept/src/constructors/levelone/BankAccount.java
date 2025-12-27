package constructors.levelone;

//BankAccount class
public class BankAccount {

 public int accountNumber;        // public
 protected String accountHolder;  // protected
 private double balance;          // private

 // Constructor
 BankAccount(int accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Setter for balance
 public void setBalance(double balance) {
     this.balance = balance;
 }
}
