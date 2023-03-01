package Questions.LinkedList;

import javafx.geometry.Side;

class ll{
    Node head;
    Node tail;
    int size=0;
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
void addNode(int index , int data){
    Node node = new Node(data);
    if(head==null){
        head=node;
        tail=head;
        size++;
        return;
    }
    Node temp = head;
    for (int i =0; i <index-1; i++) {
        temp = temp.next;
        
    }
    temp.prev=node;
    node.prev=temp.prev;
    node.next=temp;
    size++;
}
void display(){
    Node temp=head;
    for(int i=1;i<size;i++){
        System.out.print(temp.data+ "->");
        temp=temp.next;
    }
}
Node deleteNode(Node head,int x)
    {
	   // if(head==null){
	   //     return head;
	   // }
	    if(x==1){
	        head=head.next;
	        return head;
	    }
	    Node temp=head;
	    for(int i=1 ; i<x;i++){
	        temp=temp.next;
	    }
	    temp.prev.next=temp.next;
	    temp.next.prev=temp.prev;
	    temp=null;
	    return head;
    }
}


public class DeleteANodeInDoublyLL {

public static void main(String[] args) {
    ll obj = new ll();
    obj.addNode(1, 1);
    obj.addNode(2, 3);
    obj.addNode(3, 4);
    obj.display();
}
}
