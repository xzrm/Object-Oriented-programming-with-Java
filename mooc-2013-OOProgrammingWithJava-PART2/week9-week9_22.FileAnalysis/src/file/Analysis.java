/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.*;
import java.util.*;

/**
 *
 * @author kraczlam5898
 */
public class Analysis {

    private File file;
    private Scanner reader;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception {
        this.reader = new Scanner(file);
        int counter = 0;
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            counter++;
        }
        return counter;
    }

    public int characters() throws Exception {
        this.reader = new Scanner(file);
        int counter = 0;
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            counter += line.length();
        }
        return counter + this.lines();
    }

}
