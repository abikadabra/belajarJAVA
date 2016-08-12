package chapter5;

import sun.security.util.Length;
import java.util.Scanner;

/**
 * Created by USER on 7/27/2016.
 */
public class Ex5_28_DisplayTheFirstDaysOfEachMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("input the year : ");
        int year = input.nextInt();
        System.out.print("input the day : ");
        int day = input.nextInt() - 1;

        for (int month = 0; month <= 11; month++) {

            String[]nameMonth={"January","February","March","April","May","June","July","August","September","October","November","December"};
            String months31days ="January,March,May,July,August,October,December";
            String months30days ="April,June,September,November";
            String[] nameDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

            if (month == 1) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    day = (day + 29) % 7;
                } else {
                    day = (day + 28) % 7;
                }
            } else if (months31days.contains(nameMonth[month])) {
                day = (day + 31) % 7;

            } else if (months30days.contains(nameMonth[month])) {
                day = (day + 30) % 7;
            }
            System.out.println(nameMonth[month] + " 1 " + year + " is " + nameDay[day]);
        }
    }
}