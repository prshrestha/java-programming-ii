
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Box implements ToBeStored {

    private final double maxWeight; //in kgs
    private final ArrayList<ToBeStored> boxes;

    public Box(double maxWeight) {
        this.boxes = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }

    @Override
    public double weight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        double weight = 0.0;

        for (ToBeStored toStore : this.boxes) {
            weight += toStore.weight();
            //return this.maxWeight;
        }
        return weight;
    }

    public void add(ToBeStored toAdd) {

        double boxWeight = toAdd.weight();

        if (boxWeight + this.weight() <= this.maxWeight) {
            this.boxes.add(toAdd);
        }
    }

    @Override
    public String toString() {

        int count = this.boxes.size();
        double weight = this.weight();

        return "Box: " + count + " things," + " total weight " + weight + " kg";

    }
}
