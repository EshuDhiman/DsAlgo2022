package Concepts.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        //  ArrayList<datatype> name = new ArrayList<datatype>(size);
        Scanner sc = new Scanner(System.in);
          
        List<Integer> person = new ArrayList<>(10);
        person.add(69);
        person.add(69);
        person.add(69);

        person.add(69);person.add(69);person.add(69);person.add(69);person.add(69);person.add(69);
        person.add(69);
        person.add(69);
        person.remove(7);
        System.out.println(person);
        for (int i = 0; i < 10; i++) {
            person.add(sc.nextInt()); 
            
            
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(person.get(i));
            
        }


         
        
    }
    
}
