/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private final List<String> duplicate;
    private int count;

    public PersonalDuplicateRemover() {
        this.duplicate = new ArrayList<String>();
        this.count = 0;
    }

    @Override
    public void add(String characterString) {
        if (this.duplicate.contains(characterString)) {
            count++;
            return;
        }
        this.duplicate.add(characterString);
    }

    @Override

    /*this method counts the total number of times the duplicate has been repeated
     to satisfy the TMC.*/
    public int getNumberOfDetectedDuplicates() {
        return this.count;
    }

    //this method counts the duplicates only once
    /*public int getNumberOfDetectedDuplicates() {

        count = 0;

        //List to store the duplicates
        List<String> dup = new ArrayList<String>();

        for (String s : this.duplicate) {

            int first = this.duplicate.indexOf(s);
            int last = this.duplicate.lastIndexOf(s);

            if (first != last) {
                if (!dup.contains(s)) {
                    dup.add(s);
                }
            }
        }
        count = dup.size();
        return count;
    }*/

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> unique = new HashSet<String>();
        for (String s : this.duplicate) {
            if (!unique.contains(s)) {
                unique.add(s);
            }
        }
        return unique;
    }

    @Override
    public void empty() {
        //this.duplicate.remove(this.duplicate.get(index));
        this.duplicate.removeAll(duplicate);
        this.count = 0;
    }
}
