/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author
 */
public class Cow implements Milkable, Alive {

    private final int UDDER_MIN = 15;
    private final int UDDER_MAX = 40;
    private final String cowName;
    private final double udderCapacity;
    private double milkAmount;
    private final Random random = new Random();

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};


    /*create cow with random name*/
    public Cow() {
        this.cowName = NAMES[random.nextInt(NAMES.length)];
        this.udderCapacity = UDDER_MIN + random.nextInt(UDDER_MAX - UDDER_MIN + 1);
        this.milkAmount = 0;
    }

    /*creates a new cow with its given name*/
    public Cow(String name) {
        this.cowName = name;
        this.udderCapacity = UDDER_MIN + random.nextInt(UDDER_MAX - UDDER_MIN + 1);
        this.milkAmount = 0;
    }

    //returns cow's name
    public String getName() {
        return this.cowName;
    }

    //Udder capacity is a random value between 15 and 40
    public double getCapacity() {
        return this.udderCapacity;
    }

    //returns the amount on milk available in the cow's udders
    public double getAmount() {
        return this.milkAmount;
    }

    @Override
    public String toString() {
        return this.cowName + " " + Math.ceil(this.milkAmount) + "/" + Math.ceil(this.udderCapacity);
    }

    @Override
    public double milk() {
        double milkTaken = this.milkAmount;
        this.milkAmount = 0;
        return milkTaken;
    }

    @Override
    public void liveHour() {
        this.milkAmount += (7 + random.nextInt(20 - 7 + 1)) / 10.0;
        if (this.milkAmount > this.udderCapacity) {
            this.milkAmount = this.udderCapacity;
        }
    }
}
