
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int anotherNumber = Integer.parseInt(reader.nextLine());
        int result = Math.max(number, anotherNumber);
        System.out.print("The bigger number of the two numbers given was: " + result);
                

        // Implement your program here. Remember to ask the input from user
    }
}
