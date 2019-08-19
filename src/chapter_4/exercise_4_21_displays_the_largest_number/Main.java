package chapter_4.exercise_4_21_displays_the_largest_number;

import java.util.Scanner;

/**
 *
 displays the largest number
 */
public class Main {
    //counter,number, largest
    private static int number;
    private static int largest;
    private static int counter = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int helpValue = 0;

        for(int i = 0; i < counter; i++) {

            System.out.println("podaj liczbe : ");
            number = sc.nextInt();

            if(largest < number) {
                largest = number;
            }

        }

        System.out.println("najwieksza podana liczba to : " + largest);


    }
}
