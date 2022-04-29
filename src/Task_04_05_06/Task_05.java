package Task_04_05_06;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite 1-oe chislo");
        float x = in.nextFloat();
        System.out.println("Vvedite '+', '-', '*' ili '/'");
        String op = in.next();
        System.out.println("Vvedite 2-oe chislo");
        float y = in.nextFloat();
        float calc;
        switch (op) {
            case "+": calc = x + y;
                System.out.println(calc);
                break;
            case "-": calc = x - y;
                System.out.println(calc);
                break;
            case "*": calc = x * y;
                System.out.println(calc);
                break;
            case "/": calc = x / y;
                System.out.println(calc);
                break;
            default:
                System.out.println("Vveden nekorrektnyj matematicheskij simvol");
        }
    }
}

