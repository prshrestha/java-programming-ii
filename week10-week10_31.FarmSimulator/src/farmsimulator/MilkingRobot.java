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
public class MilkingRobot {

    private BulkTank bulkTank;

    //creates a new milking robot
    public MilkingRobot() {
        this.bulkTank = null;
    }

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    public void setBulkTank(BulkTank tank) {
        this.bulkTank = tank;
    }

    public void milk(Milkable milkable) {
        try {
            this.bulkTank.addToTank(milkable.milk());
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
}
