package Concepts.Stacks;
public class LLStacks {
    public static void main(String[] args) {
        MainStack stack = new MainStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.display();
        
    }


    
}
class MainStack{
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node top; 
    int size=0;
    public void push(int data){
        Node node = new Node(data);
        node.next=top; //stack are closed form one side and insertion happens from top , so for example new node n1 is added into the stack n1 should be the top node and when n2 is added n2 should be the head or top node and link list starts from the head then according to it if we want to add a new node that node should be the head node and head nodes next should be head 
        top=node;
        size++;
        System.out.println("top node value = " + top.data);
        if(node.next!=null){
            System.out.println(" node.next value = " + node.next.data);
        }
        else{
            System.out.println(" node.next value = null ");
            
        }
         }
    @Override
    public String toString() {
        return "MainStack [top=" + top + ", size=" + size + "]";
    }
    public void pop(){
        top=top.next;
    }
    public void display(){
        Node temp = top;
        for (int i = 0; i < size-1; i++) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public int peek(){
        System.out.println(top.data);
        return top.data;
    }

}
