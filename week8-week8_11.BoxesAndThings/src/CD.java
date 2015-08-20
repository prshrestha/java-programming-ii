/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class CD implements ToBeStored {
    
    private final String artist, title;
    private final int year;
    private final double weight; //in kg
    
    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return this.weight;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }
}
