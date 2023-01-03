package Concepts.CollectionsJava;

import java.util.*;

class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailId;

    public Contact(String contactFirstName, String contactLastName, String contactPhoneNumber, String contactEmailId) {
        this.firstName = contactFirstName;
        this.lastName = contactLastName;
        this.phoneNumber = contactPhoneNumber;
        this.emailId = contactEmailId;

    }

    Contact() {

    }

    public void setfirstName(String ContactfirstName) {
        this.firstName = ContactfirstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String ContactLastName) {
        this.lastName = ContactLastName;

    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Contact [firstName= " + firstName + "  lastname=" + lastName + "+ phoneNumber=" + phoneNumber
                + "+ emailId=" + emailId + " ] \n";
    }

}

class PhoneBook {
    private List<Contact> phoneBookList = new ArrayList<Contact>();

    public List<Contact> getPhoneBookList() {
        return phoneBookList;
    }

    public void setPhoneBookList(List<Contact> phoneBookList) {
        this.phoneBookList = phoneBookList;
    }

    public void addContact(Contact e) {
        phoneBookList.add(e);
    }

    public List<Contact> viewAllContacts() {
        return phoneBookList;
    }

    public Contact viewContact(String FindphoneNumber) {
        Contact temp = null;

        for (int i = 0; i < phoneBookList.size(); i++) {
            temp = phoneBookList.get(i);
            if (temp.getPhoneNumber() == FindphoneNumber) {
                return temp;

            }

        }
        System.out.println("CONTACT DETAILS OF " + FindphoneNumber + " ARE NOT FOUND");
        return temp;

    }

}

public class MeraCellTask {
    public static void main(String[] args) {
        Contact contact1 = new Contact("ESHU", "Dhiman", "8360311170", "eshudhiman224@gmail.com");
        Contact contact2 = new Contact("PAPA", "Dhiman", "9872889958", "eshudhiman224@gmail.com");

        PhoneBook newPhoneBook = new PhoneBook();
        newPhoneBook.addContact(contact1);
        newPhoneBook.addContact(contact2);
        System.out.println(newPhoneBook.viewAllContacts());
        System.out.println(newPhoneBook.viewContact("9872889958"));

    }

}
