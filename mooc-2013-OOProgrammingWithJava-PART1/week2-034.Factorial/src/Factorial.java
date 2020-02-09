import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        while (number != 0){
            factorial *= number;
            number -= 1;
        }
        System.out.println(factorial);

    }
}
