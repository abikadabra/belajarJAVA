package chapter5;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_11_FindNumbersDivisible5And6ButNotBoth {
    public static void main(String[]args){

        int count = 0;
        for(int i=100; i<=200; i++){
            if(i%5 == 0 ^ i%6 == 0){
                System.out.print(i + " ");
                count +=1;

                //print new line character after item 10th and reset the item count
                if(count==10){
                    System.out.println("\n");
                    count = 0;
                }
            }
        }
    }
}
