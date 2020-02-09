
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String str = "";
        int num = 0;
        if (characterString.length() % 2 == 1) {
            str = characterString + " ";
        } else {
            str = characterString;
        }
        num = str.length() + 4;

        for (int i = 0; i < num + 2; i += 2) {
            System.out.print(":)");
        }
        System.out.println("");
        
        System.out.println(":) " + str + " :)");
        for (int i = 0; i < num + 2; i += 2) {
            System.out.print(":)");
        }
        System.out.println("");
    }

}
