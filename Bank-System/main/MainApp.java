package main;

import model.*;
import service.BankService;
import util.Validator;

public class MainApp {
    public static void main(String[] args) {
        BankService bank = new BankService();

        Account s1 = new SavingsAccount(101, "Aadhi", 1000);
        Account c1 = new CurrentAccount(102, "Ravi", 2000);
        bank.addAccount(s1);
        bank.addAccount(c1);
        try {
            Validator.validateAmount(500);
            s1.deposit(500);

            s1.withdraw(300);
            c1.withdraw(2500);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        bank.displayAllAccounts();
    }
}
