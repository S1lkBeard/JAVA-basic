package Final_01_02_03_04;

import java.util.Scanner;

public class Final_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sidit ded, vo sto shub odet, kto ego razdevaet, tot slezy prolivaet");
        System.out.println("Est' 3 popitki");
        System.out.println("Vi mojete vvesti 'Podskazka', i vi ee poluchite");
        int chk = 0;
        for (int i = 1; i <= 3; i++) {
            String otvet = in.nextLine();
            if (i == 1) {
                switch (otvet) {
                    case "Podskazka":
                        System.out.println("Virus");
                        i = 2; //данная операция была добавлена для выполнения условия, что
                        // у пользователя нет права на ошибку после использования подсказки
                        break;
                    case "Zaarhivirovannyj virus":
                        System.out.println("Pravil'no!");
                        chk = 1;
                        break;
                    default:
                        System.out.println("Podumai eshe");
                        break;
                }
            }
            else if (i == 2) {
                switch (otvet) {
                    case "Podskazka":
                        System.out.println("Podskazka uje nedostupna");
                        i = 1; //данная операция была добавлена для того, чтобы
                        //использование подсказки не засчитывалось за попытку
                        break;
                    case "Zaarhivirovannyj virus":
                        System.out.println("Pravil'no!");
                        chk = 1;
                        break;
                    default:
                        System.out.println("Podumai eshe");
                        break;
                }
            }
            else if (i == 3) {
                switch (otvet) {
                    case "Podskazka":
                        System.out.println("Podskazka uje nedostupna");
                        i = 2; //данная операция была добавлена для того, чтобы
                        //использование подсказки не засчитывалось за попытку
                        break;
                    case "Zaarhivirovannyj virus":
                        System.out.println("Pravil'no!");
                        chk = 1;
                        break;
                }
            }
            if (i == 3 & chk == 0) {
                System.out.println("Obidno, prihodi v drugoj raz");
                break;
            }
            if (chk == 1) {
                break;
            }
        }
    }
}


