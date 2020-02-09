
import java.util.*;

public class UI {

    private Scanner reader;
    private Tournament tournament;

    public UI(Scanner reader, Tournament tournament) {
        this.reader = reader;
        this.tournament = tournament;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            } else {
                this.createJumper(name);
            }
        }
        System.out.println("");
        System.out.println("The tournament begins!");

        int round = 0;
        while (true) {
            System.out.println("");
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            System.out.println("");

            if (command.equals("jump")) {
                round++;
                System.out.println("Round " + round + "\n");
                this.getOrder();
                System.out.println("Results of round " + round);
                this.getRound();
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Thanks!\n");
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        this.getSummary();

    }

    public void createJumper(String name) {
        tournament.addJumper(new Jumper(name));
    }

    public void getOrder() {
        System.out.println("Jumping order: ");

        tournament.sort();
        tournament.printJumpersSums();
        System.out.println("");

    }

    public void getRound() {
        tournament.generateLength();
        tournament.generateScores();
        tournament.printJumpersRound();
        tournament.AuxFunc();

    }

    public void getSummary() {
        tournament.sort();
        tournament.reverse();
        tournament.printSummary();
    }

}
