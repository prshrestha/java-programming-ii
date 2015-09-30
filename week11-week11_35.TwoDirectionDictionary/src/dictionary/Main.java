package dictionary;

public class Main {

    public static void main(String[] args) {
        // Test your dictionary here
        /*MindfulDictionary dict = new MindfulDictionary();
         dict.add("apina", "monkey");
         dict.add("banaani", "banana");
         dict.add("apina", "apfe");

         System.out.println(dict.translate("apina"));
         System.out.println(dict.translate("monkey"));
         System.out.println(dict.translate("programming"));
         System.out.println(dict.translate("banana"));*/

        /*MindfulDictionary dict = new MindfulDictionary();
         dict.add("apina", "monkey");
         dict.add("banaani", "banana");
         dict.add("ohjelmointi", "programming");
         dict.remove("apina");
         dict.remove("banana");

         System.out.println(dict.translate("apina"));
         System.out.println(dict.translate("monkey"));
         System.out.println(dict.translate("banana"));
         System.out.println(dict.translate("banaani"));
         System.out.println(dict.translate("ohjelmointi"));*/
        
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();

        System.out.println(dict.translate("apina"));
        System.out.println(dict.translate("ohjelmointi"));
        System.out.println(dict.translate("alla oleva"));
    }
}
