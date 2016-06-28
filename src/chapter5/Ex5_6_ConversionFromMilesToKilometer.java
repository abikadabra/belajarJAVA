package chapter5;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_6_ConversionFromMilesToKilometer {
    public static void main(String[]args){

        final int loops = 11;
        System.out.printf("%-15s%8s%10s%-20s%10s","miles","kilometer","\t|\t","\tkilometer","miles\n");

        for (int i = 1; i<loops;i++){
            for (int j = 20;j<66;j++) {

                System.out.printf("%5d%18d\t\t", i, i * 1609);

                System.out.printf("%20d%20.3f\n",j,j*0.621371);
            }
        }
    }
}
