package com.company;

import java.util.Scanner;

public class date_validation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // reading date
        System.out.print("Enter a date (mm/dd/yyyy): ");
        String date = sc.next();
        System.out.println();


        // checking length of the date
        // length of date must be equal to 10
        // otherwise date is invalid
        if (date.length() != 10) {
            if (date.length() < 10){
                System.out.println("Not a valid date");
                System.out.print("Too few characters in the date.");
                System.exit(-1);
            }
            else{
                System.out.println("Not a valid date");
                System.out.print("Too many characters in the date.");
                System.exit(-1);
            }
        }


        // splitting date into array to check if the '/' are on correct positions, i.e 3rd and 6th
        String[] dateArr = date.split("");
        if (!dateArr[2].equals("/") || !dateArr[5].equals("/")){
            System.out.println("Not a valid date");
            System.out.print("Incorrect format");
            System.exit(-1);
        }


        // separating the month, day and year from the date and storing in separate variables
        String[] parts = date.split("/");
        String month = parts[0];
        String day = parts[1];
        String year = parts[2];


        // check if month is valid, i.e between 1 and 12, inclusive
        if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
            System.out.println("Not a valid date");
            System.out.print("Month not valid");
            System.exit(-1);
        }


        // check if days are in valid format, i.e between 1 and 28, 29, 30, or 31
        if (Integer.parseInt(day) < 1) {
            System.out.println("Not a valid date");
            System.out.print("Day not valid");
            System.exit(-1);
        }
        else {

            // for month with 31 days
            if (Integer.parseInt(month) == 1 || Integer.parseInt(month) == 3 || Integer.parseInt(month) == 5 || Integer.parseInt(month) == 7 || Integer.parseInt(month) == 8 || Integer.parseInt(month) == 10 || Integer.parseInt(month) == 12 && Integer.parseInt(day) > 31) {
                System.out.println("Not a valid date");
                System.out.print("Day not valid");
                System.exit(-1);
            }

            // for month with 30 days
            else if (Integer.parseInt(month) == 4 || Integer.parseInt(month) == 6 || Integer.parseInt(month) == 9 || Integer.parseInt(month) == 11 && Integer.parseInt(day) > 30) {
                System.out.println("Not a valid date");
                System.out.print("Day not valid");
                System.exit(-1);
            }

            // for february
            else {

                // check if year is leap year
                if((Integer.parseInt(year) % 4 == 0 && Integer.parseInt(year) % 100 != 0) || Integer.parseInt(year) % 400 == 0 ) {
                    if (Integer.parseInt(day) > 29) {
                        System.out.println("Not a valid date");
                        System.out.print("Day not valid");
                        System.exit(-1);
                    }
                }
                else {
                    if (Integer.parseInt(day) > 28) {
                        System.out.println("Not a valid date");
                        System.out.print("Day not valid");
                        System.exit(-1);
                    }
                }
            }
        }


        // if all the above task are passed prnt date is valid
        System.out.println("Valid date");
        System.exit(0);
    }
}