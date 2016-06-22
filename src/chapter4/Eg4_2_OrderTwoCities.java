package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 */
public class Eg4_2_OrderTwoCities {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first city : ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city : ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2)<0){
            System.out.print("The cities in alphabetical order are "+city1+" " +city2);
        }else {
            System.out.print("The cities in alphabetical order are "+city2+" " +city1);
        }

    }
}
