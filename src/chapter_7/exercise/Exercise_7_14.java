package chapter_7.exercise;

/**
 * varargs in java
 */
public class Exercise_7_14 {
    public static void main(String[] args) {

        int result;

         result = product(1, 2, 3, 4, 5, 6, 7 );

        System.out.println("sums -> " + result);

    }

    private static int product(int... args) {
        int result = 1;
        for(int i = 0; i < args.length; i++) {
            result *= args[i];
        }

        return result;
    }

}
