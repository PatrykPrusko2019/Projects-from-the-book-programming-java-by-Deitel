package chapter_19_algorithms.exercise_19_6_better_version_BubbleSort;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * A program that tests the Bubble Sort algorithm. Adding a boolean exit variable
 * to shorten the algorithm, and adding the variable i to the inner loop.
 * There is an improvement in the speed of the algorithm.
 */
public class BubbleSort_version_two {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        IntStream numbers  = random.ints(30, 1, 101); //creates a 30-element array with random values ​​between 1 and 100
        int[] array = numbers.toArray();

        System.out.println(Arrays.toString(array));

        new BubbleSort_version_two().bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    public void bubbleSort(int[] array) {

        int firstValue , secondValue;
        int counter = 0;
        boolean exit = false;

        for(int i = 0; i < array.length-1; i++) {

            for(int j = 0; j < array.length-1 - i; j++) { //subtracts the value of i, because after the inner loop is finished,
                                                            // it pushes the next larger value to the end of the array
                firstValue = array[j];
                secondValue = array[1+j];
                if(firstValue > secondValue ) {
                    array[j] = secondValue;
                    array[1+j] = firstValue;
                    exit = true;
                }
                counter++;
            }
            if(exit == false) { //if no replacement, finish the algorithm, it means that the values ​​are already sorted
                break;
            } else {  //if it was replaced, replace it with false
                exit = false;
            }
        }
        System.out.println("inner loop pass counter -> " + counter);

    }
}
