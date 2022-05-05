package Task_07_08_09_10;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite razmer massiva");
        int rzm = in.nextInt();
        double msv[] = new double[rzm];
        double sum = 0;
        System.out.println("Vvedite dannie massiva");
        for (int i = 0; i < rzm; i++) {
            msv[i] = in.nextDouble();
            sum = sum + msv[i];
        }
        double avg = sum/rzm;
        System.out.println("Summa znachenii massiva = " + sum);
        System.out.println("Srednee arifmeticheskoe elementov massiva = " + avg);
        System.out.print("[");
        for (int i = 0; i < rzm; i++) {
            if (i == rzm-1) {
                System.out.println(msv[i]*avg + "]");
                break;
            }
            System.out.print(msv[i]*avg + ",");
        }
    }
}
