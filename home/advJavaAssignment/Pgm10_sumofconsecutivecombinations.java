package com.home.advJavaAssignment;

import java.util.Scanner;

public class Pgm10_sumofconsecutivecombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int start = 0;
        int end = (num + 1) / 2;

        while (start < end) {
            int sum = 0;

            for (int i = start; i <= end; i++) {
                sum = sum + i;
                if (sum == num) {
                    for (int j = start; j <= i; j++) {
                        System.out.print(j + " ");

                    }
                    System.out.println();
                    break;
                }
                if (sum > num) {
                    break;
                }
            }
           // sum =0;
            start++;
        }
    }
}
