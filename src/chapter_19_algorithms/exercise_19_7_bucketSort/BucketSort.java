package rozdzial_19.exercise_github.exercise_19_7_bucketSort;

import java.security.SecureRandom;

/**
 * use of the bucket sort algorithm
 */
public class BucketSort {

    public static void main(String[] args) {


        new BucketSort().start();
    }

    public void start() {

        // first test of the array

        int[][] array = createArray();

        System.out.println("array before sorting: ");
        showArray(array);

        sortArraysUsingBucketSortingAlgorithm(array);

        System.out.println("\narray after bucket sorting: ");
        showArray(array);

        // second test of the array with random numbers
        int[][] array_random = createRandomArray();

        System.out.println("\n\narray with random values before sorting: ");
        showArray(array_random);

        sortArraysUsingBucketSortingAlgorithm(array_random);

        System.out.println("\narray with random values after bucket sorting: ");
        showArray(array_random);

    }

    /**
     * creates a two-dimensional array and supplements with random values
     * @return
     */
    private int[][] createRandomArray() {
        int[][] array_random = new int[10][10];

        returnsCompletedArray(array_random);

        return array_random;
    }

    private void returnsCompletedArray(int[][] array_random) {
        SecureRandom r = new SecureRandom();

        for(int i = 0; i < array_random.length; i++) {
            array_random[i] = r.ints(10, -1000, 1000).toArray(); //complements the sub-array with 10 random numbers
        }

    }

    private int[][] createArray() {
        int[][] array = new int[10][10];

        array[0] = new int[]{3, 10, 15, 6, 7, 4, 9, 77, 8, 6};
        array[1] = new int[]{8, 3, 17, -101, 25, 7, 99, 160, 600, 765};
        array[2] = new int[]{35, 101, 15, 16, 77, 544, 99, 717, 8, 6};
        array[3] = new int[]{13, 110, 15, 6, 17, 24, 49, 577, 338, 64};
        array[4] = new int[]{31, 10, 151, 6, 7, 14, 29, -771, 82, 63};
        array[5] = new int[]{37, 150, 15, 6, -47, 4, 49, 677, 58, 106};
        array[6] = new int[]{3, 1, 115, 611, 71, 4, 9, 772, 83, 62};
        array[7] = new int[]{3, 110, -1125, 326, 47, 4, 9, 277, 8, 336};
        array[8] = new int[]{3, 107, 15, 0, 74, 433, 9, 0, 83, 6};
        array[9] = new int[]{3, 10, 154, 0, 74, 4, 95, 77, 83, 16};

        return array;
    }


    private void sortArraysUsingBucketSortingAlgorithm(int[][] array) {
        deleteNegativeNumbersInArray(array); // converts negative numbers to positive
        for(int[] tabToSort : array) {
            sort(tabToSort); //sorts a one-dimensional array
        }
    }

    private void deleteNegativeNumbersInArray(int[][] array) {
        for(int[] tab : array) {
            for(int i = 0; tab.length > i; i++) {
                if(tab[i] < 0) {
                    tab[i] = tab[i] * (-1);
                }
            }
        }
    }

    private void showArray(int[][] tab) {
        for(int i = 0; i < tab.length; i++) {
            System.out.printf("array [%d] :\n", i);
            for(int j = 0; j < tab[i].length; j++) {
                System.out.printf("%6d", tab[i][j] );
            }
            System.out.println();
        }
    }

    public void sort(int[] tabToSort) {


        int maxOfDigits = lookingForMaxDigit(tabToSort); //searches for the number with the highest number of digits

        for(int k = 0; k < maxOfDigits; k++) { // divides into unity, decimal, hundredths
            int[][] bucketsArray = new int[10][tabToSort.length];
            for (int i = 0; i < tabToSort.length; i++) {

                if(tabToSort[i] == 0) continue; // if the value is 0 then do nothing, next number

                String valueStr = String.valueOf(tabToSort[i]);
                char[] arrayOfChars = valueStr.toCharArray();

                if(arrayOfChars.length > k ) {
                    int digit = Integer.valueOf( String.valueOf(arrayOfChars[arrayOfChars.length-1 - k]) ); //takes a digit from the left, e.g. 100 -> gets the first 0, the second 0, the last 1
                    putInArrayBuckets(bucketsArray[digit], tabToSort[i]);
                } else {
                    putInArrayBuckets(bucketsArray[0],tabToSort[i]);
                }

            }

            copyToOriginArray(tabToSort, bucketsArray); //copy again to the original array from buckets
        }

    }

    /**
     * copying the new order of the table
     * @param tabToSort
     * @param bucketsArray
     */
    private void copyToOriginArray(int[] tabToSort, int[][] bucketsArray) {
        int j = -1;
        int zeros = checkHowManyZeros(tabToSort);
        j += zeros;
        for(int[] tab : bucketsArray) {
            for(int i = 0; i < tab.length; i++) {

                if(tab[i] != 0) {
                  tabToSort[++j] = tab[i];
                  if(tabToSort.length-1 == j) return ;
                }
            }
        }
    }

    /**
     *
     * check how many zeros and complete the first indexes
     * with zeros for the given table
     * @param tabToSort
     * @return
     */
    private int checkHowManyZeros(int[] tabToSort) {
        int counter = 0;
        for(int value : tabToSort) {
            if(value == 0) counter++;
        }
        if(counter > 0) {
            for(int i = 0; i < counter; i++) { // completes the arrays with zeros at the beginning
                tabToSort[i] = 0;
            }
        }

        return counter;
    }

    /**
     * searches for the number with the most number of digits
     * @param tabToSort
     * @return
     */
    private int lookingForMaxDigit(int[] tabToSort) {
        int max = Integer.MIN_VALUE;
        for(int search : tabToSort) {
             max = Math.max(search, max);
        }
        int result = (String.valueOf(max)).length();
        return result;
    }

    private void putInArrayBuckets(int[] tab, int value) {
        for(int i = 0; i < tab.length; i++) {
            if( tab[i] == 0) {
                tab[i] = value;
                break;
            }
        }
    }


}
