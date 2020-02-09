
import java.util.*;

public class UI {

    private Scanner reader;
    private Grade grades;

    public UI(Scanner reader, Grade grades) {
        this.reader = reader;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = Integer.parseInt(reader.nextLine());
            if (score == -1) {
                break;
            } else {
                int newGrade = grades.classifyGrade(score);
                grades.addGrade(newGrade);
            }

        }
        System.out.println("Grade distribution: ");
        grades.printGrades();
    }
        
}
