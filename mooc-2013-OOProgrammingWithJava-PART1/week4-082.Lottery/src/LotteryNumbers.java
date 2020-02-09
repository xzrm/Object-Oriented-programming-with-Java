import java.util.ArrayList;
import java.util.Random;


public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.random = new Random();    // x7 random numbers between 1 and 39
        this.numbers = new ArrayList<Integer>();

        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // write number drawing here using method containsNumber()
        this.numbers.clear();    // clear arraylist first
        int currentRando = 0;
        int count = 0;

        while (count < 7) {
            currentRando = (this.random.nextInt(39)) + 1;

            if (!this.containsNumber(currentRando)) {
                this.numbers.add(currentRando);
                count++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // test if number is already among the drawn numbers

        if (!this.numbers.contains(number)) {
            //perform this code if arraylist numbers does not contain int number.
            return false;
        } else {
            return true;
        }
    }
}