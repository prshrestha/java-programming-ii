
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Suitcase {

    //private Thing thing;
    private final int maxWeight;
    //private String name;
    //private int weight;
    private final ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        things = new ArrayList<Thing>();
        //thing = new Thing(name, weight);
        //things.add(thing);
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        int weight = totalWeight();
        weight += thing.getWeight();
        //System.out.println(weight);
        if (weight <= this.maxWeight) {
            things.add(thing);
        }
    }

    public String toString() {
        int weight = totalWeight();

        if (things.size() == 0) {
            return "empty " + "(" + weight + " kg)";
        } else if (things.size() == 1) {
            return things.size() + " thing " + "(" + weight + " kg)";
        }
        return things.size() + " things " + "(" + weight + " kg)";
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = null;
        if (things.size() > 0) {
            heaviest = things.get(0);
            for (Thing thing : things) {
                if (heaviest.getWeight() < thing.getWeight()) {
                    heaviest = thing;
                }
            }
        }
        return heaviest;
    }
}
