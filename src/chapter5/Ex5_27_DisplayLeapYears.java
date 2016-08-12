package chapter5;

/**
 * Created by USER on 7/27/2016.
 */
public class Ex5_27_DisplayLeapYears {
    public static void main(String[]args){

        int count = 0;

        for (int i=101;i<=2100;i++) {
                boolean LeapYear =((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0));


            if (LeapYear){
                count++;
                System.out.print(i+" ");
                if (count % 10 == 0){
                    System.out.println();


                }
            }
        }
    }
}
