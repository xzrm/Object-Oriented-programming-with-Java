
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the radius: ");
        double radius = Integer.parseInt(reader.nextLine());
        
        double circum = 2 * radius * Math.PI;
        System.out.print("Circumference of the circle: " + circum);
    }
}
