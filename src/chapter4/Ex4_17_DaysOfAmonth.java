package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_17_DaysOfAmonth {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next();

        int day = 0;
        switch (month) {
            case "Feb":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    day = 29;
                    break;
                }
                day = 28;
                break;

            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                day = 30;
                break;

            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                day = 31;
                break;

            default:
                System.out.println("Invalid month.");
                System.exit(0);

        }

        System.out.println(month + " " + year + " has " + day+ " days");


    }
}
