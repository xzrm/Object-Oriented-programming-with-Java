/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraczlam5898
 */
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        String newString = "";
        
        for (int i = 0; i < characterString.length(); i++) {
            char c = characterString.charAt(i);

            if (c == fromCharacter) {
                newString = newString + this.toCharacter;
            } else {
                newString = newString + c;
            }
        }
        return newString;
        
        
//        public String change(String charactersString) {
//            return characterString.replace(fromCharacter, toCharacter);
//        }
    }
}
