
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
public class Container {

    private int limit;
    private int curTotWeight;
    private ArrayList<Suitcase> container;

    public Container(int limit) {
        this.limit = limit;
        this.curTotWeight = 0;
        this.container = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.curTotWeight + suitcase.totalWeight() <= this.limit) {
            this.container.add(suitcase);
            this.curTotWeight += suitcase.totalWeight();
        }
    }

    public void printThings() {
        for (Suitcase suitcase : container) {
            suitcase.printThings();
        }
    }

    public String toString() {
        return this.container.size() + " suitcases " + "( " + this.curTotWeight + " kg)";
    }
}
