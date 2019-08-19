package chapter_6.exercise;

import java.util.Scanner;

/**
 * calculates circle area
 */
public class Exercise_6_20_calculatesCircleArea {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.printf( "circle area -> %.2f",  circleArea(enterTheRadius()) );



    }

    private static double enterTheRadius() {
        boolean exit = false;
        double radius = 0;
        while(! exit) {

            System.out.println("enter the radius of circle : ");
            boolean isDouble = sc.hasNextDouble();
            if(isDouble) {
                radius = sc.nextDouble();
                sc.nextLine();
                exit = true;
            } else {
                System.out.println("wrong value ...");
                sc.nextLine();
            }
        }
        return radius;
    }

    //pole kola
    private static double circleArea(double radius ){

        return Math.PI * (radius * radius);

    }
}
