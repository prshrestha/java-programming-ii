
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();
        /*for (String line : t.read("src/testinput2.txt")) {
         System.out.println(line);
         }*/
        /*t.save("src/testinput2.txt", "test");
         t.save("src/test3.txt", "Programming is fun! Woho!");*/

        List<String> fruits = new ArrayList<String>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("watermelon");

        t.save("src/TestFruits.txt", fruits);
    }
}
