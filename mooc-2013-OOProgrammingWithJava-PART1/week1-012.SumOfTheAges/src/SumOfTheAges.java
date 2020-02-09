
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        System.out.print("Type your age: ");    
        int firstNameAge = Integer.parseInt(reader.nextLine());
        System.out.print("Type your name: ");
        String secondName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondNameAge = Integer.parseInt(reader.nextLine());
        int result = firstNameAge + secondNameAge;
        System.out.print(firstName + " and " + secondName + " are " + result + " years old in total.");
               






        // Implement your program here
    }
}
