package Task_07_08_09_10;

import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite luboe cheloe polojitel'noe chislo");
        int n = in.nextInt();
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (!(i % 2 == 0)) {
                    sum = sum + i;
                }
            }
            System.out.println("Summa nechetnih chisel ot 1 do n = " + sum);
        }
        else {
            System.out.println("Vi vveli nevernoe znachenie");
        }
    }
}
