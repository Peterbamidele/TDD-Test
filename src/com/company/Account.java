 package com.company;

public class Account {
    //public static Object testAccount;
    private String accountName;
    private double balance;
    private int pin;

    public Account(String accountName, int pin) {
        this.accountName = accountName;
        this.pin = pin;
        this.balance = 0.0;
    }

    public void setName(String newAccountName) {
        this.accountName = newAccountName;

    }

    public String getName() {
        return accountName;
    }


    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Insufficient Balance");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public void changePin(int newPin, int oldPin) {
        if (pin == oldPin) {
            pin = newPin;
        }
        else {
            System.out.printf("Wrong PassWord");
        }
    }
}


