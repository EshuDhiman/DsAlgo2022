package Concepts.Queue;

import java.util.Arrays;

public class CustomQueue {
    public static void main(String[] args) {
        CustomQueue que = new CustomQueue(10);
        // System.out.println(que);
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        System.out.println(que);
        // que.remove();
        que.remove();
        System.out.println(que);
        

    }
    int[] data;
    int ptr=-1;
    public CustomQueue(int size){
        this.data=new int[size];
    }
    public boolean isEmpty(){
        if (ptr==-1) {
            return true;
        }
        else{
            return false;
        }

    }
    public boolean isFull(){
        if(ptr==data.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean add(int item){
        if (isFull()) {
            return false;
            
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    @Override
    public String toString() {
        return "CustomQueue [data=" + Arrays.toString(data) + ", ptr=" + ptr + "]";
    }


    public boolean remove(){
        if (isEmpty()) { 
            return false;
        }
        for (int i = 1; i < ptr; i++) { // for loop starts from 1 coz we need to replace values of 0th index to i+1 index left shift me - right shift me +
            data[i-1]=data[i]; // shift elements by 1 to left
        }
        ptr--;
        return true;
    }
    
}
 