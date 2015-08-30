/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author
 */
public class Thermometer implements Sensor {

    private final Random random;
    private Boolean status;

    public Thermometer() {
        this.random = new Random();
        this.status = false;
    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public int measure() {

        if (!this.isOn()) {
            throw new IllegalStateException("Thermometer is turned off.");
        } else {
            int randomNum = random.nextInt(30 - (-30) + 1) - 30;
            return randomNum;
        }
    }

}
