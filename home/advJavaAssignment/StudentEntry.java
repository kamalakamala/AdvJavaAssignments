package com.home.advJavaAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentEntry {
    public static void main(String[] args) {
        TreeMap<Integer, Student> tm= new TreeMap<Integer, Student>();
        Student std1 = new Student(1, "Srini");
        Student std2 = new Student(2, "kamala");
        Student std3 = new Student(3, "vasu");
        Student std4 = new Student(4, "Abhi");
        Student std5 = new Student(5, "ani");

        tm.put(1, std1);
        tm.put(2, std2);
        tm.put(3, std3);
        tm.put(4,std4);
        tm.put(5, std5);

        for(Map.Entry<Integer, Student> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " -" + entry.getValue().getName());
        }
    }
}
