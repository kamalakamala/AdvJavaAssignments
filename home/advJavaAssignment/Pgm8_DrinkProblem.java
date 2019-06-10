package com.home.advJavaAssignment;

import java.util.HashMap;
import java.util.Scanner;

public class Pgm8_DrinkProblem {
    public static void main(String[] args) {
        HashMap<String,Integer> hm =  new HashMap<String, Integer>();
        hm.put("coke",3);
        hm.put("pepsi",2);
        hm.put("sprite",0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter drink to serve: coke|pepsi|sprite");
        String drink = scanner.next();
        if(hm.get(drink) >=1) {
            int count = hm.get(drink);
            hm.put(drink, count-1);
            System.out.println("request served njoy!!! " + (count -1));
        } else{
            System.out.println("Not available");
        }




    }
}
