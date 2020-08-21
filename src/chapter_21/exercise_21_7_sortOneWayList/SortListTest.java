package rozdzial_20.exercise.exerciseToGit.chapter_21.exercise_21_7_sortOneWayList;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * tests a one-way list and sorts values ​​in ascending order before inserting a given node.
 *
 * program operation:
 *
 * Regular array contents: [45, 34, 63, 24, 89, 76, 44, 73, 70, 33, 11, 78, 58, 42, 2, 44, 67, 72, 82, 76, 39, 24, 37, 36, 64]
 *
 * Creating a new one-way list and sorting the values in ascending order
 *
 *
 * Sorting one-way list:
 *  2	11	24	24	33	34	36	37	39	42	44	44	45	58	63	64	67	70	72	73	76	76	78	82	89
 *
 * the contents of the index [ 6 ] of a one-way list: 36
 * the size of a one-way list : 25
 *
 * Process finished with exit code 0
 *
 */
public class SortListTest {
    public static void main(String[] args) {

        SecureRandom r = new SecureRandom();

        IntStream intStream = r.ints(25, 1, 101); // range 1 - 100
        int[] arrays = intStream.toArray(); // creates arrays with 25 random numbers (1 - 100)


        SortedList<Integer> sortedList = new SortedList<>("Sorting one-way list");

        for( int i = 0; i < arrays.length; i++) {
            sortedList.insertNewValueAndSortToList( arrays[i] );
        }

        System.out.println("Regular array contents: " + Arrays.toString(arrays));

        System.out.println("\nCreating a new one-way list and sorting the values in ascending order\n\n");

        sortedList.showTheList();

        System.out.println( "\n\nthe contents of the index [ " + 6 + " ] of a one-way list: " + sortedList.returnsListValueFromGivenIndex(6) );

        System.out.println( "the size of a one-way list : " + sortedList.getSize());



    }
}
