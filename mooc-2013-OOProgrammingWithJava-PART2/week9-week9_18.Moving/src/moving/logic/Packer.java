/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import moving.domain.Item;
import moving.domain.Thing;
import moving.domain.Box;
import java.util.*;

/**
 *
 * @author kraczlam5898
 */
public class Packer {

    private int boxVolume;

    public Packer(int boxVolume) {
        this.boxVolume = boxVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(new Box(boxVolume));
        int curBoxIx = 0;
        for (Thing thing : things) {
            if(boxes.get(curBoxIx).getVolume() + thing.getVolume() <= this.boxVolume){
                boxes.get(curBoxIx).addThing(thing);
            }
            else{
                boxes.add(new Box(boxVolume));
                curBoxIx ++;
                boxes.get(curBoxIx).addThing(thing);
            }
        }

        return boxes;
    }

}
