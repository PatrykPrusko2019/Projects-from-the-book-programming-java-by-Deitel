package chapter_7.exercise;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 *
 counting the sum of 100 elements, we copy the content to the 34 element table
 */
public class Exercise_7_8_countingSumOf100Elements {

    static SecureRandom rand = new SecureRandom();
    public static void main(String[] args) {



        double[] tabDouble = new double[100];

        for(int i = 0; i < tabDouble.length; i++) {
            tabDouble[i] = rand.nextDouble() * 100 + 1;
        }


        //c) zliczenie sumy 100 elementowej

        double sum = 0;
        for(int i = 0; i < tabDouble.length; i++) {
            sum += tabDouble[i];
        }
        System.out.printf("sum all elements -> %.2f %n", sum);

        for(double d : tabDouble) {
            System.out.printf("%.2f %n" , d);
        }

        //d
        methodExercise();

        //e min max
        minMaxValue(tabDouble);


    }

    private static void minMaxValue(double[] tab) {

        double min = tab[0], max = tab[0];

        for(int i = 0; i < tab.length; i++) {

            if(tab[i] < min) {
                min = tab[i]; // min value
            } else if(tab[i] > max) {
                max = tab[i];
            }

        }
        System.out.printf("min -> %.2f , max -> %.2f ", min, max);
    }

    private static void methodExercise() {
        int[] tab11 = new int[11];
        for(int i = 0; i < tab11.length; i++) {
            tab11[i] = i + 1;
        }

        //kopiujemy zawartosc do 34 elementowej tablicy

        int[] tab34 = Arrays.copyOf(tab11, 34);
        System.out.println("tablica 34 elementowa : ");
        for(int i : tab34) {
            System.out.println(i);
        }


    }
}
