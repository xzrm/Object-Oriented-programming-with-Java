
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4};
//        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder str = new StringBuilder();
        int counter = 0;
        str.append("{\n");
        for (int i : t) {

            if (counter > 0) {
                str.append(", " + Integer.toString(i));
            } else {
                str.append(" " + Integer.toString(i));
            }
            counter += 1;
            if (t.length < 5) {
                if (counter % 4 == 0) {
                    str.append("\n");
                    counter = 0;
                }
            } else {
                if(counter % 4 == 0){
                str.append(",\n");
                counter = 0;
            }

        }

    }
    if (counter

    
        % 4 != 0) {
            str.append("\n}");
    }

    
        else {
            str.append("}");
    }

    return str.toString ();
}
}
