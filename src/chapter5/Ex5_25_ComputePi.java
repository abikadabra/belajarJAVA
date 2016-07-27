package chapter5;

/**
 * Created by USER on 7/27/2016.
 */
public class Ex5_25_ComputePi {
    public static void main(String[]args){
        double pi = 0;

        for (int i = 1; i <= 100000; i++){
            pi = pi + Math.pow(-1,i+1)/(2*i-1);

            if (i == 10000){
                System.out.println("i = 10000 : " +pi*4);
            }else if (i == 20000){
                System.out.println("i = 20000 : " +pi*4);
            }else if (i == 100000){
                System.out.println("i = 100000 : " +pi*4);
            }
        }

    }

}