package chapter6;

/**
 * Created by USER on 8/11/2016.
 */
public class Ex6_14_EstimatePi {
    public static void main(String []args){
        System.out.printf("%s%15s\n","i","m(i)");
        System.out.print("--------------------\n");
        for (int i = 1; i <= 901; i = i + 100) {
            System.out.printf("%d%15.4f\n", i, estimatePi(i));
        }
    }

    public static double estimatePi(double n){

        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum = sum + 4*(Math.pow(-1,i+1)/(2*i-1));
        }
        return sum;
    }
}

