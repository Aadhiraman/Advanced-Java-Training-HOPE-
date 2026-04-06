package service;

import model.Account;
import java.util.ArrayList;
import java.util.List;

public class BankService {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        for (Account acc : accounts) {
            acc.display();
        }
    }
}
