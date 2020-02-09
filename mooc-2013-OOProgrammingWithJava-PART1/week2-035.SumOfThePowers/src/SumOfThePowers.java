
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int result = 0;
        int sum = 0;
        while (number >= 0){
            result = (int)Math.pow(2, number);
            sum += result;
            number -= 1;
            
        
        }
        System.out.println("The result is: " + sum);
    }
}
