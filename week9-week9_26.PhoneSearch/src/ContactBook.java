
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class ContactBook {

    private final List<Contact> contactBook;
    private Contact contact;

    public ContactBook() {
        this.contactBook = new ArrayList<Contact>();
    }

    public void addContact(String name, List<String> number, String address) {
        contact = new Contact(name, number, address);
        this.contactBook.add(contact);
    }

    public List<Contact> getContacts() {
        return this.contactBook;
    }
}
