package com.bridgelabz;

public class Primefactor {
    public static void main(String[] args) {

        // INITIALIZATION
        int n;
        Utility u = new Utility();

        // INPUT DATA
        System.out.print("Enter a Number : ");
        n = u.inputInteger();

        // COMPUTATION
        System.out.print("The Prime Factors of " + n + " are : ");

        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            } else
                i++;
        }
        System.out.println(" ");
    }
}

