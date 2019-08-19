package chapter_4.exercise_4_38_calculates_the_factorial;

import java.util.Scanner;

/**
 *
 Poznaj wymowę
 calculates the factorial
 */
public class Silnia {

    public static void main(String[] args) {

        silnia();


    }

    private static void silnia() {
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj silnie: ");
        int sum = 1;

        int silnia = sc.nextInt();
        sc.nextLine();
        int show_silnia = silnia;

        while (silnia > 0) {

            sum *= silnia;
            silnia--;
        }

        if(show_silnia < 0) {
            System.out.println("silnia " + show_silnia + " n! -> " + show_silnia);
        } else {
            System.out.println("silnia " + show_silnia + " n! -> " + sum);
        }
    }
}
