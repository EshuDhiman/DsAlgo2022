package Concepts.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueCollection {
    //insertiion and deletion can happen from both the side of list
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //null elements are not allowed , not threadsafe
        deque.add(1);
        deque.addFirst(90);
        deque.addLast(87);
        System.out.
        println(deque);
        
    }
    
}
