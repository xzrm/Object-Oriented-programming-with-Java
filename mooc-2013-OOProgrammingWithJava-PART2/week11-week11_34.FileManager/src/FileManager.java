
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> textToRead = new ArrayList<String>();
        File fileToRead = new File(file);
        Scanner reader = new Scanner(fileToRead);
        while (reader.hasNextLine()){
            String line = reader.nextLine();
            textToRead.add(line);
        }
        reader.close();
        return textToRead;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        for(String s: texts){
            String new_s = s + "\n";
            writer.write(new_s);
        }
        writer.close();
    }
}
