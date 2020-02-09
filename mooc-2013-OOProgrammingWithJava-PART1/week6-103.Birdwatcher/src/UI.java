import java.util.*;

public class UI {

    private Scanner reader;
    private Bird birds;

    public UI(Scanner reader, Bird birds) {
        this.reader = reader;
        this.birds = birds;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String userInput = reader.nextLine();
            if (userInput.equals("Add")) {
                this.addFunc();
            } else if (userInput.equals("Observation")) {
                this.observationFunc();
            } else if (userInput.equals("Statistics")) {
                this.statsFunc();
            } else if (userInput.equals("Show")) {
                this.showFunc();
            } else if (userInput.equals("Quit")) {
                break;
            } else {
                System.out.println("unknown input");
            }
        }
    }

    public void addFunc() {
        System.out.print("Name: ");
        String userInput1 = reader.nextLine();
        System.out.print("Latin name: ");
        String userInput2 = reader.nextLine();
        birds.Add(userInput1, userInput2);
    }

    public void observationFunc() {
        System.out.print("What was observed:? ");
        String userInput = reader.nextLine();
        birds.Observation(userInput);
    }
    
    public void statsFunc(){
        birds.Statistics();
    }
    
    public void showFunc(){
        System.out.print("What? ");
        String userInput = reader.nextLine();
        birds.Show(userInput);
    }
}
