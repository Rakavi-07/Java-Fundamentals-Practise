import java.util.Scanner;

public class WordPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        
        for (String word : sentence.split(" ")) {
            System.out.println(word);
        }

        sc.close();
    }
}

