package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/28/2016.
 */
public class Ex5_29_DisplayCalendars {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("input the year: ");
        int year = input.nextInt();
        System.out.print("input the day: ");
        int day = input.nextInt();

        int dayInmonth = 0;

        for (int month=1;month<=12;month++){
            if (month == 1) {
                System.out.print("January 1, " + year + " is ");
                dayInmonth = 31;

            } else if (month == 2) {
                System.out.print("February 1 " + year + " is ");
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    dayInmonth = 29;
                } else {
                    dayInmonth = 28;
                }
            } else if (month == 3) {
                System.out.print("March 1, " + year + " is ");
                dayInmonth = 31;
            } else if (month == 4) {
                System.out.print("April 1, " + year + " is ");
                dayInmonth = 30;
            } else if (month == 5) {
                System.out.print("May 1, " + year + " is ");
                dayInmonth = 31;
            } else if (month == 6) {
                System.out.print("June 1, " + year + " is ");
                dayInmonth = 30;
            } else if (month == 7) {
                System.out.print("july 1, " + year + " is ");
                dayInmonth = 31;
            } else if (month == 8) {
                System.out.print("august 1, " + year + " is ");
                dayInmonth = 31;
            } else if (month == 9) {
                System.out.print("september 1, " + year + " is ");
                dayInmonth = 30;
            } else if (month == 10) {
                System.out.print("october 1, " + year + " is ");
                dayInmonth = 31;
            } else if (month == 11) {
                System.out.print("november 1, " + year + " is ");
                dayInmonth = 30;
            } else if (month == 12) {
                System.out.print("December 1, " + year + " is ");
                dayInmonth = 31;
            }



            if (day == 0){
                System.out.print("Monday");
            }else if (day == 1){
                System.out.print("Tuesday");
            } else if (day == 2) {
                System.out.print("Wednesday");
            } else if (day == 3) {
                System.out.print("Thursday");
            } else if (day == 4) {
                System.out.print("Friday");
            } else if (day == 5) {
                System.out.print("Saturday");
            } else if (day == 6) {
                System.out.print("Sunday");
            }


            day = (day + dayInmonth) % 7;

            System.out.println("\n-----------------------------------------");
            System.out.println("  Sun mon tue wed thu fri sat      ");

            for (int i = 0; i < day; i++) {
                System.out.print("    ");
            }
            for (int i = 1; i <= dayInmonth; i++)
            {
                if (i < 10) {
                    System.out.print("   " + i);
                } else {
                    System.out.print("  " + i);
                }
                if ((i + day) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("");


            day = (day + dayInmonth) % 7;


        }


    }
}
