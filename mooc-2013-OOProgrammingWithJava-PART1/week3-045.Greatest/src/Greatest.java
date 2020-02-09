
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int great = Math.max(number1, number2);
        int greatest = Math.max(great, number3);
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
