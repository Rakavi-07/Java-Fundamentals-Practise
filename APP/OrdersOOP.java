import java.util.Scanner;

class Orderitem {
    double price;

    Orderitem(double priceValue) {
        price = priceValue; 
    }
}

public class OrdersOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of orders placed today: ");
        int n = input.nextInt();

        Orderitem[] orders = new Orderitem[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for order " + (i + 1) + ": ₹");
            double priceVal = input.nextDouble();
            orders[i] = new Orderitem(priceVal);
            total += orders[i].price;
        }

        System.out.println("\nTotal price of all orders placed today: ₹" + total);
        input.close();
    }
}
