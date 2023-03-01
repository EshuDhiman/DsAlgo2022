package Concepts.Stacks;

import java.util.Arrays;

public class CustomArrayStack {
    private static final int DEFAULT_SIZE = 10; // intializing the default size of the array

    @Override
    public String toString() {
        return "data = " + Arrays.toString(data) + "";
    }

    public static void main(String[] args) {
        CustomArrayStack stack = new CustomArrayStack(); 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(50);
        stack.push(50);
        stack.push(50);
        stack.push(50);
        stack.push(50);
        stack.push(50);
        stack.push(50);
        stack.push(50);

        System.out.println(stack);
        System.out.println("last element");
        System.out.println(stack.lastElement());
        System.out.println("poped");
        System.out.println(stack.pop());
        System.out.println("peak elemenet");

        System.out.println(stack.peek());
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());
        stack.isEmpty();

    }

    // ptr is the top element , it acts as index , it is at -1 because initialy the
    // list is empty and index==-1 or top is not present
    int ptr = -1;

    // declaring array coz queues are nothing but array implemantation of queue
    // methodology
    protected int[] data;

    CustomArrayStack() {
        this(DEFAULT_SIZE); // when object will of customStack class is created if not passed the size to
                            // its constructor the default size is insitiated
        // data = new int[DEFAULT_SIZE]; another way of doing the same thing
    }

    CustomArrayStack(int size) {
        this.data = new int[size]; // custom size
    }

    // fucntion to add element in stack , element added by this method will be
    // always at the top
    // recives an item of integer type and returns true if the element is added to
    // the stack succesfull
    public boolean push(int item ) {
        // condition to check if satck-> is full will return true of false , if returned
        // true then if block is executed, if returned false if block is not executed
        // and new element will be added at the top
        if (isFull()) {
          return false;
        }
        ptr++;
        // when the fucntion is called we increase the ptr by 1 because the element to
        // be added in the stack at 0th index -1+0=0 , then 1st index ptr = 0+1=1st
        // index and so on ,
        // every time the fucntion is called ptr will be increased to +1
        data[ptr] = item; // ptr act as index here item will be placed at ptr==index
        return true; // returns true if item inserted successfully
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("EMPTY STACK");
            return -1;

        }
        int removed = data[ptr];
        data[ptr] = 0;
        ptr--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("EMPTY STACK");
            return -1;
        }
        int peekElemenet = data[ptr];
        return peekElemenet;
    }

    public int lastElement() {
        if (isEmpty()) {
            System.out.println("EMPTY STACK");
            return -1;
        }
        int last = data[0];
        return last;
    }

    // isFull returns true if stack is full or false if stack is not full
    public boolean isFull() {
        return ptr == data.length - 1; // data.length returns the size of the array , subtracting 1 from it will give
                                       // us last index value so if prt==last index value then the stack is full and it
                                       // will return true
    }

    public boolean isEmpty() {
        return ptr == -1; // returns true if ptr=-1 which means there is no element in the list coz ptr is
                          // at -1 index and index starts form 0
    }

}
