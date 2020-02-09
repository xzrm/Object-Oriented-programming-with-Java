
import java.util.*;

public class Tournament {

    ArrayList<Jumper> jumpers;
    Random randomNumber = new Random();

    public Tournament() {
        this.jumpers = new ArrayList<Jumper>();
    }

    public void addJumper(Jumper jumper) {
        this.jumpers.add(jumper);
    }

    public int getRandNumber(int min, int max) {
        int randomNum = randomNumber.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public void generateLength() {
        for (Jumper jumper : this.jumpers) {
            int randomLength = getRandNumber(60, 120);
            jumper.setLength(randomLength);
            jumper.addLengthToArray();
        }
    }

    public void generateScores() {
        for (Jumper jumper : this.jumpers) {
            for (int i = 0; i < jumper.getScores().length; i++) {
                int randomScore = getRandNumber(10, 20);
                jumper.setScores(randomScore, i);
            }
        }
    }

    public void sort() {
        Collections.sort(this.jumpers);
    }

    public void reverse() {
        Collections.reverse(this.jumpers);
    }

    public void AuxFunc() {
        for (Jumper jumper : this.jumpers) {
            jumper.addPointsToTotal();
        }
    }

    public void printJumpersSums() {
        int counter = 1;
        for (Jumper jumper : this.jumpers) {
            System.out.println("  " + counter + ". " + jumper.getName() + " (" + jumper.getTotalPoints() + " points)");
            counter++;
        }
    }

    public void printJumpersRound() {
        for (Jumper jumper : this.jumpers) {
            System.out.println(jumper);
        }
    }

    public void printSummary() {
        int counter = 1;
        for (Jumper jumper : this.jumpers) {
            System.out.println(counter + "           " + jumper.getName() + " (" + jumper.getTotalPoints() + " points)");
            System.out.println("            jump lengths: " + jumper.LengthsToString());
            counter++;
        }
    }
//
}
