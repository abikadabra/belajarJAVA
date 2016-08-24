package chapter7;

/**
 * Created by USER on 8/24/2016.
 */
public class Eg7_7_BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarySearch(list, 2);
        int j = binarySearch(list, 11);
        int k = binarySearch(list, 12);
        int l = binarySearch(list, 1);
        int m = binarySearch(list, 3);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

    }


    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
              } else if (key == list[mid]) {
                 return mid;

            } else {
                low = mid + 1;
            }

        }
        return -low -1;
    }
}