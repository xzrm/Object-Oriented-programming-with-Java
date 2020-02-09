
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Tournament t = new Tournament();

        UI userInterface = new UI(reader, t);
        
        userInterface.start();
//        Jumper Maciej = new Jumper("Maciej");
//        Jumper Noon = new Jumper("Noon");
//
//        t.addJumper(Maciej);
//        t.addJumper(Noon);
//
//        t.generateLength();
//        t.generateScores();
//
//        Maciej.addPointsToTotal();
//        Noon.addPointsToTotal();
//
//        t.printJumpersSums();
//        t.sort();
//        t.printJumpersSums();
//        System.out.println("");
//        t.generateLength();
//        t.generateScores();
//
//        Maciej.addPointsToTotal();
//        Noon.addPointsToTotal();
//
//        t.printJumpersSums();
//        t.sort();
//        t.printJumpersSums();
//        System.out.println("");
//        t.generateLength();
//        t.generateScores();
//
//        Maciej.addPointsToTotal();
//        Noon.addPointsToTotal();
//
//        t.printJumpersSums();
//        t.sort();
//        t.printJumpersSums();
    }
}
