package chapter6;

/**
 * Created by USER on 8/8/2016.
 */
public class Eg6_4_Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call,x is " + x);
        increment(x);
        System.out.println("After the call,x is " + x);
    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " + n);
    }
}
