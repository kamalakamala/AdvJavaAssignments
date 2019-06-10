package com.home.advJavaAssignment;

public class Student {

    private String name;
    private int number;
    //private int marks;


    public Student(int number, String name ){
        this.name = name;
        this.number = number;
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


}
