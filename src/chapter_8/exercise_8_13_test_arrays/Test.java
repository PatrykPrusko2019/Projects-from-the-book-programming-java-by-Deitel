package chapter_8.exercise_8_13_test_arrays;

public class Test {
    public static void main(String[] args) {

        IntegerSet integerSet = new IntegerSet();


        int[] tab1 = new int[]{99, 0, 8, 1, 56, 6, 8, 8, 5, 10};
        int[] tab2 = new int[]{92, 1, 77, 17, -1, 2, 9, 18, 10, 11};

        IntegerSet integer1 = new IntegerSet(tab1);

        System.out.println( integer1.toString() );

        IntegerSet integer2 = new IntegerSet(tab2);

        integerSet.interSection(integer1);

        System.out.println( integerSet.toString() );

        integerSet.union(integer1, integer2);

        System.out.println( integerSet.toString() );


        integerSet.deleteElement(13);

        integerSet.deleteElement(18);

        System.out.println( integerSet.toString() );

        IntegerSet integerSet3 = new IntegerSet(27);

        integerSet3.insertElement(integerSet3.getValue());

        System.out.println( integerSet.toString() );

    }
}
