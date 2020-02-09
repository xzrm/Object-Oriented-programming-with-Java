
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        int number = Integer.parseInt(reader.nextLine());
        int counter = 0;
        while (counter <number){
            counter ++;
            System.out.println(counter);
        }
        // Write your code here
        
    }
}
