import java.util.Scanner;

public class IncrementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Original value: " + num);

        // Post-increment: value used first, then incremented
        System.out.println("Post-increment (num++): " + (num++));
        System.out.println("Value after post-increment: " + num);

        // Resetting num (optional, to show both clearly)
        System.out.print("Enter a number again to test pre-increment: ");
        num = sc.nextInt();

        // Pre-increment: value incremented first, then used
        System.out.println("Pre-increment (++num): " + (++num));
        System.out.println("Value after pre-increment: " + num);

        sc.close();
    }
}

