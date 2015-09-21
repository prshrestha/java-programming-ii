
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!

        welcomeMessage();

        Scanner reader = new Scanner(System.in);
        ContactBook contactBook = new ContactBook();

        while (true) {

            String userInput; //stores the user input here

            System.out.println("?");

            userInput = reader.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                break;
            } else if (userInput.equalsIgnoreCase("1")) {
                addNumber(reader, contactBook);
            } else if (userInput.equalsIgnoreCase("2")) {
                System.out.println("whose number:");
                String inputName = reader.nextLine();
                searchNumber(inputName, contactBook);
            } else if (userInput.equalsIgnoreCase("3")) {
                System.out.println("number:");
                String inputNumber = reader.nextLine();
                searchName(inputNumber, contactBook);
            } else if (userInput.equalsIgnoreCase("4")) {
                addAddress(reader, contactBook);
            } else if (userInput.equalsIgnoreCase("5")) {
                System.out.println("whose information:");
                String inputName = reader.nextLine();
                searchNumberAndAddress(inputName, contactBook);
            } else if (userInput.equalsIgnoreCase("6")) {
                System.out.println("whose information:");
                String inputName = reader.nextLine();
                deleteNumberAndAddress(inputName, contactBook);
            }
        }
    }

    //this contains all the message that are displayed at the begining of the program
    private static void welcomeMessage() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }

    //this method adds name to the contact
    private static void addNumber(Scanner reader, ContactBook contactBook) {
        System.out.println("whose number:");
        String inputName = reader.nextLine();

        contactBook.addContact(inputName);

        System.out.println("number:");
        String inputNumber = reader.nextLine();

        List<String> numberList = new ArrayList<String>();

        for (Contact c : contactBook.getContacts()) {
            if (c.getName().equalsIgnoreCase(inputName)) {
                if (c.getNumber() == null) {
                    numberList.add(inputNumber);
                    c.addNumber(numberList);
                    return;
                } else {
                    numberList = c.getNumber();
                    numberList.add(inputNumber);
                    c.addNumber(numberList);
                    return;
                }
            }
        }
    }

    //this method searches the phone number of the contact by its name
    private static void searchNumber(String name, ContactBook contactBook) {
        for (Contact c : contactBook.getContacts()) {
            if (c.getName().equalsIgnoreCase(name)) {
                for (int i = 0; i < c.getNumber().size(); i++) {
                    System.out.println("[" + c.getNumber().get(i) + "]");
                }
                return;
            }
        }
        System.out.println("not found");
    }

//this method searches name of the contact by its phone number
    private static void searchName(String number, ContactBook contactBook) {
        for (Contact c : contactBook.getContacts()) {
            if (c.getNumber().contains(number)) {
                System.out.println(c.getName());
                return;
            }
        }
        System.out.println("not found");
    }

    //this method adds address to the contact
    private static void addAddress(Scanner reader, ContactBook contactBook) {
        System.out.println("whose address:");
        String inputName = reader.nextLine();

        for (Contact c : contactBook.getContacts()) {
            if (!c.getName().equalsIgnoreCase(inputName)) {
                System.out.println("not found");
                return;
            }
        }

        System.out.println("street:");
        String inputStreet = reader.nextLine();

        System.out.println("city:");
        String inputCity = reader.nextLine();

        String address = inputStreet + " " + inputCity;

        List<String> addressList = new ArrayList<String>();

        for (Contact c : contactBook.getContacts()) {
            if (c.getName().equalsIgnoreCase(inputName)) {
                if (c.getAddress() == null) {
                    addressList.add(address);
                    c.addAdress(addressList);
                    return;
                } else {
                    addressList = c.getAddress();
                    addressList.add(address);
                    c.addAdress(addressList);
                    return;
                }
            }
        }
    }

    //this method searches for both the phone number and the address of the contact
    private static void searchNumberAndAddress(String name, ContactBook contactBook) {
        for (Contact c : contactBook.getContacts()) {
            if (c.getName().equalsIgnoreCase(name)) {
                for (int i = 0; i < c.getNumber().size(); i++) {
                    System.out.println("[" + c.getNumber().get(i) + "]");
                }
                for (int i = 0; i < c.getAddress().size(); i++) {
                    System.out.println("[" + c.getAddress().get(i) + "]");
                }
                return;
            }
            System.out.println("not found");
        }
    }

    private static void deleteNumberAndAddress(String name, ContactBook contactBook) {
        for (Contact c : contactBook.getContacts()) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.getNumber().clear();
                c.getAddress().clear();
                return;
            }
            System.out.println("not found");
        }
    }
}
