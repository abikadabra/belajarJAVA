package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_17_DisplayPyramid {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number lines: ");
        int number = input.nextInt();
        int i =0;

        for (i = 1;i<=number;i++){
                for (int j = i;j<=number;j++){
                    System.out.printf("  ");
                }
                for (int j = i;j>=1;j--){
                    System.out.printf(j+" ");
                }
                for (int j= 2;j<= i;j++){
                System.out.printf(j+" ");
                 }

            System.out.printf("\n");



        }
    }
}
