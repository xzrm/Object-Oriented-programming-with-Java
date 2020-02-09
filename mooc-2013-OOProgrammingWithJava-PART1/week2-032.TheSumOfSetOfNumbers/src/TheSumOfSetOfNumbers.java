
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int endBound = Integer.parseInt(reader.nextLine());
        int reps = 0;
        int sum = 0;
        while (reps < endBound){
            reps += 1;
            sum += reps;
            
        }
        System.out.println(sum);
    }
}
