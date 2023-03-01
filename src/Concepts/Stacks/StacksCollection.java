package Concepts.Stacks;

import java.util.Stack;

public class StacksCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // stack internaly is an array its stack becouse how its implemented
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(90);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        // System.out.println(stack.pop()); // removing from empty stack will give u error

    
    }
    
}
