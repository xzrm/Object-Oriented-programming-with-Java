
public class Main {

    public static void main(String[] args) {
//        Person pekka = new Person("Pekka", 15, 2, 1993);
//        Person steve = new Person("Thomas", 1, 3, 1955);
//
//        System.out.println(steve.getName() + " age " + steve.age() + " years");
//        System.out.println(pekka.getName() + " age " + pekka.age() + " years");

        Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println( pekka );
        System.out.println( steve );
    }
}

