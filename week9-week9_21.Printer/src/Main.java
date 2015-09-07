
public class Main {

    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("src/textfile.txt");

        printer.printLinesWhichContain("tuli");
        System.out.println("-----");
        printer.printLinesWhichContain("on");
        System.out.println("-----");
    }
}
