


package application;
import java.util.*;
/**
 *
 * @author kraczlam5898
 */
public class Thermometer implements Sensor {

    private boolean isOn;
    private Random randomNumber = new Random();

    public Thermometer() {
        this.isOn = false;
    }

    public int getRandNumber(int min, int max) {
        int randomNum = randomNumber.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    @Override
    public boolean isOn() {
        if (this.isOn == true) {
            return true;
        }
        return false;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (this.isOn()) {
             return getRandNumber(-30, 30);
        }
        throw new IllegalStateException("is off");
       
    }

}
