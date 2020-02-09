// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.util.*;

public class Application {

    public static void main(String[] args) {
//        Book objectBook = new Book("Object book", 2000);
//        System.out.println(objectBook);
//
//        Book anotherObjectBook = objectBook;
//        System.out.println(anotherObjectBook);
//        System.out.println(objectBook.equals(anotherObjectBook));
//
//        Book objectBook2 = new Book("Object book", 2000);
//        System.out.println(objectBook2);
//        System.out.println(objectBook.equals(objectBook2));
//
//        System.out.println(objectBook.getClass());
//        ArrayList<Book> books = new ArrayList<Book>();
//        Book objectBook = new Book("Objectbook", 2000);
//        books.add(objectBook);
//
//        if (books.contains(objectBook)) {
//            System.out.println("The object book was found.");
//        }
//        
        NumberList joelList = new NumberList();
        for (int i = 0; i < 10; i++) {
            joelList.add(new SMS("matti", "have you already written the tests?"));
        }

        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");
        System.out.println("Let's delegate some reading to Mikael");

        NumberList mikaelList = new NumberList();
        mikaelList.add(joelList);
        System.out.println("mikael has " + mikaelList.howManyReadables() + " messages to read");
        mikaelList.read();

        System.out.println();
        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");
    }
}
