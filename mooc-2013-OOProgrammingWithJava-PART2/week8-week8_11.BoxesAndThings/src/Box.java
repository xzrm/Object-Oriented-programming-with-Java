
import java.util.*;

public class Box implements ToBeStored {

    private double maxWeight;
    private int numThings;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public double weight() {
        double weight = 0;
        for(ToBeStored thing: things){
            weight += thing.weight();
        }
        return weight;
    }

    public void add(ToBeStored thing) {
        if (this.weight() + thing.weight() < this.maxWeight) {
            this.things.add(thing);
        }
    }

    public String toString() {
        return "Box: " + this.things.size() + " things, total weight "
                + this.weight() + " kg";
    }
}
