package constructors.levelone;

//Subclass
class SavingsAccount extends BankAccount {

 SavingsAccount(int accountNumber, String accountHolder, double balance) {
     super(accountNumber, accountHolder, balance);
 }

 void display() {
     System.out.println("Account Number: " + accountNumber);   // public
     System.out.println("Account Holder: " + accountHolder);   // protected
     System.out.println("Balance: " + getBalance());           // private via method
 }

 public static void main(String[] args) {

     SavingsAccount sa = new SavingsAccount(1001, "Ravi", 5000);

     sa.display();

     // Modify balance
     sa.setBalance(7500);
     System.out.println("Updated Balance: " + sa.getBalance());
 }
}