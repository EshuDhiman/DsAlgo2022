
package Concepts.SerializationJava;
/*package whatever //do not write package name here */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Patient implements Serializable{
    int pId;
    String name;
    int pAge;
    String pBloodGroup;
    
    Patient(int id , String fname , int age , String bloodGroup){
        Scanner sc = new Scanner(System.in);
        // System.out.println("ENTER PATIENT DETAILS ID,NAME,AGE,BLOODGROUP");
        // id= sc.nextInt();
        // fname= sc.next();
        // age = sc.nextInt();
        // bloodGroup= sc.next(); 
        this.pId = id;
        this.name = fname;
        this.pAge = age;
        this.pBloodGroup = bloodGroup;

    }

    @Override
    public String toString() {
        return "Patient [pId=" + pId + ", name=" + name + ", pAge=" + pAge + ", pBloodGroup=" + pBloodGroup + "]";
    }
}

class PatientList implements Serializable{
    List<Patient> patientList = new ArrayList<Patient>();
    void addPatient(Patient p){
        patientList.add(p);
    }
    void show(){
        Patient temp=null;
        System.out.println(patientList);
        for (int i=0;i<patientList.size() ;i++ ){
            temp = patientList.get(i);
            if (temp.pBloodGroup.equals("O")){
                System.out.println(temp);
                return;
            } 
        } 
        System.out.println("no patients with 'O' bloodGroup ");
    }
    
   
    // private void readObject(ObjectInputStream ois ) throws Exception{

       
    // }
  
}
public class GFG {
	public static void main (String[] args) throws Exception{
	PatientList tempObj = new PatientList();
	PatientList tempObj2 = new PatientList();
    Patient p1 = new Patient(101, "eshu", 21, "O");
        Patient p2 = new Patient(102, "harsh", 22, "A");
        tempObj2.addPatient(p2);
        tempObj2.addPatient(p1);

	FileOutputStream fos = new FileOutputStream("patients.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(tempObj2);
// 	DeSerialization
FileInputStream fis = new FileInputStream("patients.ser");
ObjectInputStream ois = new ObjectInputStream(fis);
PatientList ppp = (PatientList)ois.readObject();
ppp.show();

}
}