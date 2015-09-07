/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Analysis {

    private final File file;

    public Analysis(File file) throws Exception {
        this.file = file;
    }

    public int lines() throws FileNotFoundException {

        Scanner r = new Scanner(this.file);
        int count = 0;

        while (r.hasNextLine()) {
            String s = r.nextLine();
            count++;
        }
        r.close();
        return count;
    }

    public int characters() throws FileNotFoundException {

        Scanner r1 = new Scanner(this.file);
        int count1 = lines();  //TMC output was off by the number of lines

        while (r1.hasNextLine()) {
            String s1 = r1.useDelimiter("").nextLine();
            count1 += s1.length();
        }
        r1.close();
        return count1;
    }

}
