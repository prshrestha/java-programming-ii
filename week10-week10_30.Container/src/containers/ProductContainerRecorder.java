/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory containerH;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.containerH = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }

    public String history() {
        return containerH.toString();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.containerH.add(this.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double firstVol = this.getVolume();
        super.takeFromTheContainer(amount);
        this.containerH.add(this.getVolume());
        return firstVol - this.getVolume();
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n"
                + "History: " + this.history() + "\n"
                + "Greatest product amount: " + containerH.maxValue() + "\n"
                + "Smallest product amount: " + containerH.minValue() + "\n"
                + "Average: " + containerH.average() + "\n"
                + "Greatest change: " + containerH.greatestFluctuation() + "\n"
                + "Variance: " + containerH.variance());
    }
}
