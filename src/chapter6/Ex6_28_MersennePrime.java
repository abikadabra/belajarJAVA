package chapter6;

/**
 * Created by USER on 8/16/2016.
 */
public class Ex6_28_MersennePrime {
    public static void main(String[]args){
        for (int i = 2;i <=31;i++) {
            if (isPrime(i)){
                System.out.printf("%d\t%d\n",i,mersennePrime(i));
            }
        }
    }

    public static boolean isPrime(int i){
        for (int k = 2; k <= i / 2; k++) {
            if (i % k == 0){
                return false;
            }
        }
        return true;
    }

    public static int mersennePrime(int m){
        return (int)Math.pow(2,m)-1;
    }
}
