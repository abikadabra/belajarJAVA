package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/16/2016.
 */
public class Ex6_25_ConvertMillisecondToHoursMinutesAndSecond {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a millisecond : ");
            long m = input.nextLong();

            System.out.println(convertMillis(m));
        }

        public static String convertMillis(long millis) {

            long totalSeconds = millis / 1000;
            long totalMinutes = totalSeconds / 60;
            long totalHours = totalMinutes / 60;

            StringBuilder s = new StringBuilder();
            s.append(totalHours + ":");
            s.append(totalMinutes % 60 + ":");
            s.append(totalSeconds % 60);

            return s.toString();
    }
}
