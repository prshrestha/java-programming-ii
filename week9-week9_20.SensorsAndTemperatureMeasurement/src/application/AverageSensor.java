/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class AverageSensor implements Sensor {

    private final List<Sensor> sensors;
    private final List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s : sensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s : sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {

        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("Thermometers are not on or the sensors are missing.");
        } else {

            // calculates average;
            int sum = 0;
            int average;

            for (Sensor s : sensors) {
                sum += s.measure();
            }
            average = sum / sensors.size();

            //adds average to the list of readings for readings() method
            this.readings.add(average);

            return average;
        }

    }

    public List<Integer> readings() {

        return this.readings;

    }
}
