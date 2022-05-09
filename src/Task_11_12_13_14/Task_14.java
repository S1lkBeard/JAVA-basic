package Task_11_12_13_14;

import java.util.Random;

public class Task_14 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] msv = new int[15];
        int min = msv[0];
        int max = msv[0];
        for (int i = 0; i < msv.length; i++) {
            msv[i] = rnd.nextInt(-20, 20);
            System.out.print(msv[i] + " ");
            if (msv[i] < min) {
                min = msv[i];
            }
            if (msv[i] > max) {
                max = msv[i];
            }
            if (i == msv.length-1) {
                System.out.println();
                System.out.println("Minimal'noe znachenie massiva = " + min);
                System.out.println("Maximal'noe znachenie massiva = " + max);
            }
        }
        int result;
        result = Math.max(Math.abs(min), Math.abs(max));
        System.out.println("Naibol'shee znachenie po modoly iz min i max = " + result);
    }
}
