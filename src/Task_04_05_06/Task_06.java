package Task_04_05_06;

import java.util.Scanner;

public class Task_06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vyberite fizicheskuyu velichinu: 1 - massa, 2 - rasstoyanie");
        int fv = in.nextInt();
        if (fv == 1) {
            System.out.println("Vyberite edinicu izmereniya: 1 - kg, 2 - funt, 3 - pud");
            int ei = in.nextInt();
            if (ei == 1 | ei == 2 | ei == 3) {
                int eii = ei;
                System.out.println("Vvedite chislo");
                float c = in.nextFloat();
                switch (eii) {
                    case 1:
                        System.out.println(c * 1 + " kg = " + c * 2.2 + " funt = " + c * 0.061 + " pud");
                        break;
                    case 2:
                        System.out.println(c * 1 + " funt = " + c * 0.45 + " kg = " + c * 0.028 + " pud");
                        break;
                    case 3:
                        System.out.println(c * 1 + " pud = " + c * 16.38 + " kg = " + c * 36.11 + " funt");
                        break;
                }
            }
            else {
                System.out.println("Vybrana nekorrektnaya edinica izmereniya. Povtorite popytku");
            }
        }
        else if (fv == 2) {
            System.out.println("Vyberite edinicu izmereniya: 1 - metr, 2 - yard, 3 - fut");
            int ei = in.nextInt();
            if (ei == 1 | ei == 2 | ei == 3) {
                int eii = ei;
                System.out.println("Vvedite chislo");
                float c = in.nextFloat();
                switch (eii) {
                    case 1:
                        System.out.println(c * 1 + " metr = " + c * 1.09 + " yard = " + c * 3.28 + " fut");
                        break;
                    case 2:
                        System.out.println(c * 1 + " yard = " + c * 0.91 + " metr = " + c * 3 + " fut");
                        break;
                    case 3:
                        System.out.println(c * 1 + " fut = " + c * 0.3 + " metr = " + c * 0.33 + " yard");
                        break;
                }
            }
            else {
                System.out.println("Vybrana nekorrektnaya edinica izmereniya. Povtorite popytku");
            }
        }
        else {
            System.out.println("Vybrana nekorrektnaya fizicheskaya velichina. Povtorite popytku");
        }
    }
}
