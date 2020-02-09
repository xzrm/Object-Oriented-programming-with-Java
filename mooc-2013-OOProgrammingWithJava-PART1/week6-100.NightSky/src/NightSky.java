/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kraczlam5898
 */
import java.util.Random;
import java.util.Arrays;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public void printLine() {
        Random random = new Random();

        for (int i = 0; i < this.width; i++) {
            double probab = random.nextDouble();
            String toPrint = "";
            if (probab <= this.density) {
                toPrint = "*";
                this.starsInLastPrint ++;
            } else {
                toPrint = " ";
            }
            System.out.print(toPrint);
        }
        System.out.println("");
    }
    
    public void print(){
        this.starsInLastPrint = 0;
        for (int i=0; i<this.height; i++){
            this.printLine();
        }
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
