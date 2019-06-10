package com.home.advJavaAssignment;

public class Prgm9_3NumberReverse {

    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 7, 0, 3, 1, 5, 8, 4, 2 ,10,13};
        int k = 4;
        int[] oparr = new int[arr.length];
        int pos = 0;

        for (int i = 0; i < arr.length; i += k) {
            int startPos = i + k - 1;
            if (startPos > arr.length - 1) {
                for (int j = i; j < arr.length; j++) {
                    oparr[pos] = arr[j];
                    pos++;
                }

            } else {
                for (int j = startPos; j >= i; j--) {
                    oparr[pos] = arr[j];
                    pos++;
                }
            }

        }
        for (int i = 0; i < oparr.length; i++) {
            System.out.print(oparr[i] + " ");
        }
    }
}
