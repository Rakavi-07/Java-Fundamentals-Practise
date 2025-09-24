public class LibraryItem {
    String title;
    String author;
    int id;
    boolean isIssued;

    LibraryItem(String t, String a, int i) {
        this.title = t;
        this.author = a;
        this.id = i;
        this.isIssued = false;
    }

    void issue() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " issued successfully.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    void returnItem(int daysLate) {
        if (isIssued) {
            isIssued = false;
            double lateFee = calculateLateFee(daysLate);
            System.out.println(title + " returned successfully.");
            if (daysLate > 0) {
                System.out.println("Late by " + daysLate + " days. Fee: $" + lateFee);
            } else {
                System.out.println("Returned on time. No late fee.");
            }
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    double calculateLateFee(int daysLate) {
        return daysLate * 1.0;
    }

    void displayInfo() {
        System.out.println(id + " - " + title + " by " + author + (isIssued ? " (Issued)" : " (Available)"));
    }
}

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get item details from user
        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        // Create item
        LibraryItem item = new LibraryItem(title, author, id);

        // Menu
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display Info");
            System.out.println("2. Issue Item");
            System.out.println("3. Return Item");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    item.displayInfo();
                    break;
                case 2:
                    item.issue();
                    break;
                case 3:
                    System.out.print("Enter days late (0 if on time): ");
                    int daysLate = sc.nextInt();
                    item.returnItem(daysLate);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
