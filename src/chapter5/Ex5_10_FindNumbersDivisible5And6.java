package chapter5;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_10_FindNumbersDivisible5And6 {
    public static void main(String []args){

        System.out.printf("%-10s%20s","divisible by 5","divisible by 6");

        for (int i = 99;i<1001;i++) {
            if (i % 5 == 0) {
               System.out.printf("\n%-10d",i);
                }
            if (i % 6 == 0) {
                 System.out.printf("%13d\n",i);
            }
        }


    }
}
