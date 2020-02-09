/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraczlam5898
 */
public class Counter {

    private int StartingValue;
    private boolean check;

    public Counter(int StartingValue, boolean check) {
        this.StartingValue = StartingValue;
        this.check = check;
    }

    public Counter(int StartingValue) {
        this.StartingValue = StartingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.StartingValue = 0;
        this.check = check;
    }

    public Counter() {
        this.StartingValue = 0;
        this.check = false;
    }

    public int value() {
        return this.StartingValue;
    }

    public void increase() {
        increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.StartingValue += increaseAmount;
        }

    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (this.check) {
                this.StartingValue -= decreaseAmount;
                if (this.StartingValue < 0) {
                    this.StartingValue = 0;
                }
            } else {
                this.StartingValue -= decreaseAmount;
            }
        }

    }

}
