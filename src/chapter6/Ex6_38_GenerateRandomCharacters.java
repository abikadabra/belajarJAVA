package chapter6;

/**
 * Created by USER on 8/22/2016.
 */
public class Ex6_38_GenerateRandomCharacters {
    public static void main(String[]args){

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0)
                System.out.println(Eg6_10_RandomCharacter.getRandomCharacter('A', 'Z'));
            else
                System.out.print(Eg6_10_RandomCharacter.getRandomCharacter('A', 'Z'));
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0)
                System.out.println(Eg6_10_RandomCharacter.getRandomCharacter('0', '9'));
            else
                System.out.print(Eg6_10_RandomCharacter.getRandomCharacter('0', '9'));
        }
    }
}
