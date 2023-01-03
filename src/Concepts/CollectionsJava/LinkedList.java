package Concepts.CollectionsJava;

public class LinkedList {
    Node head=null;
    class Node{
        int data;
        Node next;//obj ref
        public Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }


    }
    
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        System.out.println(ls.head);
        ls.head = ls.new Node(10);
        
        
    }
}
