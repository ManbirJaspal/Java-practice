package com.Manbir;

import java.util.Stack;

public class StacksExample {
    //Pushing element on top of the stack
    public static void stack_push(Stack<Integer> stack) {

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    //Popping element from the stack

    public static void stack_Pop(Stack<Integer> stack) {

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    public static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on the top of the stack: " + element);
    }

    public static void stack_Search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        if (pos == -1){
            System.out.println("not found");
        } else {
            System.out.println("found at position: " + pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_Pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_Search(stack, 2);
        stack_Search(stack, 6);
    }
}