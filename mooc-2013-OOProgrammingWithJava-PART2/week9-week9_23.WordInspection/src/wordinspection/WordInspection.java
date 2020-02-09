/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.*;
import java.util.*;

public class WordInspection {

    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws Exception {
        Scanner reader = new Scanner(this.file, "UTF-8");
        int counter = 0;
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            counter++;
        }
        System.out.println("No. of words: " + counter);
        return counter;
    }

    public List<String> wordsContainingZ() throws Exception {
        Scanner reader = new Scanner(this.file, "UTF-8");
        ArrayList<String> wordsWithZ = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains("z")) {
                wordsWithZ.add(line);
            }
        }
        return wordsWithZ;

    }

    public List<String> wordsEndingInL() throws Exception {
        Scanner reader = new Scanner(this.file, "UTF-8");
        ArrayList<String> endsWithL = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.endsWith("l")) {
                endsWithL.add(line);
            }
        }
        return endsWithL;

    }

    public List<String> palindromes() throws Exception {
        Scanner reader = new Scanner(this.file, "UTF-8");
        ArrayList<String> palindromes = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (this.isPalindrome(line)) {
                palindromes.add(line);
            }
        }
        return palindromes;

    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        Scanner reader = new Scanner(this.file, "UTF-8");
        ArrayList<String> wordsWithAllVowels = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (this.hasAllVowels(line)) {
                wordsWithAllVowels.add(line);
            }
        }
        return wordsWithAllVowels;

    }

    public boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasAllVowels(String str) {
        String vowels = "aeiouyäö";
        int n = vowels.length();
        for (int i = 0; i < n; i++) {
            if (!str.contains(String.valueOf(vowels.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
