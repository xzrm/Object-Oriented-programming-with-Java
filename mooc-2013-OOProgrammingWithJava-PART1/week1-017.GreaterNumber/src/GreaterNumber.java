
import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Print the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Print the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        if (firstNumber > secondNumber) {
            System.out.print("Greater number: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.print("Greater number: " + secondNumber);
        } else {

            System.out.print("The numbers are equal");
        }
    }
}
