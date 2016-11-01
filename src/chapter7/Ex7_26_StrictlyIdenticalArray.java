package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 11/1/2016.
 *
 * (Strictly identical arrays) The arrays list1 and list2 are strictly identical
 if their corresponding elements are equal. Write a method that returns true if
 list1 and list2 are strictly identical, using the following header:
 public static boolean equals(int[] list1, int[] list2)
 Write a test program that prompts the user to enter two lists of integers and displays
 whether the two are strictly identical. Here are the sample runs. Note that
 the first number in the input indicates the number of the elements in the list. This
 number is not part of the list.
 */
public class Ex7_26_StrictlyIdenticalArray {
    public static void main(String[] args) {
        System.out.print("input list 1: ");
        int[] list1 = inputList();
        System.out.print("input list 2: ");
        int[] list2 = inputList();

        if (equals(list1,list2)) {
            System.out.print("Two List are strictly identical");
        } else if (!equals(list1, list2)) {
            System.out.print("Two list are not strictly identical");
        }
    }

    public static int[] inputList() {
        int[] list = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < 6; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}