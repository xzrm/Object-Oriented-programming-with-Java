
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        String name = "";
        String number = "";

        while (true) {
            System.out.println("name: ");
            name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("studentnumber: ");
            number = reader.nextLine();
            students.add(new Student(name, number));
        }

        for (Student student : students) {
            System.out.println(student);
        }
        
        System.out.println("Give search term: ");
        String term = reader.nextLine();
        for (Student student: students){
            if (student.getName().contains(term)){
                System.out.println("Result: ");
                System.out.println(student);
            }
            
        }
        
        
    }
}
