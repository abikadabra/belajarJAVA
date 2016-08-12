package chapter5;

/**
 * Created by USER on 8/2/2016.
 */
public class Ex5_40_SimulationHeadsAndTails {
    public static void main(String[]args){

        int head=0;
        int tail=0;
        int cek =0;
        for (int i = 0;i<=1000000;i++){
            cek = (int)(Math.random()*2);

            if (cek == 0){
                head++;
            }else {
                tail++;
            }
        }
        System.out.println("head :"+head);
        System.out.println("tail :"+tail);
    }
}
