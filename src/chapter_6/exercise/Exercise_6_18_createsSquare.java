package chapter_6.exercise;

import java.util.Scanner;
/**
 * gets the given number of digits and creates a square
 */
public class Exercise_6_18_createsSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(! exit) {

            System.out.println("enter the number to create a square : ");
            boolean isInt = sc.hasNextInt();
            if(isInt) {
                int side = sc.nextInt();
                sc.nextLine();
                squareOfAsterisks(side);
                exit = true;
            } else {
                System.out.println("wrong value ...");
                sc.nextLine();
            }
        }



    }

    private static void squareOfAsterisks( int side ) {
        for(int i = 0; i < side; i++) {
            for(int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
