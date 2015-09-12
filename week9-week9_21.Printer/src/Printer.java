
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Printer {

    private final File file;
    private Scanner r;

    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        r = new Scanner(this.file);
        while (r.hasNextLine()) {
            String s = r.nextLine();
            if (s.contains(word)) {
                System.out.println(s);
            }
        }
        r.close();
    }

}
