package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/15/2016.
 */
public class Ex6_24_DisplayCurrentDateAndTime {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter offset to GMT : ");
        int gmt = input.nextInt();

        currentTimes(gmt);
    }

    public static int currentTimes(int gmt){

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        long currentHour = (int)(totalHours % 24)+gmt;
        long totalDays = (totalHours / 24) + 1;
        int currentYear = (int)(totalDays / 365) + 1970;

        if (currentHour >= 24) {
            totalDays = totalDays + 1;
        }

        long daysCurrentYear = (totalDays - numberLeapYear(currentYear)) % 365;
        if (currentHour > 0) {
            daysCurrentYear++;
        }

        int currentMonth = getDaysOnMonth(currentYear, (int) daysCurrentYear);

        String month = getMonthName(currentMonth);

        int dayCurrentMonth =  getNumOfDaysToReachThatMonth(currentYear, currentMonth);

        int startDay = getStartDay(currentYear, currentMonth);
        int today = (int) daysCurrentYear - dayCurrentMonth;
        String dayWeek = nameWeek( ((startDay + today) % 7));

        System.out.print("Today is " + dayWeek + " " + month + " " + today +", " + currentYear);
        System.out.println("\nCurrent time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

        return gmt;
    }

    public static String nameWeek(int dayWeek) {

        switch (dayWeek) {
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            case 1: return "Sunday";
            default: return null;
        }
    }


    public static int numberLeapYear(long year){
        int count = 0;
        for (int i = 1970; i <= year; i++) {
            if (isLeapYear(i)) {
                count++;
            }
        }
        return count;
    }


    public static int getDaysOnMonth(int year,int days){
        int countDays=0;
        for (int i = 1; i <= 12; i++) {
            countDays += getNumberOfDaysInMonth(year, i);

            if (countDays > days) {
                return i;
            }
        }
        return 12;
    }



    public static String getMonthName(int month){
        String monthName = "";
        switch (month){
            case 1: monthName = "January";break;
            case 2: monthName = "February";break;
            case 3: monthName = "March";break;
            case 4: monthName = "April";break;
            case 5: monthName = "May";break;
            case 6: monthName = "June";break;
            case 7: monthName = "July";break;
            case 8: monthName = "August";break;
            case 9: monthName = "September";break;
            case 10: monthName = "October";break;
            case 11: monthName = "November";break;
            case 12: monthName = "December";
        }
        return monthName;
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for (int i = 1800;i<year;i++) {
            if (isLeapYear(i)) {
                total = total + 366;
            } else {
                total = total + 365;
            }
        }

        for (int i = 1; i < month; i++) {
            total = total + getNumberOfDaysInMonth(year, i);
        }
        return total;
    }


    public static int getNumberOfDaysInMonth(int year, int month){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 0;
    }
    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getNumOfDaysToReachThatMonth(int year, int month) {
        int dayCount = 0;
        for (int i = 1; i < month; i++) {

            dayCount += getNumberOfDaysInMonth(year, i);


        }
        return dayCount;
    }
}