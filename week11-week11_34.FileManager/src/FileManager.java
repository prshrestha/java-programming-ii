
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private File file;
    private Scanner reader;

    public List<String> read(String file) throws FileNotFoundException {
        Scanner reader;
        this.file = new File(file);
        reader = new Scanner(this.file);

        List<String> words = new ArrayList<String>();

        if (this.file.exists()) {
            while (reader.hasNextLine()) {
                String s = reader.nextLine();
                words.add(s);
            }
            return words;
        } else {
            return null;
        }
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer;
        writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer;
        writer = new FileWriter(file);
        for (String str : texts) {
            writer.write(str);
            writer.write("\n");
        }
        writer.close();
    }
}
