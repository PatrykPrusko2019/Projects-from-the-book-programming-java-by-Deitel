package chapter_7.exercise.exercise_7_29_FibonacciString;

import java.util.Scanner;

public class Exercise_7_29_FibonacciString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isInt = false;
        int value = 0;

        while( ! isInt) {
            System.out.println("give me a number : ");
            isInt = sc.hasNextInt();
            if (isInt) {
                value = sc.nextInt();
            } else {
                System.out.println("wrong value ... please again");
            }
            sc.nextLine();
        }

        System.out.println("displays the fibonacci string:");
        methodFibonacci(value);

    }

    // 0 1 -> 1, 2, 3, 5, 8 ... etc
    // 0 1 2 3
    private static void methodFibonacci(int value) {
        int first = 0, second = 0, resultOfTwoValues = 0;
        int counter = 1;
        for(int i = 0; i < value; i++, counter++) {

                if(i == 0) { first = i; System.out.println(counter + " : value of fibonacci string -> :\t" + i);}
                if(i == 1) { second = i;System.out.println(counter + " : value of fibonacci string -> :\t" + i); }

                                                    //first + second = result -> first(this is value second) + second(this is value result) = result
                                                     // 0 + 1 = 1; 1 + 1 = 2; 1 + 2 = 3;
            if(i > 1) {
                resultOfTwoValues = first + second;
                if(resultOfTwoValues > 0) {
                    System.out.println(counter + " : value of fibonacci string -> :\t" + resultOfTwoValues);
                    first = second;
                    second = resultOfTwoValues;
                } else {
                    System.out.println("end of display, because the value is already wrong");
                    break; //exit the loop
                }
            }

        }



    }
}
