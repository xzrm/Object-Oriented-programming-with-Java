/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.*;

public class ContainerHistory {

    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.min(history);
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0;

        for (double d : this.history) {
            sum += d;
        }
        return sum / (double) this.history.size();
    }

    public double greatestFluctuation() {
        if (this.history.size() <= 1) {
            return 0;
        }
        double maxFluctuation = 0;
        for (int i = 0; i < this.history.size() - 1; i++) {
            if (Math.abs(this.history.get(i) - this.history.get(i + 1)) > maxFluctuation) {
                maxFluctuation = Math.abs(this.history.get(i) - this.history.get(i + 1));
            }
        }
        return maxFluctuation;
    }
    
    public double variance(){
        double avg = this.average();
        double numerator = 0;
        for (int i = 0; i < this.history.size(); i++){
            numerator += Math.pow(this.history.get(i)-avg, 2);
        }
        return numerator/(this.history.size()-1);
    }

}
