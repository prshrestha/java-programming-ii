
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class ShoppingBasket {

    //private Purchase purchase;
    private List<Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }

    //add product to the shopper's basket
    public void add(String product, int price) {

        //adds ONE product to the purchases
        Purchase purchase = new Purchase(product, 1, price);

        if (!this.purchases.contains(purchase)) {
            this.purchases.add(purchase);
        } else {
            purchase.increaseAmount();
        }
    }

    //returns the total price of the shoper's purchases
    public int price() {
        int price = 0;
        for (Purchase item : purchases) {
            price += item.price();
        }
        return price;
    }

    public void print() {

        Map<String, Integer> test = new HashMap<String, Integer>();

        //adds the name of the product as key and the quantity as value
        for (Purchase item : purchases) {
            String itemName = item.name();

            if (test.containsKey(itemName)) {
                test.put(itemName, test.get(itemName) + 1);
            } else {
                test.put(itemName, 1);
            }
        }

        //iterate over the test hashmap to get the key and required value as print out
        for (String key : test.keySet()) {
            System.out.println(key + ": " + test.get(key));
        }
    }
}
