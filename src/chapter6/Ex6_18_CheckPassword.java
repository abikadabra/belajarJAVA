package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/11/2016.
 *
 * (Check password) Some websites impose certain rules for passwords. Write a
 method that checks whether a string is a valid password. Suppose the password
 rules are as follows:
 ■ A password must have at least eight characters.
 ■ A password consists of only letters and digits.
 ■ A password must contain at least two digits.
 Write a program that prompts the user to enter a password and displays Valid
 Password if the rules are followed or Invalid Password otherwise.


 */
public class Ex6_18_CheckPassword {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input Password : ");
        String password = input.nextLine();

        if (validPassword(password)){
            System.out.println("Password "+password+" is Valid ");
        }else{
            System.out.println("Password "+password +" Invalid ");
        }
    }

    public static boolean validPassword(String pasword){
        if (pasword.length() < 8) {
            return false;
        }
        int countdigit =0;
        int countalpha =0;

        for (int i = 0; i < pasword.length(); i++) {
            char ch = pasword.charAt(i);

            if (number(ch)) {
                countdigit++;
            }else if (alphabet(ch)){
                countalpha++;
            }else {
                return false;
            }
        }
        return (countdigit >= 2 && countalpha >= 2);
    }

    public static boolean number(char ch){
        return (ch >= '0' && ch <= '9');
    }

    public static boolean alphabet(char ch){
        ch = (Character.toUpperCase(ch));
        return (ch >= 'A' && ch <= 'Z');
    }

}
