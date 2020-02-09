/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.*;

/**
 *
 * @author kraczlam5898
 */
public class PersonalDuplicateRemover implements DuplicateRemover{

    private Set<String> setOfWords;
    private int duplicates;

    public PersonalDuplicateRemover() {
        this.setOfWords = new HashSet<String>();
        this.duplicates =0;
    }
   
    
    @Override
    public void add(String characterString) {
//        boolean added = setOfWords.add(characterString);
//        if (!added) {
//            duplicates++;
//        }
        if(this.setOfWords.contains(characterString)){
            this.duplicates ++;
        }
        this.setOfWords.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.setOfWords;
    }

    @Override
    public void empty() {
        this.setOfWords.clear();
        this.duplicates = 0;
    }
    
}
