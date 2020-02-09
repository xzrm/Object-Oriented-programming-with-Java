/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.*;

public class AverageSensor implements Sensor {

    private ArrayList<Integer> readings;
    private ArrayList<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : this.sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int avg = 0;
        int counter = 0;
        if (this.isOn() == false || this.sensors.isEmpty()) {
            throw new IllegalStateException("");
        } else {
            for (Sensor sensor : this.sensors) {

                avg += sensor.measure();
                counter++;
            }
        }
        int result = avg / counter;
        this.readings.add(result);
        return result;
    }

    public List<Integer> readings() {
        return this.readings;
    }

}
