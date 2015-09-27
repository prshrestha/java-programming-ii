/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author
 */
public class Barn {

    private final BulkTank bulkTankBarn;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.bulkTankBarn = tank;
        this.robot = null;
    }

    public BulkTank getBulkTank() {
        return this.bulkTankBarn;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(bulkTankBarn);
    }

    public void takeCareOf(Cow cow) {
        try {
            this.robot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        for (Cow c : cows) {
            takeCareOf(c);
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.bulkTankBarn.getVolume()) + "/"
                + Math.ceil(this.bulkTankBarn.getCapacity());
    }
}
