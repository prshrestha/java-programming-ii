/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private final Map<String, Set<String>> dict;

    public PersonalMultipleEntryDictionary() {
        this.dict = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!this.dict.containsKey(word)) {
            this.dict.put(word, new HashSet<String>());
        }
        Set<String> meaning = this.dict.get(word);
        meaning.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else {
            return null;
        }
    }

    @Override
    public void remove(String word) {
        if (this.dict.containsKey(word)){
            this.dict.remove(word);
        }
    }
}
