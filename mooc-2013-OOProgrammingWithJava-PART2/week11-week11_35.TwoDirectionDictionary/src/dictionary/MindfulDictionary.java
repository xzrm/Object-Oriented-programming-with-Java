/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MindfulDictionary {

    private HashMap<String, String> dict;
    private String file;

    public MindfulDictionary() {
        this.dict = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        this.file = file;
        this.dict = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        if (!dict.containsKey(word)) {
            dict.put(word, translation);
        }
    }

    public String translate(String word) {
        for (String s : dict.keySet()) {
            if (word.equals(s)) {
                return dict.get(s);
            }
            if (word.equals(dict.get(s))) {
                return s;
            }
        }
        return null;
    }

    public void remove(String word) {
        ArrayList<String> tempList = new ArrayList<String>();
        for (String s : dict.keySet()) {
            if (word.equals(s) || word.equals(dict.get(s))) {
                tempList.add(s);
            }
        }
        for (String s : tempList) {
            dict.remove(s);
        }

    }

    public boolean load() {
        try {
            File fileToRead = new File(file);
            Scanner reader = new Scanner(fileToRead);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            reader.close();
            return true;
        } catch (Exception FileNotFoundException) {
            return false;
        }

    }

    public boolean save() {
        List<String> alreadyInFile = new ArrayList<String>();
        try {
            FileWriter writer = new FileWriter(file);
            for (String s : dict.keySet()) {
                String translation = dict.get(s);
                if (!alreadyInFile.contains(s)) {
                    String new_s = s + ":" + dict.get(s) + "\n";
                    writer.write(new_s);
                    alreadyInFile.add(translation);
                }
            }
            writer.close();
            return true;
        } catch (Exception IOException) {
            return false;
        }
    }

}
