
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
public class Contact {
    
    private final String contactName;
    private final List<String> contactNumber;
    private String contactAddress;
    
    public Contact(String name, List<String> number, String address){
        this.contactName = name;
        this.contactNumber = number;
        this.contactAddress = address;
    }
    
    public String getName(){
        return this.contactName;
    }
    
    public List<String> getNumber(){
        return this.contactNumber;
    }
    
    public String getAddress(){
        return this.contactAddress;
    }
}
