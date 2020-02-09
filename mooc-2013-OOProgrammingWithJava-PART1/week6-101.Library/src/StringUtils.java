/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraczlam5898
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        String newWord = word.trim().toUpperCase();
//        System.out.println(newWord);
        String newSearched = searched.trim().toUpperCase();
//        System.out.println(newSearched);
        if ((newWord.length() == 0) || (newSearched.length() == 0)) {
            return false;
        }
        return newWord.contains(newSearched);

    }
}
