package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;

    @BeforeEach
    void setUp() {
        account = new Account("peter", 2091);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAccountShouldHaveAccountName() {
        account.setName("TestName");
        assertEquals("TestName", account.getName());
        account.setName("NewTestName");
        assertEquals("NewTestName", account.getName());
    }

    @Test
    void testUserShouldBeAbleToGetBalance() {
        double balance = account.getBalance();
        assertEquals(0.0, balance);
    }

    @Test
    void testAccountObjectShouldBeInitializedWithValue() {
        Account testAccount = new Account("peter", 2091);
        assertEquals("peter", testAccount.getName());
        assertEquals(2091, testAccount.getPin());
        assertEquals(0.0, testAccount.getBalance());
    }

    @Test
    void testWithdrawMethodShouldReduceBalance() {
        account.deposit(250.00);
        account.withdraw(150.00);
        assertEquals(100.00, account.getBalance());
    }

    @Test
    void testDepositMethodShouldIncreaseBalance() {
        account.deposit(250.00);
        assertEquals(250.00, account.getBalance());
    }

    @Test
    void testCannotDepositNegativeAmounts() {
        account.deposit(250.00);
        account.deposit(-150);
    }

    @Test
    void testShouldBeAbleToChangePin() {
        account.changePin(4321,2091);
        assertEquals(4321, account.getPin());
    }
    @Test
    void testWhenUserEnterWrongPin(){
        account.changePin(4321,1111);
        assertEquals(2091,account.getPin());
    }

}