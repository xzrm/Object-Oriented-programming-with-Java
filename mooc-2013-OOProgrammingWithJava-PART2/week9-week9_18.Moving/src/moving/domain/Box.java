/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.*;

/**
 *
 * @author kraczlam5898
 */
public class Box implements Thing{
    private int maxCap;
    private ArrayList<Thing> box;

    public Box(int maxCap) {
        this.maxCap = maxCap;
        this.box = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if(this.getVolume() + thing.getVolume() <= this.maxCap){
            this.box.add(thing);
            return true;
        }return false;
    }

    @Override
    public int getVolume() {
        int curWeight = 0;
        for(Thing thing: this.box){
            curWeight += thing.getVolume();
        }
        return curWeight;
    }
    
}
