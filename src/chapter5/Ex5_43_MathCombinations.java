package chapter5;

/**
 * Created by USER on 8/2/2016.
 */
public class Ex5_43_MathCombinations {
    public static void main(String[]args){

        int count = 0;

        for (int i = 1; i <= 7; i++) {
            for (int k = i + 1; k <= 7; k++) {
                System.out.printf("%d%5d\n", i, k);
                count++;
                }
            }

        System.out.println("The total number of all combination is : "+count);
    }
}
