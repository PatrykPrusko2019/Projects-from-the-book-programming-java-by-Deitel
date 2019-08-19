package chapter_4.exercise_4_38_calculates_the_factorial;

import java.util.Scanner;

//szacunkowa wartosc stalej matematycznej
//e = 1 + 1/1! + 1/2! + ..... -> mozliwosc dodanie ulamkow przez usera
public class Next {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("podaj liczbe ulamkow : ");
        int silnia = sc.nextInt();
        sc.nextLine();

        int resultSilnia = 0;

        for(int i = 0; i < silnia; i++) {

            resultSilnia += silnia(silnia - i);
        }

        double finishResult = 1.0 + ( 1.0 / resultSilnia);

        System.out.println("wynik -> e = " + finishResult);


    }



    private static int silnia(int number) {

        int sum = 1;

        int silnia = number;//przypisuje dana silnie

        int show_silnia = silnia;

        while (silnia > 0) {

            sum *= silnia;
            silnia--;
        }

        return sum;
    }

}
