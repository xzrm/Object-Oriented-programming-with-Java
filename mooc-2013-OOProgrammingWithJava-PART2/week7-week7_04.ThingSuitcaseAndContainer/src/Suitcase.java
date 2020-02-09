
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kraczlam5898
 */
public class Suitcase {

    private int maxWeight;
    private int curTotWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.curTotWeight = 0;
        this.things = new ArrayList<Thing>();

    }

    public void addThing(Thing thing) {
        if (this.curTotWeight + thing.getWeight() <= this.maxWeight) {
            this.things.add(thing);
            this.curTotWeight += thing.getWeight();
        }

    }

    public String toString() {
        if (this.things.size() == 0) {
            return "empty" + "( " + this.curTotWeight + " kg)";
        } else if (this.things.size() == 1) {
            return this.things.size() + " thing" + " (" + this.curTotWeight + "kg)";
        } else {
            return this.things.size() + " things" + " (" + this.curTotWeight + "kg)";
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }

    public int totalWeight() {
        return this.curTotWeight;
    }

    public Thing heaviestThing() {
        int heaviest = 0;
        int ixHeaviest = 0;
        if (this.things.size() > 0) {
            for (int i = 0; i < this.things.size(); i++) {
                if (this.things.get(i).getWeight() > heaviest) {
                    heaviest = this.things.get(i).getWeight();
                    ixHeaviest = i;
                }
            }
        } else {
            return null;
        }
        return this.things.get(ixHeaviest);
    }   

}
