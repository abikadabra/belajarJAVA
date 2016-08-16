package chapter6;

/**
 * Created by USER on 8/16/2016.
 */
public class Ex6_29_TwinPrimes {
 public static void main(String[]args){
     for (int i = 3;i < 1000;i++){
         if (isPrime(i) && isPrime(i+2)) {
             System.out.printf("(%d,%d)\n",i,i+2);
         }
     }
 }


    public static boolean isPrime(int prime){
        if (prime < 2) return false;
        for (int i = 2; i < prime / 2; i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }

}
