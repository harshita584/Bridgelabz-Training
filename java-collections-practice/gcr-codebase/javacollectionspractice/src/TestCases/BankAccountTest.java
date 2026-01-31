package TestCases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.BankAccount;

public class BankAccountTest {
	
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(500.0);
        assertEquals(500.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(500.0);
        account.withdraw(200.0);
        assertEquals(300.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        account.withdraw(200.0);
        assertEquals(100.0, account.getBalance());
    }
}
