package chapter6;

/**
 * Created by USER on 8/10/2016.
 */
public class Ex6_9_ConversionsBetweenFeetAndMeters {
    public static void main(String []args){
        System.out.printf("%s%15s   |%10s%15s","Feet","Meters","Meters","Feet\n");
        System.out.println("=================================================");

        double foot=0;
        double meter=0;

        footToMeter(foot);
        meterToFoot(meter);

        for (int f = 1,m = 20; f <= 10; f++,m = m +5) {
            System.out.printf("%.1f%15.3f | %10.1f%15.3f\n",
                    (float) f, footToMeter(f),
                    (float) m, meterToFoot(m));
        }
    }

    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
