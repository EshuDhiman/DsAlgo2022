package Concepts.LinkedList;

import java.util.Scanner;

class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.size = 0  ;
    }
    public void insertAtFirst(int value){
        Node x = new Node(value);
        x.next = head;
        head = x;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertAtLast(int value){
        if(tail==null){
            Scanner sc = new Scanner(System.in);
            System.out.println("list is empty first insert a single value ");
            System.out.println("value = ");
            int temp=sc.nextInt();
            insertAtFirst(temp);
            size++;
        }
        Node y = new Node(value);
        tail.next=y;
        tail = y;
        // tail.next=null;
        size++;

        
    }
    public void insertAtIndex(int value,int index){
        if (index==0) {
            insertAtFirst(value);
            return;
            
        }
        if (index==size) {
            insertAtLast(value);
            return;
        }
        Node x = new Node(value);
        Node temp=head;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next; 
            
        }
        x.next=temp.next;
        temp.next=x;
        size++;
    }
    public void deleteFirst(){
        if (head==tail) {
            head=null;
            tail=null;
            
        }
        head= head.next;
        size--;
    }
    public void deleteLast(){
        if (tail==head) {
            deleteFirst();
            
        }
        Node temp=head;
        for (int i = 0; i < size-2 ; i++) {
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
    }
    public void deleteAt(int index){
        Node temp=head;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;

        size--;
    }
    public void displayLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.next; 
        }
        System.out.println("Size = "+ size);
    }


    private class Node {

        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;

        }

       public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }

}
 public class LinkedListMain{
    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();
        ll.insertAtFirst(10);
        ll.insertAtFirst(11);
        ll.insertAtFirst(12);
        ll.insertAtLast(97);
        ll.insertAtLast(77);
        ll.insertAtIndex(10000, 0);
        ll.displayLL();
        ll.deleteFirst();
        ll.displayLL();
        ll.deleteLast();
        ll.displayLL();
        ll.deleteAt(3);
        ll.displayLL();
    }
 }
