package chapter4;


/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_25_GenerateVehicalPlateNumber {
    public static void main(String[]args){

        int rand = (int) (65 + Math.random()*26);
        char ch1 = (char) rand;
        int rand1 = (int) (65+ Math.random()*26);
        char ch2 = (char) rand1;
        int rand2 = (int) (65+ Math.random()*26);
        char ch3 = (char) rand2;

        int randangka1 = (int) (Math.random()*9);
        int angka1 = (char) randangka1;
        int randangka2 = (int) (Math.random()*9);
        int angka2 = (char) randangka2;
        int randangka3 = (int) (Math.random()*9);
        int angka3 = (char) randangka3;

        System.out.println("Vehical plate numbers " +ch1+" "+ch2+" "+ch3+" "+angka1+" "+angka2+" "+angka3);
    }
}
