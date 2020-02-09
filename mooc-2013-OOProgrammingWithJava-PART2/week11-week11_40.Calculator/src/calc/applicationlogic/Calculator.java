package calc.applicationlogic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kraczlam5898
 */
public class Calculator {

    private int total;

    public Calculator() {
        this.total = 0;
    }

    public int getTotal() {
        return total;
    }

    public void addToTotal(int value) {
        this.total = this.total + value;

    }

    public void subtructFromTotal(int value) {

        this.total = this.total - value;

    }

    public void setZero() {
        this.total = 0;
    }

}
