package com.home.advJavaAssignment;

import java.util.Arrays;

public class Pgm7_MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = new int[10];
        int arr2 [] = {3,5,7,8};
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=4;
        arr1[3]=6;
        arr1[4]=9;
        arr1[5]=10;
        int j =0;
        for( int i=0; i<arr1.length;i++){
            if(arr1[i] ==0){
                arr1[i]=arr2[j];
                j++;
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }



    }
}
