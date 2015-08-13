
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Dictionary {

    private final HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }

    public String translate(String word) {
        String finnishMeaning = this.dict.get(word);
        if (finnishMeaning != null) {
            return finnishMeaning;
        }
        return finnishMeaning;
    }

    public void add(String word, String translation) {
        this.dict.put(word, translation);
    }

    public int amountOfWords() {
        return this.dict.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();

        for (String key : this.dict.keySet()) {
            String value = this.dict.get(key);

            String toAddToTranslationList = key + " = " + value;
            translationList.add(toAddToTranslationList);
        }
        return translationList;
    }
}
