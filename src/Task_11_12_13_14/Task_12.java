package Task_11_12_13_14;

public class Task_12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean result1;
        boolean result2;
        boolean result3;
        result1 = str.contains("Java");
        result2 = str.startsWith("I like");
        result3 = str.endsWith("!!!");
        if ((result1 = true) && (result2 = true) && (result3 = true)) {
            System.out.println(str.toUpperCase());
        }
        String result4 = str.replace('a', 'o');
        System.out.println(result4.substring(7,11));
    }
}
