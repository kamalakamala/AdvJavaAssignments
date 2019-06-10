package com.home.advJavaAssignment;

public class Pgm1_DynamicStack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (size() == capacity) {
            expand();
            stack[top] = data;
            top++;
        } else {
            stack[top] = data;
            top++;
        }
    }

    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    public int peek() {
        int data;
        data = stack[top - 1];
        return data;
    }

    private void shrink() {
        int length = size();
        if (length <= (capacity / 2) / 2) {
            capacity = capacity / 2;
            int newstack[] = new int[capacity / 2];
            System.arraycopy(stack, 0, newstack, 0, length);
            stack = newstack;
            capacity = capacity / 2;


        }
    }

    private void expand() {
        int length = size();
        int newstack[] = new int[capacity * 2];
        System.arraycopy(stack, 0, newstack, 0, length);
        stack = newstack;
        capacity *= 2;

    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show(){
        for(int n :stack){
            System.out.print(n +" ");
        }
        System.out.println();
    }


}

