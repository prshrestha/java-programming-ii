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
public class Contact {
    
    private String contactName;
    private List<String> contactNumber;
    private List<String> contactAddress;
    
    public Contact(String name){
        this.contactName = name;
        //this.contactNumber = number;
        //this.contactAddress = address;
    }
    
    
    //this method adds name and phone number to the contact
    public void addNumber(List<String> number){
        //this.contactName = name;
        this.contactNumber = number;
    }
    //this method adds address to the contact
    public void addAdress(List<String> address){
        this.contactAddress = address;
    }
    
    public String getName(){
        return this.contactName;
    }
    
    public List<String> getNumber(){
        return this.contactNumber;
    }
    
    public List<String> getAddress(){
        return this.contactAddress;
    }
    
    //delete phone numbers and address
    /*public void deleteContact(){
        this.contactNumber = null;
        this.contactAddress = null;
        //this.contactName = null;
    }*/
}



