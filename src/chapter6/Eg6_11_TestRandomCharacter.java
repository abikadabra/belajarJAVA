package chapter6;

/**
 * Created by USER on 8/8/2016.
 */
public class Eg6_11_TestRandomCharacter {

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = Eg6_10_RandomCharacter.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}
