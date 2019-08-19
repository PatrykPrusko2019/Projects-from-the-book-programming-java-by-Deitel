package chapter_7.exercise.exercise_7_29_FibonacciString;

/**
 * highest value of fibonacci sequence
 */
public class Exercise_7_29_FibonacciString_b {
    public static void main(String[] args) {


        System.out.println("displays the fibonacci string:");
        methodFibonacci();

    }

    // 0 1 -> 1, 2, 3, 5, 8 ... etc
    // 0 1 2 3
    private static void methodFibonacci() {
        long first = 0, second = 0, resultOfTwoValues = 0;
        long max;
        long i = 0;
        while (i >= 0) {

            if (i == 0) {
                first = i;
            }
            if (i == 1) {
                second = i;
            }

            //first + second = result -> first(this is value second) + second(this is value result) = result
            // 0 + 1 = 1; 1 + 1 = 2; 1 + 2 = 3;
            if (i > 1) { // i = 2

                max = resultOfTwoValues;

                resultOfTwoValues = first + second;
                if (resultOfTwoValues > 0) {

                    first = second;
                    second = resultOfTwoValues;
                } else { // show max value
                    System.out.println("maximum value of Finnobaci String -> " + max);
                    break; //exit the loop
                }
            }

            i++;
        }


    }


}

