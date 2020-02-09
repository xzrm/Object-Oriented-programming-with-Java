import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Planes planes = new Planes();
        Flights flights = new Flights();
        
        UI userInterface = new UI(reader, planes, flights);
        userInterface.start();
        
    }
}
