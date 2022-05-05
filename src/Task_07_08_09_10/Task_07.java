package Task_07_08_09_10;

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite razmer massiva");
        int rzm = in.nextInt();
        int msv[] = new int[rzm];
        System.out.println("Vvedite dannie massiva");
        for (int i = 0; i < rzm; i++) {
            msv[i] = in.nextInt();
        }
        int x = 1;
        int y = 2;
        int z = 3;
        for (int i = 0; i < rzm; i++) {
            if ((msv[i] == x) || (msv[i] == y) || (msv[i] == z)) {
                System.out.println("Dannoe znachenie imeetsya v konstantah");
                break;
            }
        }
    }
}
