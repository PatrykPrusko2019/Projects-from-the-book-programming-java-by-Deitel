package rozdzial_20.exercise.exerciseToGit.chapter_20.exercise_20_4_selection_sort;

/**
 * Sort using the generalized method by selecting Selection Sort.
 * As a test, it creates 6 arrays of the Float, Integer, Double, String, Character type.
 * The selectionSort () method then sorts the given arrays.
 * The printsArray () method then displays the given arrays.
 *
 *
 * program operation:
 *
 * 6 arrays before sorting:
 *
 * arrayFloat:
 * 	5.1		3.6		4.2		11.1		19.0		7.2
 * arrayInteger:
 * 	5		3		4		11		19		7
 * arrayDouble:
 * 	5.1		3.4		4.7		11.0		19.8		7.3
 * arrayString:
 * 	Blazej		Anna		Lucjan		Kacper		Patrycja
 * arrayCharacter:
 * 	b		c		a		z		m
 * 6 arrays after sorting:
 *
 * arrayFloat:
 * 	3.6		4.2		5.1		7.2		11.1		19.0
 * arrayInteger:
 * 	3		4		5		7		11		19
 * arrayDouble:
 * 	3.4		4.7		5.1		7.3		11.0		19.8
 * arrayString:
 * 	Anna		Blazej		Kacper		Patrycja		Lucjan
 * arrayCharacter:
 * 	a		b		c		m		z
 *
 * Process finished with exit code 0
 *
 *
 */
public class GeneralizedMethodSelectionSort {
    public static void main(String[] args) {

        new GeneralizedMethodSelectionSort().start();

    }

    private void start() {
        //przyjmuje sortuje i wyswietla 2 tablice Integer i Float -> sortowanie przez wybieranie Selection Sort

        Float[] arrayFloat = new Float[] {5.1F, 3.6F, 4.2F, 11.1F, 19.0F, 7.2F};
        Integer[] arrayInteger = new Integer[] { 5, 3, 4, 11, 19, 7};
        Double[] arrayDouble = new Double[] { 5.1, 3.4, 4.7, 11.0, 19.8, 7.3};
        String[] arrayString = new String[] {"Blazej", "Anna", "Lucjan", "Kacper", "Patrycja"};
        Character[] arrayCharacter = new Character[] { 'b', 'c', 'a', 'z', 'm' };

        System.out.println("6 arrays before sorting: \n");

        printsArray(arrayFloat, "arrayFloat");
        printsArray(arrayInteger, "arrayInteger");
        printsArray(arrayDouble, "arrayDouble");
        printsArray(arrayString, "arrayString");
        printsArray(arrayCharacter, "arrayCharacter");

        selectionSort( arrayFloat);
        selectionSort( arrayInteger);
        selectionSort( arrayDouble);
        selectionSort( arrayString);
        selectionSort( arrayCharacter);

        System.out.println("6 arrays after sorting: \n");

        printsArray(arrayFloat, "arrayFloat");
        printsArray(arrayInteger, "arrayInteger");
        printsArray(arrayDouble, "arrayDouble");
        printsArray(arrayString, "arrayString");
        printsArray(arrayCharacter, "arrayCharacter");



    }

    /**
     * displays the contents of an array
     * @param array
     * @param <T>
     */
    private <T extends Object> void printsArray(T[] array, String name) {
        System.out.println(name + ": ");
        for(T value : array) {
            System.out.printf("\t%s\t", value);
        }
        System.out.println();
    }


    /**
     * generalized method using selection sort
     * @param array
     * @param <T>
     * @return
     */
    private <T extends Comparable<T>> T[] selectionSort(T[] array ) {

        int smallestIndex = 0;
        for(int i = 0; i < array.length; i++) {
            T smallest = array[i];
            for(int index = i+1; index < array.length; index++) {
                T next = array[index];

                if(next.compareTo(smallest) < 0) { // for example: [1] - [0] -> 3 - 5 = -2 -> i.e. -2 <0, so smallest is greater than next then replace
                    smallest = next;
                    smallestIndex = index;
                }
            }

            swap(array , i , smallestIndex);
        }
        return  array;
    }


    /**
     * swap values ​​when left side is greater than right
     * @param array
     * @param first
     * @param second
     * @param <T>
     */
    private <T extends Comparable<T>> void swap(T[] array, int first, int second) {
       T temporary = array[first];
       array[first] = array[second];
       array[second] = temporary;
    }

}
