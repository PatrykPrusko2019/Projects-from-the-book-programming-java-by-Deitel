package rozdzial_19.exercise.exercise_19_10_QuickSort;


/**
 * the use of quick sort, consisting in:
 * 1. getPartition method (indexStart, indexEnd) -> sets division based on given value and splits into two subarrays.
 * First left subarray values ​​less than split number, right subarray values ​​greater than split number.
 * 2. quickSortHelper method (leftIndex, rightIndex) -> sorts left subarrays, then right.
 * 3. Finally, it displays the given array sorted.
 *
 * program operation:
 *
 * array before sorting:
 * the contents of the array:
 * 37	 2	 6	 4	 89	 8	 10	 12	 68	 45
 * array after sorting:
 * the contents of the array:
 * 2	 4	 6	 8	 10	 12	 37	 45	 68	 89
 *
 * Process finished with exit code 0
 *
 */
public class QuickSort {

    private Integer[] data;

    public static void main(String[] args) {
        new QuickSort().start();
    }


    private void start() {
        data = new Integer[] { 37, 2, 6, 4, 89, 8, 10, 12, 68, 45 };



        System.out.println("array before sorting: ");
        showArray(data);

        quickSort(data);

        System.out.println("array after sorting: ");
        showArray(data);


    }

    private <T> void showArray(T[] data) {
        System.out.printf("the contents of the array:%n");
        for(T element : data) {
            System.out.printf("%s\t " , element);
        }
        System.out.println();
    }

    private <T> void quickSort(Integer[] data) {

         int partition = getPartition(0, data.length-1); // ustawia podzial i tworzy 2 podtablice

        quickSortHelper(0, partition-1); // sortuje podtablice lewa
        quickSortHelper(partition+1, data.length-1); //sortuje podtablice prawa


    }

    /**
     *
     * returns the partition index number and splits into 2 subarrays. The first smaller
     * values ​​than the division number, the right array larger values
     * @param indexStart
     * @param indexEnd
     * @return
     */
    private int getPartition(int indexStart, int indexEnd) {

        while(indexStart < indexEnd) {

            while(true) {
                if(data[indexStart] > data[indexEnd]) {
                    swap(indexStart, indexEnd); //change the smaller value to the left side
                    break;
                } else if(data[indexStart] == data[indexEnd]) break;
                indexEnd--;
            }

            while(true) {
               if (data[indexEnd] < data[indexStart]) {
                   swap(indexEnd, indexStart); // change the larger value to the right side
                   break;
               } else if(data[indexEnd] == data[indexStart]) break;
               indexStart++;
            }

        }
        return indexStart;
    }


    /**
     * quick sort recursive method
     * @param leftIndex
     * @param rightIndex
     */
    private void quickSortHelper(int leftIndex, int rightIndex) {

        while(leftIndex < rightIndex) { //exit

            while (true) {
                if(data[leftIndex] > data[rightIndex]) {
                    swap(leftIndex, rightIndex);

                    quickSortHelper(leftIndex, rightIndex-1);
                } else if (data[rightIndex] == data[leftIndex] ) {
                    break;
                }
                rightIndex--;
            }

            while(true) {
                if(data[rightIndex] < data[leftIndex]) {
                    swap(rightIndex, leftIndex);

                    quickSortHelper(rightIndex, leftIndex+1);
                } else if (data[rightIndex] == data[leftIndex] ) {
                    break;
                }
                leftIndex++;
            }

        }
    }

    /**
     * swap values ​​in a given array
     * @param left
     * @param right
     */
    private void swap(int left, int right) {
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }


}
