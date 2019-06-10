package com.home.advJavaAssignment;

public class DynamicStackEntry {
    public static void main(String[] args) {
        Pgm1_DynamicStack nums = new Pgm1_DynamicStack();
        nums.push(10);
        nums.push(11);
        nums.push(12);
        nums.push(13);
        nums.push(14);
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.pop();
        nums.pop();
        nums.show();
        nums.peek();
        nums.show();



    }
}
