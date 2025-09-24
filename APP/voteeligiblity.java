import java.util.Scanner;

public class voteeligiblity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // This is correct

        System.out.println("Enter Your Age:");
        int age = input.nextInt(); // Use the object 'input' here

        if (age >= 18) {
            System.out.println("Eligible To Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        input.close(); // Use the object 'input' here as well
    }
}

