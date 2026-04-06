package util;

public class Validator {
    public static void validateAmount(double amount) {
        if (amount <= 0) {
            throw new BankException("Amount must be positive");
        }
    }
}
