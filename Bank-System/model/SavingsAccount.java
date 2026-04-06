package model;

import util.BankException;

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            throw new BankException("Minimum balance required: 500");
        }
        balance -= amount;
    }

    public void addInterest() {
        balance += balance * 0.04;
    }
}
