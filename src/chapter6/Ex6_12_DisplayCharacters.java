package chapter6;

/**
 * Created by USER on 8/10/2016.
 */
public class Ex6_12_DisplayCharacters {
    public static void main(String []args){
        printChars('1','Z',10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        for (int i = 1; ch1 <= ch2; i++, ch1++) {
            System.out.print(ch1+" ");
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }
}
