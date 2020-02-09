/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraczlam5898
 */
import java.util.*;

public class Dictionary {

    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }

    public String translate(String word) {
        String wordTemp = this.dict.get(word);

        if (wordTemp == null) {
            return null;
        }
        return wordTemp;
    }
    
    public void add(String word, String translation){
        this.dict.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.dict.keySet().size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> listWords = new ArrayList<String>();
        for(String key: this.dict.keySet()){
            String str = key + " = " + this.dict.get(key);
            listWords.add(str);
        }
        return listWords;
    }
}
