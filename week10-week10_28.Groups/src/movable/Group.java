/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */
public class Group implements Movable {

    private final List<Movable> groups = new ArrayList<Movable>();

    public void addToGroup(Movable movable) {
        groups.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable org : groups) {
            org.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String group = "";
        for (Movable org : groups) {
             group += org.toString();
             group += '\n';
        }
        return group;
    }
}
