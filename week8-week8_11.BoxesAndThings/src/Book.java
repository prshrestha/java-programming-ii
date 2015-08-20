/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Book implements ToBeStored {

    private final String writer, name;
    private final double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.writer + ": " + this.name;
    }
    
    
    
}