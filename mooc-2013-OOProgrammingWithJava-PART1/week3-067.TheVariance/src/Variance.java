import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i: list){
            sum += i;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum= sum(list);
        return (double)sum/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double average = average(list);
        double num = 0;
        for (double i: list){
            num += Math.pow(average-i, 2);
                       
        }
        
        
        // write code here
        return num/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
