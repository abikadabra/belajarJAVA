package chapter5;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_4_ConversionFromMilesToKilometers {
    public static void main(String[]args){

        final int loop = 10;
        double miles = 1609;


        System.out.printf("%9%12s\n","Miles","Kilometers");
        for (int i = 1;i <=loop;i++){
            System.out.printf("%-9d%15.1f\n",i,i*miles);
        }
    }
}
