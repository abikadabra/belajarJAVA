package chapter6;

/**
 * Created by USER on 8/22/2016.
 */
public class Ex6_33_CurrentDateAndTime {
    public static void main(String[]args){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = (int)(totalMinutes % 60);
        long totalHour = totalMinutes / 60;
        long currentHour = (int)(totalHour % 24)+7;
        long totalDays = (totalHour/24)+1;
        int currentYear = (int)(totalDays/365)+1970;


        long daysCurrentYear = (totalDays - numberLeapYear(currentYear)) % 365;
        if (currentHour > 0){
            daysCurrentYear++;
        }

        int currentMonth = getDaysOnMonth(currentYear,(int)daysCurrentYear);

        String month = getMonthName(currentMonth);
        int dayCurrentMonth = getNumOfDaysToReachThatMonth(currentYear,currentMonth);
        int today = (int) daysCurrentYear - dayCurrentMonth;

        System.out.print("Current date and time is " + month +" "+today +", " + currentYear+ " "+currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }

    public static int numberLeapYear(long year){
        int count = 0;
        for (int i = 1970;i<= year;i++){
            if (isLeapYear(i)){
                count++;
            }
        }
        return count;
    }

    public static int getDaysOnMonth(int year,int days) {
        int countDays = 0;
        for (int i=1;i<=12;i++) {
            countDays = countDays + getNumberOfDaysInMonth(year,i);
            if (countDays > days){
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

    public static int getNumOfDaysToReachThatMonth(int year, int month){
        int dayCount = 0;
        for (int i = 1; i < month; i++) {

            dayCount += getNumberOfDaysInMonth(year, i);


        }
        return dayCount;
    }


    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
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

}
