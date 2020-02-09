
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String reverse = "";
        int counter = 1;
        while (counter <= text.length()) {
            reverse = reverse + text.charAt(text.length()-counter);
            counter++;
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
