package Task_07_08_09_10;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo strok massiva");
        int rzm1 = in.nextInt();
        System.out.println("Vvedite kolichestvo stolbcov massiva");
        int rzm2 = in.nextInt();
        double msv[][] = new double[rzm1][rzm2];
        System.out.println("Vvedite dannie massiva");
        System.out.println("Dannie budut zapolneni sleva navravo, zatem - perehod na sleduyuschuyu stroku");
        for (int i = 0; i < rzm1; i++) {
            for (int j = 0; j < rzm2; j++) {
                msv[i][j] = in.nextDouble();
            }
        }
        System.out.print("[");
        for (int j = 0; j < rzm2; j++) {
            int i = 0;
            if (j == rzm2-1) {
                System.out.println(msv[i][j]*3 + "]");
                break;
            }
            System.out.print(msv[i][j]*3 + ",");
            }
    }
}
