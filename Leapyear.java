package com.bridgelabz;

public class Leapyear {
    public static void main(String[] args) {

        // INITIALIZATION
        int year, n;
        String str;
        Utility u = new Utility();

        // INPUT DATA
        System.out.print("enter the year: ");
        str = u.inputString();
        year = Integer.parseInt(str);

        // COMPUTE THE LENGTH
        n = str.length();

        // CHECK LENGTH CONDITION
        if (n != 4) {
            System.out.println("enter year as 4 digit number");
            return;
        }

        // COMPUTATION
        else {
            if (year % 400 == 0 && year % 100 == 0)
                System.out.println("year " + year + " is a leap year");
            else if (year % 100 != 0 && year % 4 == 0)
                System.out.println("year " + year + " is a leap year");
            else
                System.out.println("year " + year + " is not a leap year");
        }

    }

}


