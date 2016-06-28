package chapter5;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_12_FindTheSmallestN {
    public static void main(String[]args){
    int n= 1;
        while (Math.pow(n,2)<=12000){
            n++;
        }
        System.out.println("n is "+n);
        System.out.println("n2 is "+Math.pow(n,2));
    }
}
