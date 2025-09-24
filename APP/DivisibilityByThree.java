import java.util.Scanner;

public class DivisibilityByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter any integer: ");
        int number = input.nextInt(); // Read user input

        // Check divisibility by 3 using modulus operator
        if (number % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        } else {
            System.out.println("The number is NOT divisible by 3.");
        }

        input.close(); // Close Scanner
    }
}
