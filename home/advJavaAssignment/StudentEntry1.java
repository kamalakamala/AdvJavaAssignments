package com.home.advJavaAssignment;

import java.util.TreeSet;

public class StudentEntry1 {
    public static void main(String[] args) {
        TreeSet<Student1> ts = new TreeSet<Student1>();
        Student1 std1 = new Student1(1, "Srini",1000);
        Student1 std2 = new Student1(2, "kamala",900);
        Student1 std3 = new Student1(3, "vasu",800);
        Student1 std4 = new Student1(4, "Abhi",900);
        Student1 std5 = new Student1(5, "ani",1000);

        ts.add(std1);
        ts.add(std2);
        ts.add(std3);
        ts.add(std4);
        ts.add(std5);
        int i=0;
        int prevmarks =0;
        for(Student1 std:ts){
            if(prevmarks > std.getMarks() || i == 0){
                i++;
                prevmarks = std.getMarks();
            }
            System.out.println("Student Awarded " +i + "Rank" +"with marks" +std.getMarks());

        }


    }

}
