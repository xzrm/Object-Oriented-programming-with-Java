
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Bird birds = new Bird();

        UI ui = new UI(reader, birds);
        ui.start();

    }

}
