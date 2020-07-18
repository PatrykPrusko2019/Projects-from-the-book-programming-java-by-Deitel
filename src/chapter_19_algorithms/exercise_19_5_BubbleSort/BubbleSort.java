package chapter_19_algorithms.exercise_19_5_BubbleSort;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *A program that tests the Bubble Sort algorithm.
 */
public class BubbleSort {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        IntStream numbers  = random.ints(30, 1, 101);
        int[] array = numbers.toArray();

        System.out.println(Arrays.toString(array));

        new BubbleSort().bubbleSort(array);

        System.out.println(Arrays.toString(array));


    }

    public void bubbleSort(int[] array) {

        int firstValue , secondValue;
        int counter = 0;

        for(int i = 0; i < array.length-1; i++) {

            for(int j = 0; j < array.length-1; j++) {
                firstValue = array[j];
                secondValue = array[1+j];
                if(firstValue > secondValue ) {
                    array[j] = secondValue;
                    array[1+j] = firstValue;
                }
                counter++;
            }

        }
        System.out.println("inner loop pass counter -> " + counter);

    }
}
