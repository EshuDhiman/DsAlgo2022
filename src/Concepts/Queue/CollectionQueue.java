package Concepts.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); 
        // queue is an interface which internally implements linkedList
        queue.add(7);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        System.out.println(queue.peek());// peek element first element
        queue.add(9);
        System.out.println(queue);
        queue.remove();
        queue.remove();
        queue.a
        queue.remove();
        System.out.println(queue);

    }
    
}
