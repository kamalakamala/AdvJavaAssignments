package com.home.advJavaAssignment;

import java.util.*;

public class Pgm4_SortElementsFrequency {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        int arr[] = {5, 2, 3, 8,4,4, 7,7,7, 2, 5, 2, 3};

        for(int i =0; i< arr.length; i++) {
            if(hm.get(arr[i]) != null) { //exists
                int existingCount = hm.get(arr[i]);
                hm.put(arr[i], existingCount+1);
            } else {
                hm.put(arr[i], 1);
            }
                    
        }

        System.out.println("Map with out sorting ");
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            for(int i=0; i< entry.getValue(); i++) {
                System.out.print(entry.getKey() + ", ");
            }
        }

        System.out.println();
        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 ) {
                if(o1.getValue() > o2.getValue()) {
                    return -1;
                }else{
                    return 1;
                }
            }
        });

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for(Map.Entry<Integer, Integer> entry : list) {
            map.put(entry.getKey(), entry.getValue());
        }

        System.out.println("after sorting ");
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            for(int i=0; i< entry.getValue(); i++) {
                System.out.print(entry.getKey() + ", ");
            }
        }

    }
}
