
import java.util.*;

public class Jumper implements Comparable<Jumper>{

    private String name;
    private int length;
    private int[] scores;
    private ArrayList<Integer> lengths;
    private ArrayList<Integer> totalPoints;

    public Jumper(String name) {
        this.name = name;
        this.length = 0;
        this.scores = new int[]{0, 0, 0, 0, 0};
        this.lengths = new ArrayList<Integer>();
        this.totalPoints = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void addLengthToArray() {
        this.lengths.add(this.length);
    }

    public int getPointsPerRound() {
        int sum = sumMiddleScores();
        return this.getLength() + sum;
    }
    
    public void addPointsToTotal(){
        this.totalPoints.add(getPointsPerRound());
    }
    
    public int getTotalPoints(){
        int sum = 0;
        for(int i: this.totalPoints){
            sum += i;
        }return sum;
    }
   

    public void setScores(int score, int index) {
        this.scores[index] = score;
    }

    public int[] getScores() {
        return this.scores;
    }

    public int getLength() {
        return this.length;
    }

    public String toString() {
        return "  " + this.name + "\n"
                + "    length: " + this.length + "\n"
                + "    judge votes: " + Arrays.toString(scores);
    }

    public int sumScores(int[] arr){
        int sum = 0;
        for(int i=0; i < this.scores.length; i++){
            sum = sum + this.scores[i];
        }
        return sum;
    }

    public int sumMiddleScores() {
        int sum = this.sumScores(this.scores)
                - getMax(this.scores) - getMin(this.scores);
        return sum;
    }
    
    public String LengthsToString(){
        String s = "";
        for(int i=0; i <this.lengths.size(); i++){
           s = s +  String.valueOf(this.lengths.get(i)) + " m";
           if (i < lengths.size()-1){
           s = s + ", ";
           }
        }
        return s;
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;

    }

    public int compareTo(Jumper jumper) {
//        int a = this.getTotalPoints() - jumper.getTotalPoints();
//        System.out.println("Value is " + a);
        if (this.getTotalPoints() == jumper.getTotalPoints()) {
            return this.getTotalPoints() - jumper.getTotalPoints();
        } else {
            return this.getTotalPoints() - jumper.getTotalPoints();
        }
    }
}
