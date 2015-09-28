/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author
 */
public class ContainerHistory {

    private List<Double> state;

    public ContainerHistory() {
        this.state = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.state.add(situation);
    }

    public void reset() {
        this.state.clear();
    }

    public String toString() {
        return this.state.toString();
    }

    //this method retuns the max value from the state arraylist
    public double maxValue() {
        return Collections.max(this.state);
    }

    //this method returns the min value from the state arraylist
    public double minValue() {
        return Collections.min(this.state);
    }

    //returns average of the values from state arraylist
    public double average() {
        double mean = 0;
        if (this.state.isEmpty()) {
            return mean;
        } else {
            for (double state1 : this.state) {
                mean += state1;
            }
        }
        return mean / this.state.size();
    }

    //returns the max fluctuation between two numbers in arraylist
    public double greatestFluctuation() {
        double maxFluctuation = 0;
        List<Double> maxFluctuate = new ArrayList<Double>();
        if (this.state.isEmpty() || this.state.size() == 1) {
            return maxFluctuation;
        } else {
            for (int i = 0; i < this.state.size(); i++) {
                if (i != this.state.size() - 1) {
                    double firstNumber = this.state.get(i);
                    double secondNumber = this.state.get(i + 1);
                    maxFluctuation = secondNumber - firstNumber;
                    maxFluctuate.add(maxFluctuation);
                } else {
                    double firstNumber = this.state.get(i - 1);
                    double secondNumber = this.state.get(i);
                    maxFluctuation = secondNumber - firstNumber;
                    maxFluctuate.add(maxFluctuation);
                }
            }
        }
        return Math.abs(Collections.max(maxFluctuate));
    }

    //returns the variance of the state list
    public double variance() {
        double mean = average();
        double sum = 0;

        for (double state1 : state) {
            sum += Math.pow((state1 - mean), 2);
        }
        return sum / (state.size() - 1);
    }

}
