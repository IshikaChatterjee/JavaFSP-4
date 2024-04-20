// WAP to perform the following operations on stack using arrays 1.push 2.pop 3.display 4.peek

import java.util.EmptyStackException;

public class Stack {
    private int[] stackArray;
    private int top;

    public Stack(int capacity) {
        stackArray = new int[capacity];
        top = -1;
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push element " + data);
            return;
        }
        stackArray[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Elements of the stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        System.out.println("Top element of the stack: " + stack.peek());

        stack.pop();
        stack.pop();

        stack.display();
    }
}
