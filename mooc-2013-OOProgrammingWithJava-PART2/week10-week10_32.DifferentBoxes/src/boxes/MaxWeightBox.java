/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;

public class MaxWeightBox extends Box{
    
    private int maxWeight;
    private ArrayList<Thing> box;
    
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.box = new ArrayList<Thing>();
    }
    
    public int getCurrentWeight(){
        int curWeight = 0;
        for(Thing thing: box){
            curWeight += thing.getWeight();
        }
        return curWeight;
    }

    @Override
    public void add(Thing thing) {
        if(this.getCurrentWeight() + thing.getWeight() <= this.maxWeight){
            this.box.add(thing);
        }

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.box.contains(thing)){
            return true;
        }
        return false;
    }
}
