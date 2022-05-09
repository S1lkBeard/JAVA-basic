package Task_11_12_13_14;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite pervoe chislo");
        String a = in.nextLine();
        Integer a1 = Integer.valueOf(a);
        System.out.println("Vvedite vtoroe chislo");
        Integer b = in.nextInt();
        Integer result;
        result = a1.compareTo(b);
        switch (result) {
            case 1:
                System.out.println("Pervoe chislo bol'she vtorogo i ravno = " + a1);
                double c = b.doubleValue();
                System.out.println("Vtoroe chislo ravno = " + c);
                break;
            case -1:
                System.out.println("Vtoroe chislo bol'she pervogo i ravno = " + b);
                double с = a1.doubleValue();
                System.out.println("Vtoroe chislo ravno = " + с);
                break;
            default:
                System.out.println("Pervoe chislo ravno vtoromu");
                break;
        }
    }
}
