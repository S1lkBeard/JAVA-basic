package Final_01_02_03_04;

import java.util.Scanner;

public class Final_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite kurs dollara");
        float krs = in.nextFloat();
        System.out.println("Vvedite summu v rublyah");
        float smm = in.nextFloat();
        System.out.println("Itogo v dollarah = " + String.format("%.2f", smm/krs));
    }
}
