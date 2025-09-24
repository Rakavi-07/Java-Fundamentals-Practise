import java.util.Scanner;

class Account {
    double balance;

    
    Account(double bal) {
        balance = bal; 
    }
}

public class BankingOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = input.nextInt();

        Account[] accounts = new Account[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter balance for account " + (i + 1) + ": ");
            double bal = input.nextDouble();
            accounts[i] = new Account(bal);
            total += accounts[i].balance;
        }

        System.out.println("\nTotal balance in all savings accounts: " + total);
        input.close();
    }
}
