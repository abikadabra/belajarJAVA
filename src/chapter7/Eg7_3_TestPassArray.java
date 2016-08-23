package chapter7;

/**
 * Created by USER on 8/23/2016.
 *
 * Listing 7.3 gives another program that shows the difference between passing a primitive data
 type value and an array reference variable to a method.
 The program contains two methods for swapping elements in an array. The first method,
 named swap, fails to swap two int arguments. The second method, named swapFirst-
 TwoInArray, successfully swaps the first two elements in the array argument.
 */


public class Eg7_3_TestPassArray {
    public static void main(String[]args){
        int[]a = {1, 2};

        //swap elements using the swap method
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0]+", "+a[1]+"}");
        swap(a[0], a[1]);

        //swap elements using the swapFirstTwoInArray Method
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {"+a[0]+", "+a[1]+"}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {"+a[0]+", "+a[1]+"}");
    }

    public static void swap(int n1,int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapFirstTwoInArray(int[]array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
