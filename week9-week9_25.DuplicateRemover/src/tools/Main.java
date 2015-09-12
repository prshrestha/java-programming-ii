package tools;

public class Main {

    public static void main(String[] args) {
        // Test your class here
        DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("apina");
        remover.add("apina");
        remover.add("gorilla");
        remover.add("ap");
        remover.add("ap");
        remover.add("gorilla");

        System.out.println("Current number of duplicates: "
                + remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("last");
        remover.add("last");
        remover.add("new");
        remover.add("ap");
        remover.add("gorilla");

        System.out.println("Current number of duplicates: "
                + remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: "
                + remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Current number of duplicates: "
                + remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: "
                + remover.getUniqueCharacterStrings());
    }
}
