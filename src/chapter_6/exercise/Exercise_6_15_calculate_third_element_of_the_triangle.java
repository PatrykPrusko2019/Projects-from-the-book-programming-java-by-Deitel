package chapter_6.exercise;

import java.util.Scanner;

/**
 *
 * calculate the third element of the triangle
 */
public class Exercise_6_15_calculate_third_element_of_the_triangle {
    public static void main(String[] args) {



        //a do potegi 2 + b do potegi 2 = c do potegi 2

        // 3.0 , 4.0

        double first, second, third;

       first = firstSecondElement();
        System.out.println("first side of the triangle-> " + first);
       second = firstSecondElement();
        System.out.println("second side of the triangle-> " + second);
       third = calcutateThirdElements(first, second);

        System.out.printf("third side of triangle -> %.2f", third);


        //tests

        System.out.println("\n\n\n");
        third = calcutateThirdElements(3, 4);
        System.out.printf("first -> %.2f, second -> %.2f ,third side of triangle -> %.2f %n", first, second, third);

        third = calcutateThirdElements(5, 12);
        System.out.printf("first -> %.2f, second -> %.2f ,third side of triangle -> %.2f %n", first, second, third);

        third = calcutateThirdElements(8, 15);
        System.out.printf("first -> %.2f, second -> %.2f ,third side of triangle -> %.2f %n", first, second, third);

        //other tests
        double result = Math.hypot(5.0, 3.0);
        System.out.println(result);
    }

    private static double firstSecondElement() {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        boolean exit = false;
        while(! exit) { //first element
            System.out.println("give me the side of the triangle :");
            boolean isDouble = sc.hasNextDouble();
            if(isDouble) {
                number = sc.nextDouble();
                sc.nextLine();
                exit = true;
            } else {
                System.out.println("wrong value ...");
                sc.nextLine();
            }
        }
        return number;
    }

    private static double calcutateThirdElements(double first, double second) {
        double third;
        first = Math.pow(first, 2);
        second = Math.pow(second, 2);

        third = first + second;

        third = Math.sqrt(third);

        return third;
    }
}
