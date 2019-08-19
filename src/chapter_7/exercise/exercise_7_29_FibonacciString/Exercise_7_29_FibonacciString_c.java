package chapter_7.exercise.exercise_7_29_FibonacciString;

/**
 * highest value of fibonacci sequence by type DOUBLE result
 */
public class Exercise_7_29_FibonacciString_c {
    public static void main(String[] args) {


        System.out.println("displays the fibonacci string:");
        methodFibonacci();

    }

    // 0 1 -> 1, 2, 3, 5, 8 ... etc
    // 0 1 2 3
    private static void methodFibonacci() {
        double first = 0, second = 0, resultOfTwoValues = 0;
        double max;
        int i = 0;
        while(i >= 0) {

            if(i == 0) { first = i; System.out.println(" value of Finnobaci String DOUBLE -> " + first);}
            if(i == 1) { second = i; System.out.println(" value of Finnobaci String DOUBLE -> " + second);}

            //first + second = result -> first(this is value second) + second(this is value result) = result
            // 0 + 1 = 1; 1 + 1 = 2; 1 + 2 = 3;
            if(i > 1) { // i = 2

                max = resultOfTwoValues;

                resultOfTwoValues = first + second;
                if(resultOfTwoValues < Double.MAX_VALUE) {
                    System.out.println(" value of Finnobaci String DOUBLE -> " + resultOfTwoValues);
                    first = second;
                    second = resultOfTwoValues;
                } else { // show max value
                    System.out.println("************************************\nmaximum value of Finnobaci String -> " + max + "\n************************************");
                    break; //exit the loop
                }
            }

            i++;
        }



    }



}

