
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Scores {
    
    private final List<Skier> skiers;
    private final Random random = new Random();
    
    public Scores(){
        this.skiers = new ArrayList<Skier>();
    }
    
    public void addSkier(Skier skier){
        this.skiers.add(skier);
    }
    
    //this method adds point
    public void point(Skier ski){
        
        //point from jumping
        int jumpLenth = random.nextInt(120 - 60 + 1) + 60;
        
        //points from the judge
        List<Integer> judgePoint = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++){
            int judgeScore = random.nextInt(20 - 10 + 1) + 10;
            judgePoint.add(judgeScore);
        }
        
        
        
    }
}
