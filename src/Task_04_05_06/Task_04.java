package Task_04_05_06;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x");
        float x = in.nextFloat();
        System.out.println("Enter y");
        float y = in.nextFloat();
        System.out.println("Enter z");
        float z = in.nextFloat();
        float xyz = (x+y+z)/3;
        System.out.println(xyz);
        double hxyz = Math.floor(xyz/2);
        System.out.println(hxyz);
        if (hxyz > 3) System.out.println("Programma vipolnena korrektno");
    }
}
