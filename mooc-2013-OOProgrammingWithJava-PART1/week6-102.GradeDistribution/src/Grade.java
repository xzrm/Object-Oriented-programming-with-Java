
import java.util.*;

public class Grade {

    private HashMap<Integer, Integer> grades;

    public Grade() {
        this.grades = new HashMap<Integer, Integer>();
    }

    public void addGrade(int grade) {
        if (grade != 99) {
            if (!grades.keySet().contains(grade)) {
                grades.put(grade, 1);
            } else {
                int count = grades.get(grade);
                count++;
                grades.put(grade, count);
            }
        }
    }

    public int classifyGrade(int score) {
        if (score >= 0 && score <= 29) {
            return 0;
        } else if (score > 29 && score <= 34) {
            return 1;
        } else if (score > 34 && score <= 39) {
            return 2;
        } else if (score > 39 && score <= 44) {
            return 3;
        } else if (score > 44 && score <= 49) {
            return 4;
        } else if (score > 49 && score <= 60) {
            return 5;
        } else {
            return 99;
        }
    }
    
    public double acceptance(){
        int passed = 0;
        int total = 0;
        for (int key: grades.keySet()){
            if(key > 0){
                passed = passed + grades.get(key);
            }total = total + grades.get(key) ;
        }
        return (double) passed/total * 100;
    }
    

    public void printGrades() {
        for (int i=5; i >= 0; i--){
            if(!grades.keySet().contains(i)){
                grades.put(i, 0);
            }
            String s = "";
            for (int j = 0; j < grades.get(i); j++){
                s = s + "*";
            }
            System.out.println(i + ": " + s);
        }System.out.println("Acceptance percentage: " + this.acceptance());

    }

}
