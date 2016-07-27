package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/20/2016.
 */
public class Ex5_19_DisplayNumbersInAPyramidPattern {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of line: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= n-i;j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < i;j++){
                System.out.printf("%4d",(int)Math.pow(2,j));
            }
            for (int j = i - 2; j >= 0; j--){
                System.out.printf("%4d",(int)Math.pow(2,j));
            }
            System.out.println();
        }

    }
}
