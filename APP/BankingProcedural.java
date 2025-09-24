import java.util.Scanner;

public class BankingProcedural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of savings accounts: ");
        int n = input.nextInt();

        double[] balances = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter balance for account " + (i + 1) + ": ");
            balances[i] = input.nextDouble();
            total += balances[i];
        }

        System.out.println("\nTotal balance in all savings accounts: " + total);
        input.close();
    }
}
