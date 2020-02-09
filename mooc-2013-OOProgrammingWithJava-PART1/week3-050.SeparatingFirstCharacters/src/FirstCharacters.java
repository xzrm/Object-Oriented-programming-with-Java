
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int counter = 1;
        while (name.length() > 2 && counter <= 3) {

            System.out.println(counter + ". character: " + name.charAt(counter - 1));
            counter ++;
        } 
        }
    }
