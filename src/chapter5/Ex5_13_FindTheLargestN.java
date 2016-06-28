package chapter5;



/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_13_FindTheLargestN {
    public static void main(String[]args){

        int n =0;
        while (Math.pow(n,3)<12000){
            n++;
        }
        System.out.println(n-1);
        System.out.println(Math.pow(n,3));
    }
}
