package Concepts.Queue;

import java.util.Arrays;

public class QueueUsingCircularArray {
    static final int size=10;
    public static void main(String[] args) {
        QueueUsingCircularArray cq = new QueueUsingCircularArray(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        System.out.println(cq);
        cq.dequeue();
        cq.enqueue(6);
        System.out.println(cq);
        cq.dequeue();
        cq.enqueue(7);
        System.out.println(cq);
        cq.enqueue(101);
        cq.enqueue(102);
        cq.enqueue(103);
        cq.enqueue(104);
        cq.enqueue(105);
        cq.enqueue(106);
        cq.enqueue(107);
        cq.enqueue(108);
        System.out.println(cq);
        cq.display();


    }
    int front=-1;
    int rear=-1;
    int cap=0; 
    private int[] data;
    QueueUsingCircularArray(){
        this(size);
    }
    QueueUsingCircularArray(int size){
        this.data = new int[size];
    }
    public boolean isempty(){
        if(front==-1&&rear==-1){
            return true;
        }
        else{return false;}
    }
    public boolean isFull(){
        if(cap==data.length){
            return true;
        }
        else{return false;}
    }
    public void display(){
        for (int i = 0; i <data.length; i++) {
            if (data[i]!=0) {
                
                System.out.print(data[i]+"->");
                
            }
            else{
                return;
            }
        }
    }
    public int enqueue(int item){
        if (isFull()) {
            int[] temp= new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        if (cap==0) {
            front++;
            
        }
        rear++;
        rear=rear%data.length;
        data[rear]=item;
        cap++;
        return item;
    }
    @Override
    public String toString() {
        return "QueueUsingCircularArray [front=" + front + ", rear=" + rear + ", cap=" + cap + ", data="
                + Arrays.toString(data) + "data length= " + data.length + " ]";
    }
    public int dequeue(){
        front=front%data.length;
        front++;
        cap--;
        return data[front];
    }
    
}
