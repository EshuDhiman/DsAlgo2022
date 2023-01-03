package Concepts.CollectionsJava;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javafx.print.Collation;

public class LinkedListColl {
    public static void main(String[] args) {
        HetrogenousLL();
        HomogenousLL();
        specificMethodsForLL();

    }

    static void specificMethodsForLL(){
        LinkedList l = new LinkedList(); // can sore hetrogenous data
        l.add("dog"); 
        l.add("cat"); 
        l.add("tiger"); 
        l.add("mouse"); 
        l.add("Human");
        System.out.println(l); 
        l.addFirst("HORSE");// add at last element
        l.addLast("LION");// add at last
        System.out.println(l); 
        l.getFirst();
        l.getLast();
        l.removeFirst();
        l.removeLast();
        l.
        System.out.println(l); 


    }

    static void HetrogenousLL() {
        // List <Integer> l= new LinkedList<>(); this will store Integer values
        LinkedList l = new LinkedList(); // can sore hetrogenous data
        // add elements
        l.add(100);
        l.add("eshu");
        l.add(100.1);
        l.add(true);
        l.add(null);
        l.add('A');
        System.out.println(l);
        System.out.println(l.size());
        // remove
        l.remove(3);
        System.out.println(l);// after removing
        l.remove(null);
        System.out.println(l);// after removing
        // add element in middle of linked list
        l.add(3, "JAVA");
        System.out.println(l);
        // retrive
        System.out.println(l.get(3));
        // change the existing element
        l.set(3, "JAVA COLLECTION");
        System.out.println(l);
        // contains
        System.out.println(l.contains("java"));
        // is empty?
        System.out.println(l.isEmpty());
        // read data from linked list
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));

        }
        // or
        for (Object e : l) {
            System.out.println(e);

        }
        // or
        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

    }

    static void HomogenousLL() {
        LinkedList<Integer> IntList = new LinkedList<Integer>();
        LinkedList<Integer> IntList2 = new LinkedList<Integer>();
        IntList.add(1);
        IntList.add(2);
        IntList.add(9);
        IntList.add(4);
        IntList.add(55);
        IntList.add(6);

        IntList2.addAll(IntList); // will add a linked list collection to a linked list collection
        System.out.println(IntList2);
        IntList2.removeAll(IntList); // remove the collection
        System.out.println(IntList2);
        //sort()
        IntList2.addAll(IntList); // will add a linked list collection to a linked list collection
        System.out.println("BEFORE SORTING" + IntList2);
        Collections.sort(IntList2);        
        System.out.println("AFTER SORTING" + IntList2);
        //rev sort or order
        Collections.sort(IntList2, Collections.reverseOrder());// will sort then reverse sort
        System.out.println(IntList2);
        //Shuffle
        Collections.shuffle(IntList2);
        System.out.println(IntList2);


        
    }

}
