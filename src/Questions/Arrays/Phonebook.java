package Questions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Contact{
    private String fname;
    private String lastName;
    private long phoneNumber;
    private String emailID;
    Contact(String fname , String lastName , long phoneNumber,String emailID){
        this.emailID=emailID;
        this.fname=fname;
        this.phoneNumber=phoneNumber;
        this.lastName=lastName;

        
    }
   
    public Contact() {
    }

    @Override
    public String toString() {
        return "Contact [fname=" + fname + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", emailID="
                + emailID + "]";
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailID() {
        return emailID;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
}
class PhoneBuk{
    
    public PhoneBuk(List<Contact> objphonbukarr) {
        this.objphonbukarr = objphonbukarr;
    }
    private List<Contact> objphonbukarr = new ArrayList<Contact>();

    public List<Contact> getObjphonbukarr() {
        return objphonbukarr;
    }

    public void setObjphonbukarr(List<Contact> objphonbukarr) {
        this.objphonbukarr = objphonbukarr;
    }
    public void addContact(Contact objContact){
        objphonbukarr.add(objContact);

    }
    Contact objContact = new Contact();
    @Override
    public String toString() {
        return "PhoneBuk [objphonbukarr=" + objphonbukarr + "]";
    }

    public PhoneBuk() {
    }

    public List<Contact> viewAllcontacts(){
        
        return objphonbukarr;
    }
    public List<Contact> getDetaialViaPhone(long phoneN){
        if (phoneN==objContact.getPhoneNumber()) {
            System.out.println(objContact.getEmailID()+objContact.getLastName());
            
        }
        
        return objphonbukarr;
    }
}
public class Phonebook {
    public static void main(String[] args) {
        PhoneBuk objBuk = new PhoneBuk();
        objBuk.addContact(new Contact("eshu", "dhiman", 836031170, "eshu@jslka"));
        objBuk.addContact(new Contact("eshu", "dhiman", 836031170, "eshu@jslka"));
        System.out.println(objBuk.getObjphonbukarr());
        objBuk.getDetaialViaPhone(836031170);
    }

    
}
