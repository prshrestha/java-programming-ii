/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author
 */
public class BulkTank {

    private final double TANK_CAPACITY = 2000;  //in liters
    private final double tankCapacity;
    private double volume;

    //this creates tank with default capacity
    public BulkTank() {
        this.tankCapacity = TANK_CAPACITY;
        this.volume = 0;
    }

    //creates tank with custom capacity
    public BulkTank(double capacity) {
        this.tankCapacity = capacity;
        this.volume = 0;
    }

    //returns tank capacity
    public double getCapacity() {
        return this.tankCapacity;
    }

    //retunrns milk in the tank
    public double getVolume() {
        return volume;
    }

    //returns empty space on tank
    public double howMuchFreeSpace() {
        return this.tankCapacity - this.volume;
    }

    /*adds to the tank only as much milk as it fits; the additional 
     milk will not be added, and you don't have to worry about a 
     situation where the milk spills over*/
    public void addToTank(double amount) {
        this.volume += amount;
        if (this.volume > this.tankCapacity) {
            this.volume = this.tankCapacity;
        }
    }

    /*takes the required amount from the tank, or as much as there is left*/
    public double getFromTank(double amount) {
        if (this.volume - amount < 0) {
            double takeFromTank = this.volume;
            this.volume = 0;
            return takeFromTank;
        } else {
            this.volume -= amount;
            return amount;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
}
