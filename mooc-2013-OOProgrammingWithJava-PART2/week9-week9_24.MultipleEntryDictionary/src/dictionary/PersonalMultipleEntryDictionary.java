
package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    
    private HashMap<String, Set<String>> dict;

    public PersonalMultipleEntryDictionary() {
        this.dict = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if(!this.dict.containsKey(word)){
            this.dict.put(word, new HashSet<String>());
        }
        
        this.dict.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return this.dict.get(word);
    }

    @Override
    public void remove(String word) {
        this.dict.remove(word);
    }
    
    
    
    
    
}
