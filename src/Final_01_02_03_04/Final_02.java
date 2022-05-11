package Final_01_02_03_04;

import java.util.Scanner;

public class Final_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite uravnenie formata #+x=#");
        String urv = in.nextLine();
        char smv1;char smv2;char smv3;char smv4;char smv5;
        smv1 = urv.charAt(0);smv2 = urv.charAt(1);smv3 = urv.charAt(2);smv4 = urv.charAt(3);smv5 = urv.charAt(4);
        boolean rsl1;boolean rsl3;boolean rsl5;
        rsl1 = Character.isLetter(smv1);rsl3 = Character.isLetter(smv3);rsl5 = Character.isLetter(smv5);
        int[] msv = new int[5];
        for (int i = 0; i < 5; i++) {
            msv[i] = Character.getNumericValue(urv.charAt(i));
        }
        //Следующее условие создано на случай, если пользователь введет больше одной переменной
        if (((rsl1 == true) & (rsl3 == true)) || ((rsl1 == true) & (rsl5 == true)) || ((rsl3 == true) & (rsl5 == true))) {
            System.out.println("Vvedeno slishkom mnogo peremennih");
        }
        else if (rsl1 == true) {
            if (smv4 == '=') {
                switch (smv2) {
                    case '+':
                        System.out.println(msv[4] - msv[2]);
                        break;
                    case '-':
                        System.out.println(msv[4] + msv[2]);
                        break;
                    default:
                        System.out.println("Vveden nevernii simvol");
                        break;
                }
            }
            else {
                System.out.println("Ne vveden znak ravenstva");
            }
        }
        else if (rsl3 == true) {
            if (smv4 == '=') {
                switch (smv2) {
                    case '+':
                        System.out.println(msv[4] - msv[0]);
                        break;
                    case '-':
                        System.out.println(msv[0] - msv[4]);
                        break;
                    default:
                        System.out.println("Vveden nevernii simvol");
                        break;
                }
            }
            else {
                System.out.println("Ne vveden znak ravenstva");
            }
        }
        else if (rsl5 == true) {
            if (smv4 == '=') {
                switch (smv2) {
                    case '+':
                        System.out.println(msv[0] + msv[2]);
                        break;
                    case '-':
                        System.out.println(msv[0] - msv[2]);
                        break;
                    default:
                        System.out.println("Vveden nevernii simvol");
                        break;
                }
            }
            else {
                System.out.println("Ne vveden znak ravenstva");
            }
        }
    }
}
