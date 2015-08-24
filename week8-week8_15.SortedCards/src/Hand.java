
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable <Hand>{

    private final List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    //this method adds card to the arraylist hand
    public void add(Card card) {
        this.hand.add(card);
    }

    //this method prints out the card
    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    
    @Override
    public int compareTo(Hand hh){
        int sum1 = 0;
        for (Card card : hh.hand){
            sum1 += card.getValue();
        }
        
        int sum2 = 0;
        for (Card card : this.hand){
            sum2 += card.getValue();
        }
        
        return sum2 - sum1;
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
         Collections.sort(this.hand, suitSorter);
    }
}
