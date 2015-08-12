
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Container {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Container(int maxWeight) {
        suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int weight = totalWeight();
        weight += suitcase.totalWeight();
        if (weight <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        int weight = totalWeight();
        return suitcases.size() + " suitcases " + "(" + weight + " kg)";
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase ss : suitcases) {
            weight += ss.totalWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Suitcase ss : suitcases) {
            ss.printThings();
        }
    }
}
