package chapter6;

/**
 * Created by USER on 8/11/2016.
 */
public class Ex6_16_NumberOfDaysInAYear {
    public static void main(String[]args){
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year+ " is " +numberOfDaysInAYear(year)+" days");
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if (Leapyear(year)) {return 366;} else {return 365;}

    }

    public static boolean Leapyear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }


}
