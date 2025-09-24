import java.util.Scanner;

// Product class
class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

// ShoppingCart class
class ShoppingCart {
    Product[] items = new Product[10]; // max 10 items
    int[] quantities = new int[10];    // quantity for each product
    int count = 0;

    void addItem(Product p, int qty) {
        if (qty > p.stock) {
            System.out.println("Not enough stock!");
            return;
        }
        items[count] = p;
        quantities[count] = qty;
        count++;
        p.stock -= qty; // reduce stock
        System.out.println(qty + " " + p.name + " added to cart");
    }

    void removeItem(Product p) {
        for (int i = 0; i < count; i++) {
            if (items[i] == p) {
                p.stock += quantities[i]; // return stock
                for (int j = i; j < count - 1; j++) { // shift items
                    items[j] = items[j + 1];
                    quantities[j] = quantities[j + 1];
                }
                count--;
                System.out.println(p.name + " removed from cart");
                return;
            }
        }
        System.out.println(p.name + " not found in cart");
    }

    void displayCart() {
        if (count == 0) {
            System.out.println("Cart is empty");
            return;
        }
        double total = 0;
        System.out.println("Items in Cart:");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].name + " x " + quantities[i] + " = $" + (items[i].price * quantities[i]));
            total += items[i].price * quantities[i];
        }
        System.out.println("Total: $" + total);
    }
}

// User class
class User {
    String name;
    ShoppingCart cart;

    User(String name) {
        this.name = name;
        cart = new ShoppingCart(); // composition
    }
}

// Main class
public class Display1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Products
        Product p1 = new Product("Laptop", 800, 5);
        Product p2 = new Product("Headphones", 50, 10);
        Product p3 = new Product("Mouse", 25, 15);

        User user = new User("Alice");

        while (true) {
            System.out.println("\n1. View Cart  2. Add Item  3. Remove Item  4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                user.cart.displayCart();
            } else if (choice == 2) {
                System.out.println("Select product: 1-Laptop  2-Headphones  3-Mouse");
                int prod = sc.nextInt();
                System.out.print("Quantity: ");
                int qty = sc.nextInt();

                if (prod == 1) user.cart.addItem(p1, qty);
                else if (prod == 2) user.cart.addItem(p2, qty);
                else if (prod == 3) user.cart.addItem(p3, qty);
                else System.out.println("Invalid product");

            } else if (choice == 3) {
                System.out.println("Select product to remove: 1-Laptop  2-Headphones  3-Mouse");
                int prod = sc.nextInt();

                if (prod == 1) user.cart.removeItem(p1);
                else if (prod == 2) user.cart.removeItem(p2);
                else if (prod == 3) user.cart.removeItem(p3);
                else System.out.println("Invalid product");

            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
