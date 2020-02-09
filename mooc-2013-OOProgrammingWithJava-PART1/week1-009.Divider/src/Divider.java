
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int anotherNumber = Integer.parseInt(reader.nextLine());
        
        double result = number / (double)anotherNumber;
        System.out.print("Division: " + number + " / " + anotherNumber + " = " + result);
        
        

        // Implement your program here. Remember to ask the input from user.
    }
}
