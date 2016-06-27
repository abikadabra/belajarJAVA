package chapter5;

/**
 * Created by USER on 6/27/2016.
 */
public class Eg5_10_FutureTuition {
    public static void main (String[]args){
        double tuition = 10000;
        int year = 0;
        while (tuition < 20000){
            tuition = tuition * 1.07;
            year++;
        }

        System.out.println("Tuition will be doubled in "+year+ "years");
        System.out.printf("Tuition will be $%.2f in %1d years",tuition, year);
    }
}
