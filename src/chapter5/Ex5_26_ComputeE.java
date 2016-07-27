package chapter5;

/**
 * Created by USER on 7/27/2016.
 */
public class Ex5_26_ComputeE {
    public static void main(String[]args){
        double e = 1;
        double d = 1;

        for (int i=1;i <= 100000;i++){

            e= e+ d;
            d= d/i;

        }
        for (int j=10000;j<=100000;j+=10000){
            System.out.println("i= "+j+" : "+e);
        }
    }
}
