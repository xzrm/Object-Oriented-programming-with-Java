
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int curSmallNum = array[0];

        for (int num : array) {
            if (num < curSmallNum) {
                curSmallNum = num;
            }
        }
        return curSmallNum;

    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestNum = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNum) {
                return i;
            }
        }
        return 0;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
//        if(array.length>index){
//            int[] newArray = new int[array.length-index];
//        }
//        for()
        int smallest = array[index];
        int smallestNumIndex = index;
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestNumIndex = i;
            }

        }

        return smallestNumIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int num1 = array[index1];
        int num2 = array[index2];

        array[index1] = num2;
        array[index2] = num1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int ixSmallestNum = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, ixSmallestNum);
            System.out.println(Arrays.toString(array));
        }
    }

}
