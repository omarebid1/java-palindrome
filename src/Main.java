import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci una parola");
        String word = scan.nextLine();

        StringBuilder rev = new StringBuilder(word);

        rev.reverse();

        String revWord = rev.toString();

        if (word.equals(revWord)){
            System.out.println("è una parola palindrome");

        }

        else {
            System.out.println("non è una parola palindrome");
        }
    }
}
