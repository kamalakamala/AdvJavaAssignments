package com.home.advJavaAssignment;

import java.util.Comparator;

public class Student1 implements Comparable {

    private String name;
    private int number;
    private int marks;


    public Student1(int number, String name, int marks ){
        this.name = name;
        this.number = number;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public int compareTo(Object obj) {

        Student1 std = (Student1)obj;

        if(this.getMarks()>std.getMarks()){
            return -1;
        }else
            return  1;
    }
}
