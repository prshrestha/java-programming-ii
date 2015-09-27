/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class MaxWeightBox extends Box {

    private int maxBoxWeight;
    private List<Thing> boxOfThings;

    public MaxWeightBox(int maxWeight) {
        this.maxBoxWeight = maxWeight;
        this.boxOfThings = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int weightBox = 0;
        for (Thing t : boxOfThings) {
            weightBox += t.getWeight();
        }
        if (weightBox + thing.getWeight() <= this.maxBoxWeight) {
            boxOfThings.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return boxOfThings.contains(thing);
    }
}
