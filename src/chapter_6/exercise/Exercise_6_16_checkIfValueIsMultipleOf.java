package chapter_6.exercise;

import java.util.Scanner;

/**
 *
 checks if the value is a multiple of
 */
public class Exercise_6_16_checkIfValueIsMultipleOf {
    public static void main(String[] args) {

        int first = selectTheValues();
        int second = selectTheValues();

       boolean result = isMultiple(first, second); // if second value is multiple for first value !!!
        System.out.println("the number second -> " + second + " for number first -> " + first + " is " + result + " is multiple");
    }

    private static int selectTheValues() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int number = 0;
        while(! exit) {
            System.out.println("give me a number of integer : " );
            exit = sc.hasNextInt();
            if(exit) {
                number = sc.nextInt();
                sc.nextLine();
                System.out.println("select the number -> " + number + "\n");
            } else {
                System.out.println("wrong value ...");
                sc.nextLine();
            }
        }
        return number;
    }

    private static boolean isMultiple(int first, int second) {

        if(second % first == 0) {
            return true;
        } else {
            return false;
        }


    }
}
