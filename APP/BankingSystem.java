// Abstract class for Account
abstract class Account {
    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method - must be implemented by subclasses
    abstract void calculateInterest();
}

// Savings Account
class SavingsAccount extends Account {
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04;  // 4% interest
        System.out.println("Savings Account Interest: " + interest);
    }
}

// Current Account
class CurrentAccount extends Account {
    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account Interest: 0 (No interest on current accounts)");
    }
}

// Loan Account
class LoanAccount extends Account {
    LoanAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.10;  // 10% loan interest
        System.out.println("Loan Account Interest: " + interest);
    }
}

// Main class to test
public class BankingSystem {
    public static void main(String[] args) {
        Account s = new SavingsAccount("Alice", 5000);
        Account c = new CurrentAccount("Bob", 10000);
        Account l = new LoanAccount("Charlie", 20000);

        s.calculateInterest();
        c.calculateInterest();
        l.calculateInterest();
    }
}
