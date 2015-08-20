/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {
        Box box = new Box(5);
        Box bb2 = new Box(1);

        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));

        bb2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        bb2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        bb2.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        box.add(bb2);

        System.out.println(box);
    }
}
