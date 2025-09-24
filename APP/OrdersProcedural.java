import java.util.Scanner;

public class OrdersProcedural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of orders placed today: ");
        int n = input.nextInt();

        double[] orderPrices = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for order " + (i + 1) + ": ₹");
            orderPrices[i] = input.nextDouble();
            total += orderPrices[i];
        }

        System.out.println("\nTotal price of all orders placed today: ₹" + total);
        input.close();
    }
}
