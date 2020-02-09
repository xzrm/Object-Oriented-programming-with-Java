/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.*;

public class Cow implements Milkable, Alive {

    private String name;
    private int udderCap;
    private double udderVol;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.name = NAMES[new Random().nextInt(NAMES.length - 1)];
        this.udderCap = 15 + new Random().nextInt(26);
        this.udderVol = 0;
    }

    public Cow(String name) {
        this.name = name;
        this.udderCap = 15 + new Random().nextInt(26);
        this.udderVol = 0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCap;
    }

    public double getAmount() {
        return this.udderVol;
    }

    public String toString() {
        return this.getName() + " " + this.udderVol + "/" + (double) this.udderCap;
    }

    @Override
    public double milk() {
        double toMilk = this.getAmount();
        this.udderVol = 0;
        return toMilk;
    }

    @Override
    public void liveHour() {
        Random r = new Random();
        double producedMilk = Math.ceil(0.7 + (2 - 0.7) * r.nextDouble());
        if (this.udderVol + producedMilk < this.udderCap) {
            this.udderVol += producedMilk;
        } else {
            this.udderVol = this.udderCap;
        }
    }

}
