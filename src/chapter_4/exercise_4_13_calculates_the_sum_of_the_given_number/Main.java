package chapter_4.exercise_4_13_calculates_the_sum_of_the_given_number;

import java.util.Scanner;

/**
 * calculates the sum of the given number
 */
public class Main {
    public static void main(String[] args) {

        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }

        System.out.println("sums of 100 numbers -> " + result);


        ///////////////////

        //dowolna liczba

        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean isInt;

        do {
            System.out.println("sprubuj jeszcze raz podaj liczbe :");

            isInt = sc.hasNextInt();
            if(isInt) {
                number = sc.nextInt();
            }
            sc.nextLine();

        }while(! isInt); //jesli jest nie true -> daje false i wychodzi z do while

        int result_2 = 0;

        while (number > 0) {
            result_2 += number;
            number--;
        }

        System.out.println("sums of "+ number +" numbers -> " + result_2);

    }
}
