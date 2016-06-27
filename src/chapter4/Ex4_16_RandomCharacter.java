package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_16_RandomCharacter {
    public static void main(String[]args){

        int rand = (int) (65 + Math.random() * 26);
        char karakter = (char) rand;

        System.out.println("The random letter is " + karakter);
    }
}
