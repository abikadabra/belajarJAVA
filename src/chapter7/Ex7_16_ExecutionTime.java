package chapter7;

/**
 * Created by USER on 8/31/2016.
 *
 * (Execution time) Write a program that randomly generates an array of 100,000
 integers and a key. Estimate the execution time of invoking the linearSearch
 method in Listing 7.6. Sort the array and estimate the execution time of invoking
 the binarySearch method in Listing 7.7. You can use the following code
 template to obtain the execution time:
 long startTime = System.currentTimeMillis();
 perform the task;
 long endTime = System.currentTimeMillis();
 long executionTime = endTime - startTime;
 */


public class Ex7_16_ExecutionTime {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = intRandom();
        }

        int key = intRandom();

        long startTime = System.currentTimeMillis();
        int time = binarySearch(array, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("key :" + key);
        System.out.println("execution time binary search :" + executionTime);


        startTime = System.currentTimeMillis();
        time = linearSearch(array, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("key :" + key);
        System.out.println("execution time linear search :" + executionTime + "\n");

    }


    public static int intRandom() {
        return (int) (Math.random() * 100000 + 1);
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid])
                high = mid - 1;
            else if (key == array[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -low - 1;
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
}