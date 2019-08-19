package chapter_6.exercise;

import java.util.Scanner;

/**
 * minimum double value
 */
public class Exercise_6_23_minDoubleValue {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double first, second, third;
        first = selectTheNumber();
        second = selectTheNumber();
        third = selectTheNumber();

        System.out.println("min value -> " + minimum3(first, second, third) );

        //second way
        System.out.println("min value -> " + minimum3_second_way(first, second, third) );
    }

    private static double minimum3(double first, double second, double third) {

        double min = first;

        if(first > second) {
            min = second;
            if(second > third) {
                min = third;
            }
        } else if(first > third) {
            min = third;
            if(third > second) {
                min = second;
            }
        } else {
            min = first;
        }
        return min;
    }

    private static double selectTheNumber() {
        boolean exit = false;
        double number = 0;
        while(! exit) {
            System.out.println("select the number of Double: ");
            exit = sc.hasNextDouble();
            if(exit) {
                number = sc.nextDouble();
                sc.nextLine();
            } else {
                System.out.println("wrong value ...");
                sc.nextLine();
            }
        }
        return number;

    }

    //second way
    private static double minimum3_second_way(double first, double second, double third) {

       double resultMinValue = Math.min(first, second);
       resultMinValue = Math.min(resultMinValue, third);
       return resultMinValue;
    }
}
