
import java.util.*;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dict) {
        this.reader = reader;
        this.dict = dict;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("    quit - quit the text user interface");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quits the text user interface");
        
        while (true) {
            System.out.println("");
            System.out.print("Statement: ");
            String command = reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if (command.equals("add")) {
                this.add();
            }
            else if(command.equals("translate")){
                this.translate();
            }
            else{
                System.out.println("Unknown statement");
            }
        }   
        System.out.println("");
        
    }

    public void add() {
        System.out.print("In Finish: ");
        String wordFinish = reader.nextLine();
        System.out.print("Translation: ");
        String transl = reader.nextLine();
        dict.add(wordFinish, transl);
    }
    
        public void translate() {
        System.out.print("Give a word: ");
        String givenWord = reader.nextLine();
        System.out.print("Translation: ");
        String translWord = dict.translate(givenWord);
        System.out.println(translWord);
    }

}
