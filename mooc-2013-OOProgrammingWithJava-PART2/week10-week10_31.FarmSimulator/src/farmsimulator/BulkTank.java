/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author kraczlam5898
 */
public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return capacity - volume;
    }

    public void addToTank(double amount) {
        if (amount <= this.howMuchFreeSpace()) {
            this.volume = this.volume + amount;
        } else {
            this.volume = this.capacity;
        }
    }

    public double getFromTank(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (this.volume < amount) {
            double everything = volume;
            volume = 0.0;
            return everything;
        }
        volume = volume - amount;
        return volume;

    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }

}
