package com.home.advJavaAssignment;

public class Prgm5_Monetary {

    public static void main(String[] args) {

        int amt = 288;

        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickles =0;
        int cents = 0;

        while( amt > 0) {

            if (amt >= 100) {
                dollars = amt /100;
                amt = amt %100;
            }
            if(amt >= 25 ) {
                quarters = amt/ 25;
                amt = amt%25;
            }
            if(amt >= 10) {
                dimes = amt/10;
                amt = amt % 10;
            }
            if(amt >= 5) {
                nickles = amt/5;
                amt = amt % 5;
            }
            cents = amt;
            amt = 0;

        }

        System.out.println( "Smallest possible number of coins equaling amount is "+ (dollars + quarters + dimes+ nickles+ cents));

    }
}
