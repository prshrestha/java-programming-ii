/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moocweek11exercise40;

/**
 *
 * @author Trigg
 */
public class Calculator {
    private int x;
    private int y;
    
    public Calculator(){
        this.x = 0;
        this.y = 0;
    }
    
    public String add(int x, int y){
        return x + y + "";
    }
    
    public String minus(int x, int y){
        return x - y + "";
    }
}
