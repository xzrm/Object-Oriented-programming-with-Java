import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        String reverse = "";
        int counter = 1;
        while (counter <= name.length()) {
            reverse = reverse + name.charAt(name.length()-counter);
            counter++;
        }
        System.out.println("In reverse order: " + reverse);
    }
}
