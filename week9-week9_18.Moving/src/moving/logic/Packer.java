/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author
 */
public class Packer {

    private final int packerVol;
    private final List<Box> boxes;

    public Packer(int boxesVolume) {
        this.packerVol = boxesVolume;
        this.boxes = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(this.packerVol);
        for (Thing t : things) {
            box.addThing(t);
            boxes.add(box);
        }
        return this.boxes;
    }
}
