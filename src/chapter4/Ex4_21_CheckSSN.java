package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_21_CheckSSN {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN : ");
        String code = input.nextLine();

        if (code.length()==11){
                if (code.charAt(3)== '-' || code.charAt(6)=='-'){
                    System.out.print(code +" is a valid social security number");
            }
            }else {
                System.out.print(code+" is an invalid social security number");
            }

    }
}
