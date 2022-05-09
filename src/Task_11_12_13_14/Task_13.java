package Task_11_12_13_14;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite stroku iz slov, razdelennih probelami");
        String a = in.nextLine();
        String b;
        String c;
        int count = 0;
        b = a.replaceAll("[а-яА-Я0-9]", "");
        c = b.replaceAll("\\s+", " ");
        if (c.length() > 1) {
            count++;
            for (int i = 0; i < c.length(); i++) {
                if (c.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(c);
        System.out.println("Kolichestvo slov, sostoyashcih iz latinici = " + count);
    }
}
