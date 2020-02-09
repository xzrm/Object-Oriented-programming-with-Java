
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        System.out.println("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int counter = 1;
        if (guess == numberDrawn) {
            System.out.println("Congratulations, your guess is correct!");
        } else {
            while (guess != numberDrawn) {
                if (guess < numberDrawn) {
                    System.out.println("The number is greater, guess made: " + counter);
                } else {
                    System.out.println("The number is lesser, guess made: " + counter);
                }
                guess = Integer.parseInt(reader.nextLine());
                counter++;
                if (guess == numberDrawn) {
                    System.out.println("Congratulations, your guess is correct!");
                }
            }
        }
    }
    // DO NOT MODIFY THIS!

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
