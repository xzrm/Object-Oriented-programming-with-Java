
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String stars = "";
        int counter = 0;
        while (counter < amount) {
            stars = stars + "*";
            counter++;
        }
        System.out.println(stars);
    }

    public static void printWhitespaces(int amount) {
        String spaces = "";
        int counter = 0;
        while (counter < amount) {
            spaces = spaces + " ";
            counter++;
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        int counterSpaces = size;
        int counterStars = 0;
        String emptyStr = "";
        while (counterStars < size) {
            counterSpaces--;
            counterStars++;
            printWhitespaces(counterSpaces);
            printStars(counterStars);
        }
    }

    public static void xmasTree(int height) {
        int counterSpaces = height;
        int counterStars = 0;
        String emptyStr = "";
        while (counterStars < height) {
            counterSpaces--;
            counterStars++;
            printWhitespaces(counterSpaces);
            printStars(counterStars+counterStars-1);
        }
        printWhitespaces(height-2);
        printStars(3); 
        printWhitespaces(height-2);
        printStars(3);   
        }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
