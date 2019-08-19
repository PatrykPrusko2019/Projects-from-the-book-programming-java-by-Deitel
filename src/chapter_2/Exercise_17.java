package chapter_2;

import java.util.Scanner;

/**
 * shows the results of 3 numbers
 */
public class Exercise_17 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("give me first number : ");
        int first = sc.nextInt();
        System.out.println("give me second number : ");
        int second = sc.nextInt();
        System.out.println("give me second number : ");
        int third = sc.nextInt();

        System.out.println("* iloczyn -> " + (first * second * third) );
        System.out.println("+ suma -> " + (first + second + third) );
        System.out.println("srednia -> " + ( (first + second + third) / 3 ) );


        //max
        int maxValue;
        if((first > second) && (first > third)) {
            maxValue = first;
        } else if((second > first) && (second > third)) {
            maxValue = second;
        } else {
            maxValue = third;
        }

        //min
        int minValue;
        if((first < second) && (first < third)) {
            minValue = first;
        } else if((second < first) && (second < third)) {
            minValue = second;
        } else {
            minValue = third;
        }

        System.out.println("min -> " + minValue);
        System.out.println("max -> " + maxValue);











    }
}
