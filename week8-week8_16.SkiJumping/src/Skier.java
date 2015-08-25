
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Skier implements Comparable<Skier> {
    
    private final String name;
    private int point;
    private final List<Integer> round;
    
    public Skier(String name){
        this.name = name;
        this.point = 0;
        this.round = new ArrayList<Integer>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPoints(){
        return this.point;
    }
    
    public void addPoints(int point){
        this.point += point;
    }
    
    @Override
    public int compareTo(Skier skier){
        return this.point - skier.getPoints();
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.point +" )"; 
    }
}
