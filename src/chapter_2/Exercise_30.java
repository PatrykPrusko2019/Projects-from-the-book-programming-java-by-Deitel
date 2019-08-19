package chapter_2;

import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //30
        System.out.println("give me a value with five digits "); //digits -> cyfry
        int number = sc.nextInt();

        if( (number < 10000) || (number > 99999) ) {
            System.out.println("number is false !!!");
        } else {

            int[] tabDigits = new int[5];

            for(int i = tabDigits.length-1 , j = 10; i >= 0; i-- ) { //przypisuje od ostatniego indeksu tablicy od [4]
                tabDigits[i] = number % j;//przypisujemy ostatnia liczbe do indeksu
                number = number / j;//usuwamy ostatnia liczbe
                System.out.println(tabDigits[i]);
            }

            for(int i = 0; i < tabDigits.length; i++) {
                System.out.printf("%d   " , tabDigits[i]);
            }
        }

        //31
        System.out.println("*****************");
        System.out.printf("%s\t%s\t%s%n", "liczba", "kwadrat", "szescian");

        for(int i = 0; i <= 10; i++) {
            System.out.printf("%d\t\t%d\t\t%d%n", i, (i * i), (i * i * i) );
        }

        //32

        int a = 10, b = -10, c = 0, d = 1001, e = -999;

        int[] tab5Value = new int[]{a, b, c, d, e};
        for(int i = 0; i < tab5Value.length; i++) {

            if (tab5Value[i] == 0) { System.out.println("liczba zero \t" + tab5Value[i]); }

            else if (tab5Value[i] > 0) { System.out.println("liczba dodatnia \t" + tab5Value[i]); }

            else  { System.out.println("liczba ujemna \t" + tab5Value[i]); }
        }
    }
}
