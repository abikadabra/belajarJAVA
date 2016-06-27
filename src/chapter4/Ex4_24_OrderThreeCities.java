package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_24_OrderThreeCities {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.printf("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.printf("Enter the third city: ");
        String city3 = input.nextLine();

        if (city1.compareTo(city2)<0 && city1.compareTo(city3)<0){
            System.out.println("1The cities in alphabetical order are "+city1+" "+city2+" "+city3);
        }else if(city2.compareTo(city1)<0 && city2.compareTo(city3)<0){
            System.out.println("2The cities in alphabetical order are "+city2+" "+city3+" "+city1);
        }else if(city3.compareTo(city1)<0 && city3.compareTo(city2)<0){
            System.out.println("3The cities in alphabetical order are "+city3+" "+city1+" "+city2);
        }

    }
}
