package rozdzial_20.exercise.exerciseToGit.exercise_21_8_merged_two_one_way_lists;


import java.security.SecureRandom;
import java.util.stream.IntStream;

/**
 *
 * Concatenate and sort 2 one-way lists with merge (), and concatenate and unsort 2 one-way lists
 * with mergeWithoutSort (). Testing the merge () and mergeWithoutSort () methods,
 * then creating different types of lists with their ascending sort,
 * and testing the mergeWithoutSort () method and the sort () method on 2 String lists.
 *
 */
public class MethodMergeTest<E> {
    public static void main(String[] args) {

        SecureRandom r = new SecureRandom();

        IntStream intStream = r.ints(25, 1, 101); // range 1 - 100
        int[] arrays = intStream.toArray(); // creates arrays with 25 random numbers (1 - 100)


        //first way
        SortedList<Integer> firstList = new SortedList<>("first list");

        for( int i = 0; i < arrays.length; i++) {
            firstList.insertNewValueAndSortToList( arrays[i] );
        }

        firstList.showTheList();

        //second way
        intStream = r.ints(25, 1, 101);
        arrays = intStream.toArray();

        Integer[] test = new Integer[arrays.length];
        for(int i = 0; i < arrays.length; i++) {
            test[i] = arrays[i];
        }

        SortedList<Integer> secondList = new SortedList<>("second list", test);

        secondList.showTheList();


        //combine 2 one-way lists and sort them

        firstList.merge(secondList); //combines
        System.out.println("\n\ncombine 2 one-way lists and sort them:");
        firstList.showTheList();
        System.out.println("\nsize of new list: " + firstList.getSize());

        firstList.mergeWithoutSort(secondList); //joins without sorting
        System.out.println("concatenation of 2 lists without sorting:");
        firstList.showTheList();
        System.out.println("\n size: " + firstList.getSize() );

        firstList.sort(); //sorts the unsorted given one-way list

        System.out.println("\nsorted list: ");
        firstList.showTheList();
        System.out.println("\n size: " + firstList.getSize() );

        System.out.println("test method: display the contents of the " + firstList.getName() +
                ", from index [ " + 7 +" ]:" + firstList.returnsListValueFromGivenIndex(7) );


        /////////////////////////////////
        // tests the combination of two String lists


        SortedList<String> stringListFirst = new SortedList<>("stringListFirst", new String[]{ "beza", "anna", "wac", "bro" });
        SortedList<String> stringListSecond = new SortedList<>("stringListSecond", new String[]{ "sabina", "anna", "jeden", "bro" });

        System.out.println("\n\ntests the two list of Strings:");
        stringListFirst.showTheList();
        stringListSecond.showTheList();

        System.out.println("\n\ntests the combination of two String lists, without sorting:");
        stringListFirst.mergeWithoutSort(stringListSecond); // tests the combination of two String lists, without sorting
        stringListFirst.showTheList();

        System.out.println("\n\nstring list after sort: ");
        stringListFirst.sort(); // sorts
        stringListFirst.showTheList();
        System.out.println("\n\n\n\ntests creating new lists and sorting of different types: \n\n");






        ////////////////////////
        //tests creating new lists and sorting of different types


        stringListFirst.showTheList();


        SortedList<Character> charList = new SortedList<>("character list", new Character[]{'b', 'a', 'w', 't'});

        charList.showTheList();

        SortedList<Double> doubleList = new SortedList<>("double list", new Double[]{24.7, 24.5, 27.8, 7.9, 88.7});

        doubleList.showTheList();

        SortedList<Float> floatList = new SortedList<>("float list", new Float[]{24.7F, 24.5F, 27.8F, 7.9F, 88.7F});

        floatList.showTheList();

        SortedList<Short> shortList = new SortedList<>("short list", new Short[]{24, 23, 27, 7, 88} );

        shortList.showTheList();

        SortedList<Byte> byteList = new SortedList<>("byte list", new Byte[]{13, 11, 77, 66, 122} );

        byteList.showTheList();

        SortedList<Long> longList = new SortedList<>("long list", new Long[]{13L, 9L, 4L, 77L, 66L} );

        longList.showTheList();

        SortedList<Integer> integerList = new SortedList<>("integer list", new Integer[]{13, 9, 7, 122, 77} );

        integerList.showTheList();

    }


}
