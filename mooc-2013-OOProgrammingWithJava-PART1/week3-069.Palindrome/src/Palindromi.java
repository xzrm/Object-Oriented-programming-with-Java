
import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        String reverse = "";
        int counter = 1;
        while (counter <= text.length()) {
            reverse = reverse + text.charAt(text.length() - counter);
            counter++;
        }
        return reverse;
    }

    public static boolean palindrome(String text) {
        String rev_text = reverse(text);
        System.out.println(rev_text);
        if (rev_text.equals(text)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
