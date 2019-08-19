package chapter_4.exercise_4_23_finding_2_largest_numbers_out_of_10_given;

import java.util.Scanner;

//finding 2 largest numbers out of 10 given
public class Main {
    private static int number;
    private static int largest_1;
    private static int largest_2;
    private static int counter = 5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int helpValue = 0;

        for(int i = 0; i < counter; i++) {

            System.out.println("podaj liczbe : ");
            number = sc.nextInt();



            if(largest_2 < number && largest_2 < largest_1) {
                largest_2 = number;
            } else if(largest_1 < number) {
                largest_1 = number;
            }
            }



        System.out.println("najwieksza podana liczba to : " + largest_1 + ", druga " + largest_2);


    }
}
