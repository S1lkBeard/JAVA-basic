package Final_01_02_03_04;

import java.util.Scanner;

public class Final_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite kolichestvo strok");
        int n = in.nextInt();
        String[] msv = new String[n];
        String buffer = "";
        System.out.println("Vvedite tekst strok");
        int maxx = 0;
        int str = 0;
        for (int i = 0; i < n; i++) {
            msv[i] = in.next();
        }
        for (int i = 0; i < n; i++) {
            buffer = "";
            for (int j = 0; j < msv[i].length(); j++) {
                if (!buffer.contains(String.valueOf(msv[i].charAt(j)))) {
                    buffer += msv[i].charAt(j);
                }
            }
            if (buffer.length() > maxx) {
                maxx = buffer.length();
                str = i;
            }
        }
        System.out.println(msv[str]);
    }
}
