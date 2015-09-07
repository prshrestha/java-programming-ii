/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author
 */
public class WordInspection {

    private final File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {

        Scanner r = readFile();
        int count = 0;

        while (r.hasNextLine()) {
            String s = r.nextLine();
            count++;
        }
        return count;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {

        Scanner r = readFile();

        List<String> wordZ = new ArrayList<String>();

        while (r.hasNextLine()) {
            String s = r.nextLine();
            if (s.contains("z")) {
                wordZ.add(s);
            }
            //return wordZ;
        }
        return wordZ;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        Scanner r = readFile();
        List<String> lastL = new ArrayList<String>();

        while (r.hasNextLine()) {
            String s = r.nextLine();
            if (s.endsWith("l")) {
                lastL.add(s);
            }
        }
        return lastL;
    }

    public List<String> palindromes() {
        Scanner r = readFile();
        List<String> palindrome = new ArrayList<String>();

        while (r.hasNextLine()) {
            String s = r.nextLine();
            String sReverse = reverse(s);

            if (s.equalsIgnoreCase(sReverse)) {
                palindrome.add(s);
            }
        }
        return palindrome;
    }

    public List<String> wordsWhichContainAllVowels() {

        //Finnish vowels - aeiouyäö
        Scanner r = readFile();
        List<String> wordVowel = new ArrayList<String>();

        while (r.hasNextLine()) {
            String s = r.nextLine();
            if (s.contains("a") && s.contains("e") && s.contains("i")
                    && s.contains("o") && s.contains("u") && s.contains("y")
                    && s.contains("ä") && s.contains("ö")) {
                wordVowel.add(s);
            }
        }
        return wordVowel;
    }

    //this method reads the file and returns the content in it
    private Scanner readFile() {
        try {
            Scanner reader = new Scanner(this.file, "UTF-8");
            return reader;
        } catch (FileNotFoundException ex) {
            return null;
        }
    }

    private String reverse(String s) {
   
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return rev;
        
        /*String reverse = "";
        int length = s.length();

        for (int i = 0; i < length; i++) {
            reverse += s.charAt(length - i);
        }
        return reverse;*/
    }

}
