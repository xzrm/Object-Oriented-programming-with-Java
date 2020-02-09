
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int counter = 0;
        double average = 0;
        int counterOdd = 0;
        int counterEven = 0;

        while (number != -1) {
//            System.out.println(number);
            counter += 1;
            sum += number;
            average = (double)sum / counter;
            if (number % 2 == 0){
                counterEven++;
            } else {
                counterOdd++;
            }
            number = Integer.parseInt(reader.nextLine());

        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + counterEven);
        System.out.println("Odd numbers: " + counterOdd);
    }
}
