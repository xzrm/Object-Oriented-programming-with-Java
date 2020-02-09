
import java.util.*;
import java.io.*;

public class Printer {

    private Scanner reader;
    private File file;

    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
//        this.reader = new Scanner(this.file);
    }

    public void printLinesWhichContain(String word) throws Exception {
        this.reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word) || word.equals("")) {
                System.out.println(line);
            }
        }
    }
}
//import java.io.File;

//import java.io.FileNotFoundException;
//

//import java.util.Scanner;
//
//public class Analysis {
//
//    private File file;
//
//    public Analysis(File file) {
//
//        this.file = file;
//
//    }
//
//    public int lines() {
//
//        String content = readFile();
//
//        return content.split("\n").length;
//    }
//
//    public int characters() {
//
//        String content = readFile();
//
//        return content.length();
//    }
//
//    private String readFile() {
//
//        try {
//
//            String str = "";
//
//            Scanner reader = new Scanner(file);
//
//            while (reader.hasNextLine()) {
//
//                str += reader.nextLine();
//
//                str += "\n";
//
//            }
//
//            return str;
//
//        } catch (FileNotFoundException ex) {
//
//            return "";
//
//        }
//
//    }
//
//}
