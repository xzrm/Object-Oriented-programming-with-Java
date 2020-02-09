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

public class PromissoryNote {

    private HashMap<String, Double> dict;

    public PromissoryNote() {
        this.dict = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.dict.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (this.dict.containsKey(whose)) {
            return this.dict.get(whose);
        }
        return 0;

            

//    public double howMuchIsTheDebt(String whose) {
//        Double value = dict.get(whose);
//        if(value == null){
//            return 0;
//        }
//        return value
    }
}
