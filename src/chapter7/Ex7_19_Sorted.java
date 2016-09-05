package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 9/5/2016.
 */
public class Ex7_19_Sorted {
    public static void main(String[] args) {
        int[] num = new int[howMuchNumber()];
        inputNumber(num);
        isSorted(num);
        printResult(num);
    }

    public static int howMuchNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        return input.nextInt();
    }

    public static void inputNumber(int[]num) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        for (int i = 0; i < num.length; i++) {
            num[i]=input.nextInt();
        }
    }
    public static boolean isSorted(int[] list){
        int n = list.length -1;

        for (int i = 0; i < n; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printResult(int[] num) {
        String s = "not";
        if (isSorted(num)) {
            s = "already";
        }
        System.out.println("The list is "+s+" sorted");
    }
}
