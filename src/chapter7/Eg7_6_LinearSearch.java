package chapter7;

/**
 * Created by USER on 8/24/2016.
 */
public class Eg7_6_LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4);
        int j = linearSearch(list, -4);
        int k = linearSearch(list, -3);

        System.out.println(linearSearch(list,4));
        System.out.println(linearSearch(list,-4));
        System.out.println(linearSearch(list,-3));
    }
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
