package model;

import util.BankException;

public class CurrentAccount extends Account {
    private double overdraftLimit = 1000;

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            throw new BankException("Overdraft limit exceeded");
        }
        balance -= amount;
    }
}
