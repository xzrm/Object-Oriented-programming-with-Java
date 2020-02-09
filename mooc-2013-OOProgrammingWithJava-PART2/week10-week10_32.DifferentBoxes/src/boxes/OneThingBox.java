/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.*;

public class OneThingBox extends Box{
    private ArrayList<Thing> box;
    
    public OneThingBox() {
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
       if(box.size()==0){
           box.add(thing);
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
