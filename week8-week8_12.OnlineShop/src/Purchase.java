
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Purchase {
    
    private final String product;
    private int amount; 
    private final int unitPrice;
    
    //constructor
    public Purchase(String product, int amount, int unitPrice){
        this.amount = amount;
        this.product = product;
        this.unitPrice = unitPrice;
    }
    
    //returns the name of the product
    public String name(){
        return this.product;
    }
    //returns the price of the product
    public int price(){
        return this.amount * this.unitPrice;
    }
    
    //returns the total number of product present
    public int amount(){
        return this.amount;
    }
    
    //increases the amunt of the product by one
    public void increaseAmount(){
        this.amount += 1;
    }
    
    @Override
    public String toString(){
        return this.product + ": " + this.amount;
    }
}
