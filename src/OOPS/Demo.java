package OOPS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;

public class Demo {
    public static void main(String[] args){
      Student1[] arr = new Student1[2];
      arr[0] = new Student1(0, null);
      

    }
    class Student1{
        public int id;
    public String name;
 
    // Student class constructor
    public Student1(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
 
    // display() method to display
    // the student data
    public void display()
    {
        System.out.println("Student id is: " + id + " "
                           + "and Student name is: "
                           + name);
        System.out.println();
    }

    }
    
}
