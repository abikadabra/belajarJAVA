package chapter6;

/**
 * Created by USER on 8/10/2016.
 */
public class Ex6_8_ConversionsBetweenCelsiusAndFahrenheit {
    public static void main(String[]args){
        System.out.printf("%s%15s%9s%12s%15s","Celsius","Fahrenheit","|","Fahrenheit","Celsius\n");
        System.out.println("=====================================================================");


        double celsius = 0;
        double fahrenheit = 0;

        celsiusToFahrenheit(celsius);
        fahrenheitToCelsius(fahrenheit);

        for (int cels = 40, fahr = 120; cels >= 31; cels--, fahr = fahr - 10) {
            System.out.printf("%-15.1f%-15.1f|    %-15.1f%-15.2f\n",
                    (float) cels, celsiusToFahrenheit(cels),
                    (float) fahr, fahrenheitToCelsius(fahr));
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
