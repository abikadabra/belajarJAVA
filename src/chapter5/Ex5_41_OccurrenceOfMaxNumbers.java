package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/2/2016.
 */
public class Ex5_41_OccurrenceOfMaxNumbers {
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Numbers: ");

            int numbers=0;
            int max = 0;
            int count = 0;

            do {
                if (numbers > max) {
                    max= numbers;
                } else if (numbers == max) {
                    count++;
                }
            } while ((numbers = input.nextInt()) != 0);

            System.out.println("The largest number is "+max);
            System.out.println("The occurrence count of the largest number is "+count);
    }

}
