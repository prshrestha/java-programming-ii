
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
public class Storehouse {

    private Map<String, Integer> prodPrice;
    private Map<String, Integer> prodStock;

    public Storehouse() {
        this.prodPrice = new HashMap<String, Integer>();
        this.prodStock = new HashMap<String, Integer>();
    }

    //adds product to corresponding Map
    public void addProduct(String product, int price, int stock) {
        this.prodPrice.put(product, price);
        this.prodStock.put(product, stock);
    }

    //checks and return if the product is available in the store
    public int price(String product) {
        if (this.prodPrice.containsKey(product)) {
            return this.prodPrice.get(product);
        } else {
            return -99;
        }
    }

    // returns the total number of products in stock
    public int stock(String product) {
        if (this.prodStock.containsKey(product)) {
            return this.prodStock.get(product);
        } else {
            return 0;
        }
    }

    //reduces the product added to shopper's cart by 1
    public boolean take(String product) {
        if (this.prodStock.containsKey(product) && this.prodStock.get(product) > 0) {
            this.prodStock.put(product, this.prodStock.get(product) - 1);
            //this.prodStock.values();
            return true;
        } else {
            return false;
        }
    }

    //prints the set of products
    public Set<String> products() {
        Set<String> test = new HashSet<String>();

        for (String key : this.prodPrice.keySet()) {
            test.add(key);
        }
        return test;
    }
}
