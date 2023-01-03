package Concepts.SerializationJava;

import java.io.*;
import java.util.ArrayList;
/*We can Implement Customized Serialization by using the following 2 Methods :
  1) private void writeObject(ObjectOutputStream os) throws Exception
     This Method will be executed Automatically at the Time of Serialization.
     Hence while performing Serialization if we want do any Extra Work we have to
     write corresponding Code in this Method Only. and object.defaultwriteobject is meant for defaul serialization
  2) private void readObject(ObjectInputStream is) throws Exception
    This Method will be executed Automatically at the Time of De - Serialization.
    Hence while performing De - Serialization if we want do any Extra Work we have
    to Define the corresponding code in this Method Only.
We can Implement Customized Serialization by using the following 2 Methods :
  1) private void writeObject(ObjectOutputStream os) throws Exception
     This Method will be executed Automatically at the Time of Serialization.
     Hence while performing Serialization if we want do any Extra Work we have to
     write corresponding Code in this Method Only.
  2) private void readObject(ObjectInputStream is) throws Exception
    This Method will be executed Automatically at the Time of De - Serialization.
    Hence while performing De - Serialization if we want do any Extra Work we have
    to Define the corresponding code in this Method Only.

    */
import java.util.List;

class Account implements Serializable {
    private String Fname;
    private String Lname;
    private int id;
    private transient String password;

    Account(String name, String lname, int accountId, String pswd) {
        this.Fname = name;
        this.Lname = lname;
        this.id = accountId;
        this.password = pswd;
    }

    @Override
    public String toString() {
        return "Account [Fname=" + Fname + ", Lname=" + Lname + ", id=" + id + ", password=" + password + "]";
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setId(int id) {
        this.id = id;
    }

    Account() {

    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    private void writeObject(ObjectOutputStream oos) throws Exception {
        oos.defaultWriteObject();
        String pswd = ("123" + password);
        oos.writeObject(pswd);
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        ois.defaultReadObject();
        String pwd = (String) ois.readObject();
        password = pwd.substring(3);

    }

    public void setPassword(String password) {
        this.password = password;
    }

}

class Operations implements Serializable {
    private List<Account> accountList = new ArrayList<Account>();

    void addAcc(Account e) {
        accountList.add(e);

    }

    void showAccountDetails(String name) {
        Account temp;
        for (int i = 0; i < accountList.size(); i++) {
            temp = accountList.get(i);
            if (temp.getFname().equals(name.toUpperCase())) {
                System.out.println(temp);
                return;
            }

        }
        System.out.println("RECORD NOT FOUND");
    }

}

public class CustomisedSerialization {
    static void beginSerialization() throws Exception {
        System.out.println("begun serialization");
        Operations operationsObj = new Operations();
        Account account1 = new Account("ESHU", "DHIMAN", 101, "ESHUDHIMAN!!!111");
        Account account2 = new Account("HARSH", "BANDHAN", 102, "HARSH!!!111");
        operationsObj.addAcc(account1);
        operationsObj.addAcc(account2);
        FileOutputStream fos = new FileOutputStream("ACCOUNTS.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(operationsObj);
        System.out.println("Serialization Complete");
        oos.close();

    }

    static void beginDeSerialization() throws Exception {
        System.out.println("begun DeSerialization");

        FileInputStream fis = new FileInputStream("Accounts.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Operations tempObj = (Operations) ois.readObject();
        tempObj.showAccountDetails("eshu");

        System.out.println("DeSerialization Complete");
        ois.close();

    }

    public static void main(String[] args) throws Exception {
        beginSerialization();
        beginDeSerialization();

    }

}
