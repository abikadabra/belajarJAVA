package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/11/2016.
 */
public class Ex6_17_DisplayMatrixOf0sAnd1s {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);
    }

    public static void printMatrix(int n){
        for (int i = 0;i < n;i++){
            for (int k = 1; k <= n; k++) {
                System.out.printf("%s%d"," ",(int) (Math.random()*2));
            }
            System.out.println();
        }
    }
}
