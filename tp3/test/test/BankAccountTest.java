package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(10);
    }

    @Test
    public void testGetAccountNum() {
        assertEquals(10, account.getAccountNum());
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDeposit() {
        assertTrue(account.deposit(100));
        assertEquals(100, account.getBalance());
        assertEquals(100, account.getLastTransAmount());
    }

    @Test
    public void testWithdraw() {
        account.deposit(200);
        assertTrue(account.withdraw(100));
        assertEquals(100, account.getBalance());
        assertEquals(-100, account.getLastTransAmount());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        assertFalse(account.withdraw(100));
        assertEquals(0, account.getBalance());
        assertEquals(0, account.getLastTransAmount());
    }

    @Test
    public void testDepositNegativeAmount() {
        assertFalse(account.deposit(-100));
        assertEquals(0, account.getBalance());
        assertEquals(0, account.getLastTransAmount());
    }

    @Test
    public void testWithdrawNegativeAmount() {
        account.deposit(200);
        assertFalse(account.withdraw(-100));
        assertEquals(200, account.getBalance());
        assertEquals(200, account.getLastTransAmount());
    }

    @Test
    public void testiinngg() {
        assertEquals("Account 10 (balance $0)", account.toString());
    }

}
