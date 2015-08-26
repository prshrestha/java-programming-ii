
import java.util.ArrayList;
import java.util.Collections;
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

    public Scores() {
        this.skiers = new ArrayList<Skier>();
    }

    public void addSkier(Skier skier) {
        this.skiers.add(skier);
    }

    public void pointSkier() {
        for (Skier ski : this.skiers) {
            int points = point();
            ski.addPoints(points);
        }
    }

    //this method adds point
    public int point() {

        int totalPoint = 0;
        //point from jumping
        int jumpLength = random.nextInt(120 - 60 + 1) + 60;

        //points from the judge
        List<Integer> judgePoint = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            int judgeScore = random.nextInt(20 - 10 + 1) + 10;
            judgePoint.add(judgeScore);
        }
        
        removeLargestAndSmallest(judgePoint);

        int sumJudgePoints = addArray(judgePoint);

        totalPoint = jumpLength + sumJudgePoints;

        return totalPoint;
    }

    //this method adds the individual values of array elements
    public int addArray(List<Integer> scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }

    //this method removes the smallest and largest value from the arrayList
    public void removeLargestAndSmallest(List<Integer> smallLarge) {
        Collections.sort(smallLarge);
        smallLarge.remove(0);
        smallLarge.remove(smallLarge.size() - 1);
    }
}
