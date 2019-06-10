package com.home.advJavaAssignment;

import java.util.Scanner;
import java.util.Vector;

public class Pgm6_Vector {
    public static void main(String[] args) {
        int input =5;
        Vector<Character> v = new Vector<Character>();
        v.add('T');
        v.add('e');
        v.add('k');
        v.add('a');
        v.add('r');
        v.add('c');
        v.add('h');
        System.out.println(v);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input");
        int n = scanner.nextInt();
        for(int i = 0; i < n ; i++){
            v.add(3,'Z');
        }
        System.out.println(v);

        for(int i = 0; i < n ; i++){
            v.remove(6);
        }
        System.out.println(v);






    }
}
