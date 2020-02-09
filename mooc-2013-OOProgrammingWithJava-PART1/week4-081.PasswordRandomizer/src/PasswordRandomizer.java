import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int length;
    private String password;

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
        this.password = "";
    }

    public String createPassword() {
        // write code that returns a randomized password
        this.password = "";
        int i = 0;
        String letters = "abcdefghijklmnopqrstuvwxyz";
        
        while (i<this.length){
            int number = random.nextInt(letters.length());
            char symbol = letters.charAt(number);
            this.password += symbol;
            i ++;
        }
        return this.password;
    }
}
