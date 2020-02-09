/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;

/**
 *
 * @author kraczlam5898
 */
public class BlackHoleBox extends Box{
private ArrayList<Thing> box;
    
    public BlackHoleBox() {
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        this.box.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
}
